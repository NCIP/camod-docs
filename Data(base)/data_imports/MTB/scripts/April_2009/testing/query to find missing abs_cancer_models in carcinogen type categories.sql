-- query to find models for which entries in a certain category should exist - Antibody 

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Antibody')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Antibody' OR ef.type_altern_entry = 'Antibody') ))


-- query to find models for which entries in a certain category should exist - Bacteria  

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Bacteria')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Bacteria' OR ef.type_altern_entry = 'Bacteria') ))


-- query to find models for which entries in a certain category should exist - Chemical / Drug  

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Chemical / Drug')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Chemical / Drug' OR ef.type_altern_entry = 'Chemical / Drug') ))



-- query to find models for which entries in a certain category should exist - Growth Factor 

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Growth Factor')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Growth Factor' OR ef.type_altern_entry = 'Growth Factor') ))



-- query to find models for which entries in a certain category should exist - Hormome 

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Hormone')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Hormone' OR ef.type_altern_entry = 'Hormone') ))




-- query to find models for which entries in a certain category should exist - Other 

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Other')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Other' OR ef.type_altern_entry = 'Other') ))



-- query to find models for which entries in a certain category should exist - Plasmid  

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Plasmid')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Plasmid' OR ef.type_altern_entry = 'Plasmid') ))




-- query to find models for which entries in a certain category should exist - Radiation  

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Radiation')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Radiation' OR ef.type_altern_entry = 'Radiation') ))





-- query to find models for which entries in a certain category should exist - Signaling Molecule 

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Signaling Molecule')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Signaling Molecule' OR ef.type_altern_entry = 'Signaling Molecule') ))



-- query to find models for which entries in a certain category should exist - Transposon  

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Transposon')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Transposon' OR ef.type_altern_entry = 'Transposon') ))


















-- query to find models for which entries in a certain category should exist - Viral 

(select distinct zt.abs_cancer_model_id from zstg_tumor zt where zt.tumorkey in (select zta.tumorkey from zstg_tumor_agent zta where zta.agentkey 
in (select za.agentkey from zstg_agent za where za.agenttype='Viral')))

MINUS

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate and am.external_source = 'Jax MTB'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Viral' OR ef.type_altern_entry = 'Viral') ))






