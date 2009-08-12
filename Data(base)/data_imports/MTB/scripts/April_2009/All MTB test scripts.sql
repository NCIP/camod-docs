/* Formatted on 2009/08/12 12:33 (Formatter Plus v4.8.6) */
--MTB Data Load Test Script for May 2009 data set

-- Number of models
--Count edited approved MTB models in abs_cancer_model (expected record count =5124)
SELECT COUNT (abs_cancer_model_id) AS edited_approved_mtb_models
  FROM abs_cancer_model
 WHERE external_source = 'Jax MTB' AND state = 'Edited-approved';

 -- Query that compares record counts of step #1 with result of step #2. This query should return no results
SELECT MAX (ROWNUM) AS compare_abs_can_mod_with_mtb
  FROM (SELECT DISTINCT t.strain_general_note, t.strain_key, t.strain_name,
                        t.strain_types, t.treatment_type, t.treatment_agents
                   FROM jackson_lab_tmp2 t)
MINUS
SELECT COUNT (abs_cancer_model_id)
  FROM abs_cancer_model
 WHERE external_source = 'Jax MTB' AND state = 'Edited-approved';


 --Testing if all MTB based caMOD entries have phenotype entries. Expected outcome: no records returned

SELECT a.abs_cancer_model_id, a.phenotype_id
  FROM abs_cancer_model a
 WHERE a.external_source = 'Jax MTB'
   AND a.state = 'Edited-approved'
   AND a.phenotype_id IS NULL;

   --Testing if all MTB based caMOD entries have nomenclature entries. Expected outcome: no records returned 

SELECT a.abs_cancer_model_id
  FROM abs_cancer_model a
 WHERE a.external_source = 'Jax MTB' AND a.state = 'Edited-approved'
MINUS
SELECT abs_cancer_model_id AS nomenclature_acm
  FROM nomenclature n;

  --Histopatholgoy entries 
--This query compares the number of histopathology records created in the caMOD histopathology table with the number of original records received from MTB. The expected outcome is zero meaning that for each zstg_tumor record (minus the records that describe metastases which are identified in the zstg_metastases table) an entry in the caMOD histopathology table was created.
SELECT   (SELECT COUNT (*)
            FROM zstg_tumor)
       - (SELECT COUNT (*)
            FROM zstg_metastases)
       - (SELECT COUNT (*)
            FROM histopathology h
           WHERE h.abs_cancer_model_id IN (
                    SELECT a.abs_cancer_model_id
                      FROM abs_cancer_model a
                     WHERE a.external_source = 'Jax MTB'
                       AND a.state = 'Edited-approved'))
                                                     AS mtb_histology_records
  FROM DUAL;

  --Metastases entries  
  -- This query compares the abs_cancer_model_id for the primary tumor with the abs_cancer_model_id of the metastasis record based on the entries in the zstg_metastases table. If all mappings are correct this query should return no results. If there are mismatches (primary tumor has been assigned to a different abs_cancer_model than the metastases) the records will be listed.

SELECT t.abs_cancer_model_id AS abcm_for_primary,
       t1.abs_cancer_model_id AS abcm_for_metastasis
  FROM zstg_tumor t, zstg_tumor t1, zstg_metastases m
 WHERE t.tumorkey = m.tumorkey
   AND t1.tumorkey = m.metastasiskey
   AND (t.abs_cancer_model_id - t1.abs_cancer_model_id) != 0;


   --This query compares the abs_cancer_model_id for the tumorkey and the metastasiskey and lists records for which the results are not identical. This should return NO RESULTS.
SELECT m.tumorkey, m.metastasiskey, t.abs_cancer_model_id AS abcm_for_primary,
       t1.abs_cancer_model_id AS abcm_for_metastasis
  FROM zstg_tumor t, zstg_tumor t1, zstg_metastases m
 WHERE t.tumorkey = m.tumorkey
   AND t1.tumorkey = m.metastasiskey
   AND (t.abs_cancer_model_id - t1.abs_cancer_model_id) != 0;



   -- Publications  
   -- This query verifies that all MTB models in caMOD are associated with publications. The expected outcome is  no records returned. 
SELECT a.abs_cancer_model_id
  FROM abs_cancer_model a
 WHERE a.external_source = 'Jax MTB'
   AND a.state = 'Edited-approved'
   AND (a.abs_cancer_model_id NOT IN (
                                      SELECT DISTINCT acmp.abs_cancer_model_id
                                                 FROM abs_can_mod_publication acmp)
       );

   -- This query subtracts the number of records in the zstg_tumor_ref table with the number of MTB based records in the abs_can_mod_publication table. For the May 2009 dataset the expected outcome is 1, because the MTB dataset contains an orphan record  
SELECT   (SELECT COUNT (*)
            FROM zstg_tumor_ref)
       - (SELECT COUNT (acmp.abs_cancer_model_id)
            FROM abs_can_mod_publication acmp, abs_cancer_model a
           WHERE (a.external_source = 'Jax MTB'
                  AND a.state = 'Edited-approved'
                 )
             AND a.abs_cancer_model_id = acmp.abs_cancer_model_id)
                                                   AS mtb_publication_records
  FROM DUAL;

  -- Images  - This query subtracts the number of image associated records in the zstg_tumor table with the number of MTB based records in the caMOD image table. The expected outcome is zero 
