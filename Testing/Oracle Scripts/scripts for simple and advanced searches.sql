
--All models  no criteria entered
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved' and av.release_date < sysdate

select am.abs_cancer_model_id from abs_cancer_model am, availability av where am.AVAILABILITY_ID=av.availability_id 
and  am.STATE='Edited-approved'  and av.release_date < sysdate



-- Model descriptor (querying for all models with the letter C)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select am.abs_cancer_model_id from abs_cancer_model am where upper(am.model_descriptor) LIKE '%C%'



-- Model descriptor (querying for all models with model_descriptor='Msh6 deficient')
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select am.abs_cancer_model_id from abs_cancer_model am where am.model_descriptor='Msh6 deficient'



-- PI name (selected Varmus, Harold from drop down list on simple and advanced search pages)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select am.abs_cancer_model_id from abs_cancer_model am Inner join Party p on am.PRINCIPAL_INVESTIGATOR_ID=p.PARTY_ID 
where upper(p.LAST_NAME) like '%VARMUS%' AND upper(p.FIRST_NAME) like '%HAROLD%' AND p.IS_PRINCIPAL_INVESTIGATOR=1



--Strain (select for all models where strain name includes 129; no such search exists on the simple or advanced search page)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select a.abs_cancer_model_id from abs_cancer_model a Inner join STRAIN s on a.STRAIN_ID=s.STRAIN_ID where upper(s.NAME) like '%129%'OR upper(s.NAME_ALTERN_ENTRY) like '%129%'



--Species (mouse) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select a.abs_cancer_model_id from abs_cancer_model a where a.STRAIN_ID IN (select st.strain_id from strain st where st.species_id=1)



--Species (rattus norvegicus) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select a.abs_cancer_model_id from abs_cancer_model a where a.STRAIN_ID IN (select st.strain_id from strain st where st.species_id=4)


--Species (rattus rattus) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select a.abs_cancer_model_id from abs_cancer_model a where a.STRAIN_ID IN (select st.strain_id from strain st where st.species_id=3)


--Species (zebrafish) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select a.abs_cancer_model_id from abs_cancer_model a where a.STRAIN_ID IN (select st.strain_id from strain st where st.species_id=16)


--Species (hamster) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select a.abs_cancer_model_id from abs_cancer_model a where a.STRAIN_ID IN (select st.strain_id from strain st where st.species_id=6)








--Site of Lesion / Tumor (query for a specific term that the user entered in the free-text field. The GUI is case-insensitive)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist INNER join Organ o on hist.ORGAN_ID = o.ORGAN_ID
where hist.ABS_CANCER_MODEL_ID IS NOT null AND upper(o.NAME) like '%STOMACH%'


select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist, Organ o
where hist.ORGAN_ID=o.ORGAN_ID AND hist.ABS_CANCER_MODEL_ID IS NOT null AND upper(o.NAME) like '%PROSTATE%'



-- 	Diagnosis (free text entry for the term ‘tumor’, no species specified)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist, Disease d
where hist.DISEASE_ID=d.DISEASE_ID AND hist.ABS_CANCER_MODEL_ID IS NOT null AND upper(d.NAME) like '%ORAL CAVITY NEOPLASMS%'  

*TODO
AND d.CONCEPT_CODE IN ( ?? )




-- Phenotype (free text entry for the term ‘succumb’)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select abs.ABS_CANCER_MODEL_ID 
from abs_cancer_model abs, Phenotype ph
where abs.PHENOTYPE_ID=ph.PHENOTYPE_ID 
AND upper(ph.DESCRIPTION) like '%SUCCUMB%'

 



--    Phenotype (free text entry for the term ‘mice succumb to tumors’)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select abs.ABS_CANCER_MODEL_ID 
from abs_cancer_model abs, Phenotype ph
where abs.PHENOTYPE_ID=ph.PHENOTYPE_ID 
AND upper(ph.DESCRIPTION) like '%MICE SUCCUMB TO TUMORS%'


-- PMID (free text entry)

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select acmp.abs_cancer_model_id from abs_can_mod_publication acmp, publication p where acmp.publication_id=p.publication_id and p.pmid=7507074 



-- 	Transgene (checkbox only)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='T'




-- Transgene (specific transgene)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%V-JUN%' AND engineered_gene_type = 'T')




-- Targeted modification (checkbox only)

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='TM'



--  Targeted modification (specific targeted modification)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%P53%' AND engineered_gene_type = 'TM')




