
--for the term 'metastasis' 
(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved' and av.release_date < sysdate
AND upper(am.model_descriptor) LIKE '%METASTASIS%')

UNION 

(Select am.abs_cancer_model_id from abs_cancer_model am Where am.abs_cancer_model_id in (SELECT distinct ce.abs_Cancer_Model_Id FROM Carcinogen_Exposure ce      			
WHERE ce.environmental_Factor_id IN ( SELECT ef.environmental_factor_id FROM Carcinogen_Exposure ce, Environmental_Factor ef WHERE 
ce.environmental_Factor_id = ef.environmental_factor_id 
AND upper(ef.name) LIKE '%METASTASIS%'	OR upper(ef.name_Altern_Entry) LIKE '%METASTASIS%' )))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT c.abs_cancer_model_id FROM cell_line c WHERE upper(c.name) like '%METASTASIS%')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ther.abs_cancer_model_id FROM therapy ther 
WHERE ther.therapy_id IN (SELECT t.therapy_id FROM therapy t, agent ag
WHERE t.agent_id = ag.agent_id AND upper(ag.name) like '%METASTASIS%'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select abs.ABS_CANCER_MODEL_ID 
from abs_cancer_model abs, Phenotype ph
where abs.PHENOTYPE_ID=ph.PHENOTYPE_ID 
AND upper(ph.DESCRIPTION) like '%METASTASIS%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
Select am.abs_cancer_model_id from abs_cancer_model am where am.abs_cancer_model_Id 
IN ( SELECT distinct t.abs_Cancer_Model_Id FROM Transient_Interference t WHERE upper(t.targeted_Region) like '%METASTASIS%' ) )


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%METASTASIS%' AND engineered_gene_type = 'T'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%METASTASIS%' AND engineered_gene_type = 'TM'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(clone_designator) LIKE '%METASTASIS%' AND engineered_gene_type = 'GS'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg 
WHERE eg.ENGINEERED_GENE_ID IN ( SELECT distinct eg2.engineered_gene_id FROM environmental_factor ef, engineered_gene eg2
WHERE ef.NAME LIKE '%METASTASIS%' AND ef.ENVIRONMENTAL_FACTOR_ID = eg2.ENVIRONMENTAL_FACTOR_ID) AND engineered_gene_type = 'IM')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist INNER join Organ o on hist.ORGAN_ID = o.ORGAN_ID
where upper(o.NAME) like '%METASTASIS%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist, Disease d
where hist.DISEASE_ID=d.DISEASE_ID AND hist.ABS_CANCER_MODEL_ID IS NOT null AND upper(d.NAME) like '%METASTASIS%' )