SELECT   (SELECT COUNT (*)
            FROM zstg_tumor
           WHERE hasimages = 1)
       - (SELECT COUNT (i.image_id)
            FROM image i, abs_cancer_model a
           WHERE (a.external_source = 'Jax MTB'
                  AND a.state = 'Edited-approved'
                 )
             AND a.abs_cancer_model_id = i.abs_cancer_model_id)
                                                         AS mtb_image_records
  FROM DUAL;


  -- Carcinogenic Intervention data 
  --These queries compare the number of the distinct combination of abs_cancer_model (based on tumorkey) and agentkey with the number of entries made in the caMOD carcinogen_exposure table for a specific environmental factor / agent category. The expected outcome of these queries is no records returned.
--Each query can be used to separately count the number of records in the MTB tables and the caMOD tables (queries are separated by "MINUS"

-- Antibody 
(SELECT MAX (ROWNUM) AS antibody
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Antibody')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
               SELECT ef.environmental_factor_id
                 FROM environmental_factor ef
                WHERE ef.type_altern_entry = 'Antibody'
                      OR ef.TYPE = 'Antibody')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));


-- Bacteria  
(SELECT MAX (ROWNUM) AS bacteria
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Bacteria')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
               SELECT ef.environmental_factor_id
                 FROM environmental_factor ef
                WHERE ef.type_altern_entry = 'Bacteria'
                      OR ef.TYPE = 'Bacteria')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));

       -- Chemical / Drug 
(SELECT MAX (ROWNUM) AS chemical_drug
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (
                                        SELECT agentkey
                                          FROM zstg_agent za
                                         WHERE za.agenttype =
                                                             'Chemical / Drug')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
           SELECT ef.environmental_factor_id
             FROM environmental_factor ef
            WHERE ef.type_altern_entry = 'Chemical / Drug'
               OR ef.TYPE = 'Chemical / Drug')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));

       -- Growth Factor 
(SELECT MAX (ROWNUM) AS growth_factor
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (
                                          SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype =
                                                               'Growth Factor')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
           SELECT ef.environmental_factor_id
             FROM environmental_factor ef
            WHERE ef.type_altern_entry = 'Growth Factor'
               OR ef.TYPE = 'Growth Factor')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));
       -- Hormone 
(SELECT MAX (ROWNUM) AS hormone
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Hormone')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
                 SELECT ef.environmental_factor_id
                   FROM environmental_factor ef
                  WHERE ef.type_altern_entry = 'Hormone'
                        OR ef.TYPE = 'Hormone')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));
       -- Other
(SELECT MAX (ROWNUM) AS other
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Other')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
                     SELECT ef.environmental_factor_id
                       FROM environmental_factor ef
                      WHERE ef.type_altern_entry = 'Other'
                            OR ef.TYPE = 'Other')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));
       -- Plasmid  
(SELECT MAX (ROWNUM) AS plasmid
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Plasmid')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
                 SELECT ef.environmental_factor_id
                   FROM environmental_factor ef
                  WHERE ef.type_altern_entry = 'Plasmid'
                        OR ef.TYPE = 'Plasmid')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));
       -- Radiation 
(SELECT MAX (ROWNUM) AS radiation
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Radiation')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
             SELECT ef.environmental_factor_id
               FROM environmental_factor ef
              WHERE ef.type_altern_entry = 'Radiation'
                    OR ef.TYPE = 'Radiation')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));
       -- Signaling Molecule 
(SELECT MAX (ROWNUM) AS signaling_molecule
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (
                                     SELECT agentkey
                                       FROM zstg_agent za
                                      WHERE za.agenttype =
                                                          'Signaling Molecule')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
           SELECT ef.environmental_factor_id
             FROM environmental_factor ef
            WHERE ef.type_altern_entry = 'Signaling Molecule'
               OR ef.TYPE = 'Signaling Molecule')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));
       -- Transposon 
(SELECT MAX (ROWNUM) AS transposon
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Transposon')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
           SELECT ef.environmental_factor_id
             FROM environmental_factor ef
            WHERE ef.type_altern_entry = 'Transposon'
                  OR ef.TYPE = 'Transposon')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));
       -- Viral 
(SELECT MAX (ROWNUM) AS viral
   FROM (SELECT DISTINCT t.abs_cancer_model_id, zta.agentkey
                    FROM zstg_tumor t INNER JOIN zstg_tumor_agent zta ON t.tumorkey =
                                                                           zta.tumorkey
                   WHERE zta.agentkey IN (SELECT agentkey
                                            FROM zstg_agent za
                                           WHERE za.agenttype = 'Viral')))
MINUS
(SELECT COUNT (ce.carcinogen_exposure_id)
   FROM carcinogen_exposure ce
  WHERE ce.environmental_factor_id IN (
                     SELECT ef.environmental_factor_id
                       FROM environmental_factor ef
                      WHERE ef.type_altern_entry = 'Viral'
                            OR ef.TYPE = 'Viral')
    AND abs_cancer_model_id IN (
               SELECT abs_cancer_model_id
                 FROM abs_cancer_model
                WHERE external_source = 'Jax MTB'
                      AND state = 'Edited-approved'));


       -- Agent vs Environmental Factor tables
       -- Compare the number of entries in the zstg_agent table with matching entries in the environmental_factor table. This test verifies that matching entries in the environmental_factor table exist for all MTB agent entries. Should return NO RESULTS.

SELECT COUNT (*) AS comparing_env_factors_mtb
  FROM zstg_agent
MINUS
SELECT COUNT (DISTINCT ef.name_altern_entry)
  FROM zstg_agent za INNER JOIN environmental_factor ef ON RTRIM
                                                              (za.agentnamemod) =
                                                             RTRIM
                                                                (ef.name_altern_entry
                                                                )
       ;
	   
	   -- Identify hibernate_sequence.nextval
	   SELECT hibernate_sequence.NEXTVAL FROM dual; 