-- 	Genomic Segment (pick one from the list)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(clone_designator) LIKE '%PTH-D1%' AND engineered_gene_type = 'GS')





-- 	Induced Mutation (pick one from the list)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg 
WHERE eg.ENGINEERED_GENE_ID IN ( SELECT distinct engineered_gene_id FROM environmental_factor ef, engineered_gene eg
WHERE ef.NAME = 'ENU' AND ef.ENVIRONMENTAL_FACTOR_ID = eg.ENVIRONMENTAL_FACTOR_ID) AND engineered_gene_type = 'IM'


-- CARCINOGENIC INTERVENTION 


-- 	One query for ANTIBODY as carcinogen agent type WITHOUT specifying the agent name)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Antibody' OR ef.type_altern_entry = 'Antibody') )




-- 	One query for ANTIBODY as carcinogen agent type WITH specifying the agent name)

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'Anti-prostaglandin E<sub>2</sub>' OR ef.name_altern_entry = 'Anti-prostaglandin E<sub>2</sub>' )
AND (ef.type = 'Antibody' OR ef.type_altern_entry = 'Antibody') )



-- 	One query for BACTERIA as carcinogen agent type WITHOUT specifying the agent name)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Bacteria' OR ef.type_altern_entry = 'Bacteria') )




-- 	One query for BACTERIA as carcinogen agent type WITH specifying the agent name)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'helicobacter felis' OR ef.name_altern_entry = 'helicobacter felis' )
AND (ef.type = 'Bacteria' OR ef.type_altern_entry = 'Bacteria') )



-- 	One query for chemical / drug as carcinogen agent type WITHOUT specifying the agent name)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Chemical / Drug' OR ef.type_altern_entry = 'Chemical / Drug') )




-- 	One query for chemical / drug as carcinogen agent type WITH specifying the agent name)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = '12-O-tetradecanoylphorbol-13-acetate (TPA)' OR ef.name_altern_entry = '12-O-tetradecanoylphorbol-13-acetate (TPA)' )
AND (ef.type = 'Chemical / Drug' OR ef.type_altern_entry = 'Chemical / Drug') )









-- 	One query for ENVIRONMENT as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Environment' OR ef.type_altern_entry = 'Environment') )



-- 	One query for  ENVIRONMENT as carcinogen agent type WITH specifying the agent name 
-- no data in db for this specific query





-- 	One query for GROWTH FACTOR  as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Growth Factor' OR ef.type_altern_entry = 'Growth Factor') )



-- 	One query for GROWTH FACTOR  as carcinogen agent type WITH specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'interleukin 10' OR ef.name_altern_entry = 'interleukin 10' )
AND (ef.type = 'Growth Factor' OR ef.type_altern_entry = 'Growth Factor') )



-- 	One query for HORMONE as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Hormone' OR ef.type_altern_entry = 'Hormone') )



-- 	One query for HORMONE as carcinogen agent type WITH specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'estradiol' OR ef.name_altern_entry = 'estradiol' )
AND (ef.type = 'Hormone' OR ef.type_altern_entry = 'Hormone') )



-- 	One query for NUTRITION as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Nutrition' OR ef.type_altern_entry = 'Nutrition') )



-- 	One query for NUTRITION as carcinogen agent type WITH specifying the agent name 
-- no data for specific type available




-- 	One query for OTHER as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Other' OR ef.type_altern_entry = 'Other') )



-- 	One query for OTHER as carcinogen agent type WITH specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'splenectomy' OR ef.name_altern_entry = 'splenectomy' )
AND (ef.type = 'Other' OR ef.type_altern_entry = 'Other') )


-- 	One query for PLASMID as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Plasmid' OR ef.type_altern_entry = 'Plasmid') )



-- 	One query for PLASMID as carcinogen agent type WITH specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'Firefly Luciferase & Transposase containing plasmid pPGK-SB13.' OR ef.name_altern_entry = 'Firefly Luciferase & Transposase containing plasmid pPGK-SB13.' )
AND (ef.type = 'Plasmid' OR ef.type_altern_entry = 'Plasmid') )



-- 	One query for RADIATION as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Radiation' OR ef.type_altern_entry = 'Radiation') )



-- 	One query for RADIATION as carcinogen agent type WITH specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = '137Cs' OR ef.name_altern_entry = '137Cs' )
AND (ef.type = 'Radiation' OR ef.type_altern_entry = 'Radiation') )



-- 	One query for  TRANSPOSON as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Transposon' OR ef.type_altern_entry = 'Transposon') )



-- 	One query for  TRANSPOSON as carcinogen agent type WITH specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'Transposase containing plasmid pPGK-SB13. & Sleeping Beauty transposon encoding V12G37Nras' OR ef.name_altern_entry = 'Transposase containing plasmid pPGK-SB13. & Sleeping Beauty transposon encoding V12G37Nras' )
AND (ef.type = 'Transposon' OR ef.type_altern_entry = 'Transposon') )



-- 	One query for VIRAL as carcinogen agent type WITHOUT specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Viral' OR ef.type_altern_entry = 'Viral') )



-- 	One query for VIRAL as carcinogen agent type WITH specifying the agent name 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.name = 'Adenovirus' OR ef.name_altern_entry = 'Adenovirus' )
AND (ef.type = 'Viral' OR ef.type_altern_entry = 'Viral') )








-- Cell line (pick one from the list)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT c.abs_cancer_model_id FROM cell_line c WHERE upper(c.name) like '%M6%'



-- Therapeutic Approaches (checkbox only)

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT ther.abs_cancer_model_id FROM therapy ther WHERE ther.abs_cancer_model_id is not null



-- Therapeutic Approaches (pick one from the list)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ther.abs_cancer_model_id FROM therapy ther 
WHERE ther.therapy_id IN (SELECT t.therapy_id FROM therapy t, agent ag
WHERE t.agent_id = ag.agent_id AND upper(ag.name) like '%FARNESYL TRANSFERASE INHIBITOR%')



-- Metastasis (species independent)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select distinct hp.abs_cancer_model_id from histopathology hp where hp.histopathology_id 
IN (select h.parent_histopathology_id from histopathology h where h.parent_histopathology_id is not null)




-- Transient Interference - Current no data in db
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct t.abs_cancer_model_id FROM transient_interference t WHERE upper(t.targeted_region) like '%%'




-- Tool Strain
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct abs_cancer_model_id FROM abs_cancer_model WHERE is_tool_strain = 1




-- Microarray (Select all)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT abs_cancer_model_id FROM micro_array_data



-- Images
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT abs_cancer_model_id FROM image



-- External Source (pick one from list)
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT am.abs_cancer_model_id FROM abs_cancer_model am WHERE upper(am.EXTERNAL_SOURCE) like '%JAX MTB%'



-- Combinations of the above mentioned queries



 

--ADVANCED SEARCH - COMBINATION SEARCHRES 

-- Find all models that have therapeutic approaches (checkbox) and microarray (checkbox) data 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT ther.abs_cancer_model_id FROM therapy ther WHERE ther.abs_cancer_model_id is not null
INTERSECT
SELECT abs_cancer_model_id FROM micro_array_data


-- Find all models that have therapeutic approaches (checkbox), microarray (checkbox), and image (checkbox) data 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT ther.abs_cancer_model_id FROM therapy ther WHERE ther.abs_cancer_model_id is not null
INTERSECT
SELECT abs_cancer_model_id FROM micro_array_data
INTERSECT
SELECT abs_cancer_model_id FROM image


--Find all mouse models with phenotypes in digestive system and therapeutic approaches (species mouse is determined by the use of the species-specific concept codes) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT ther.abs_cancer_model_id FROM therapy ther WHERE ther.abs_cancer_model_id is not null
INTERSECT
select distinct h.abs_cancer_model_id from histopathology h where h.organ_id IN (select o.organ_id from organ o where o.concept_code 
IN ('C22500','C22502','C22509','C22508','C22510','C22521','C22526','C22527','C22533','C22532','C22528','C22529','C22531','C22530','C22522',
'C22524','C22523','C22525','C22511','C22513','C22514','C22512','C22515','C22517','C22516','C22518','C22519','C22507','C24044','C22639','C22640',
'C22641','C22642','C24043','C24045','C22643','C24041','C22520','C24042','C22501','C22503','C22506','C22505','C22504'))


-- Find rattus norvegicus models with transgene data (checkbox) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select a.abs_cancer_model_id from abs_cancer_model a where a.STRAIN_ID IN (select st.strain_id from strain st where st.species_id=4)
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='T'


-- Find mouse models which received radiation treatments and have skin tumors (use integument system minus mammary gland (C22459) and mammary fat pad (C22550) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select distinct h.abs_cancer_model_id from histopathology h where h.organ_id IN (select o.organ_id from organ o where o.concept_code 
IN ('C22534','C22535','C22543','C22545','C22547','C22546','C22548','C22544','C22537','C22536','C22539','C22541','C22540','C22542','C22538'))
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Radiation' OR ef.type_altern_entry = 'Radiaton') )


-- Find mouse models which received radiation treatments and have skin tumors (use integument system minus mammary gland (C22459) and mammary fat pad (C22550) ) 
-- and which carry transgenes (checkbox) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select distinct h.abs_cancer_model_id from histopathology h where h.organ_id IN (select o.organ_id from organ o where o.concept_code 
IN ('C22534','C22535','C22543','C22545','C22547','C22546','C22548','C22544','C22537','C22536','C22539','C22541','C22540','C22542','C22538'))
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Radiation' OR ef.type_altern_entry = 'Radiaton') )
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='T'


-- Find mouse models which received radiation treatments and have skin tumors (use integument system minus mammary gland (C22459) and mammary fat pad (C22550) ) 
-- and which targeted modifciations (checkbox) 
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select distinct h.abs_cancer_model_id from histopathology h where h.organ_id IN (select o.organ_id from organ o where o.concept_code 
IN ('C22534','C22535','C22543','C22545','C22547','C22546','C22548','C22544','C22537','C22536','C22539','C22541','C22540','C22542','C22538'))
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Radiation' OR ef.type_altern_entry = 'Radiaton') )
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='TM'


-- Find mouse models which received radiation treatments and have skin tumors (use integument system minus mammary gland (C22459) and mammary fat pad (C22550) ) 
-- and which targeted modifciations (checkbox) and carry transgenes (checkbox) 

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select distinct h.abs_cancer_model_id from histopathology h where h.organ_id IN (select o.organ_id from organ o where o.concept_code 
IN ('C22534','C22535','C22543','C22545','C22547','C22546','C22548','C22544','C22537','C22536','C22539','C22541','C22540','C22542','C22538'))
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Radiation' OR ef.type_altern_entry = 'Radiaton') )
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='TM'
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='T'



-- Find mouse models which have the word 'tumor' in the phenotype description, with lesions in the mammary gland and some metastases  (concept code specifies the species)

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select distinct h.abs_cancer_model_id from histopathology h where h.organ_id IN (select o.organ_id from organ o where o.concept_code='C22549')
INTERSECT
select distinct hp.abs_cancer_model_id from histopathology hp where hp.histopathology_id 
IN (select h.parent_histopathology_id from histopathology h where h.parent_histopathology_id is not null)
INTERSECT
select am.ABS_CANCER_MODEL_ID from abs_cancer_model am, Phenotype ph where am.PHENOTYPE_ID=ph.PHENOTYPE_ID AND upper(ph.DESCRIPTION) like '%TUMOR%'


-- Find mouse models which have the word 'tumor' in the phenotype description, with lesions in the mammary gland and some metastases and a PMID of 7507074 
--(concept code specifies the species)

select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select distinct h.abs_cancer_model_id from histopathology h where h.organ_id IN (select o.organ_id from organ o where o.concept_code='C22549')
INTERSECT
select distinct hp.abs_cancer_model_id from histopathology hp where hp.histopathology_id 
IN (select h.parent_histopathology_id from histopathology h where h.parent_histopathology_id is not null)
INTERSECT
select am.ABS_CANCER_MODEL_ID from abs_cancer_model am, Phenotype ph where am.PHENOTYPE_ID=ph.PHENOTYPE_ID AND upper(ph.DESCRIPTION) like '%TUMOR%'
INTERSECT
select acmp.abs_cancer_model_id from abs_can_mod_publication acmp, publication p where acmp.publication_id=p.publication_id and p.pmid=7507074 


--Find models with transgenes (checkbox) and targeted modifications (checkbox)  
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='TM'
INTERSECT
select eg.abs_cancer_model_id from engineered_gene eg where engineered_gene_type='T'


--Find MTB models with Chemical / Drug as carcinogenic agent type  
select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT am.abs_cancer_model_id FROM abs_cancer_model am WHERE upper(am.EXTERNAL_SOURCE) like '%JAX MTB%'
INTERSECT
SELECT distinct ce.abs_cancer_model_id FROM carcinogen_exposure ce 
WHERE ce.environmental_factor_id IN 
(SELECT ef.environmental_factor_id FROM carcinogen_exposure ce, environmental_factor ef
WHERE ce.environmental_factor_id = ef.environmental_factor_id 
AND (ef.type = 'Chemical / Drug' OR ef.type_altern_entry = 'Chemical / Drug') )