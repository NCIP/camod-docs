--KEYWORD SEARCH 
--for the term 'mannary' 
(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved' and av.release_date < sysdate
AND upper(am.model_descriptor) LIKE '%MAMMARY%')

UNION 

(Select am.abs_cancer_model_id from abs_cancer_model am Where am.abs_cancer_model_id in (SELECT distinct ce.abs_Cancer_Model_Id FROM Carcinogen_Exposure ce      			
WHERE ce.environmental_Factor_id IN ( SELECT ef.environmental_factor_id FROM Carcinogen_Exposure ce, Environmental_Factor ef WHERE ce.environmental_Factor_id = ef.environmental_factor_id 
AND upper(ef.name) LIKE '%MAMMARY%'	OR upper(ef.name_Altern_Entry) LIKE '%MAMMARY%' )))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT c.abs_cancer_model_id FROM cell_line c WHERE upper(c.name) like '%MAMMARY%')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ther.abs_cancer_model_id FROM therapy ther 
WHERE ther.therapy_id IN (SELECT t.therapy_id FROM therapy t, agent ag
WHERE t.agent_id = ag.agent_id AND upper(ag.name) like '%MAMMARY%'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select abs.ABS_CANCER_MODEL_ID 
from abs_cancer_model abs, Phenotype ph
where abs.PHENOTYPE_ID=ph.PHENOTYPE_ID 
AND upper(ph.DESCRIPTION) like '%MAMMARY%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
Select am.abs_cancer_model_id from abs_cancer_model am where am.abs_cancer_model_Id 
IN ( SELECT distinct t.abs_Cancer_Model_Id FROM Transient_Interference t WHERE upper(t.targeted_Region) like '%MAMMARY%' ) )


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%MAMMARY%' AND engineered_gene_type = 'T'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%MAMMARY%' AND engineered_gene_type = 'TM'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(clone_designator) LIKE '%MAMMARY%' AND engineered_gene_type = 'GS'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg 
WHERE eg.ENGINEERED_GENE_ID IN ( SELECT distinct eg2.engineered_gene_id FROM environmental_factor ef, engineered_gene eg2
WHERE ef.NAME LIKE '%MAMMARY%' AND ef.ENVIRONMENTAL_FACTOR_ID = eg2.ENVIRONMENTAL_FACTOR_ID) AND engineered_gene_type = 'IM')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist INNER join Organ o on hist.ORGAN_ID = o.ORGAN_ID
where upper(o.NAME) like '%MAMMARY%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist, Disease d
where hist.DISEASE_ID=d.DISEASE_ID AND hist.ABS_CANCER_MODEL_ID IS NOT null AND upper(d.NAME) like '%MAMMARY%' )






--for the term 'test' 
(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved' and av.release_date < sysdate
AND upper(am.model_descriptor) LIKE '%TEST%')

UNION 

(Select am.abs_cancer_model_id from abs_cancer_model am Where am.abs_cancer_model_id in (SELECT distinct ce.abs_Cancer_Model_Id FROM Carcinogen_Exposure ce      			
WHERE ce.environmental_Factor_id IN ( SELECT ef.environmental_factor_id FROM Carcinogen_Exposure ce, Environmental_Factor ef 
WHERE ce.environmental_Factor_id = ef.environmental_factor_id 
AND upper(ef.name) LIKE '%TEST%'	OR upper(ef.name_Altern_Entry) LIKE '%TEST%' )))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT c.abs_cancer_model_id FROM cell_line c WHERE upper(c.name) like '%TEST%')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ther.abs_cancer_model_id FROM therapy ther 
WHERE ther.therapy_id IN (SELECT t.therapy_id FROM therapy t, agent ag
WHERE t.agent_id = ag.agent_id AND upper(ag.name) like '%TEST%'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select abs.ABS_CANCER_MODEL_ID 
from abs_cancer_model abs, Phenotype ph
where abs.PHENOTYPE_ID=ph.PHENOTYPE_ID 
AND upper(ph.DESCRIPTION) like '%TEST%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
Select am.abs_cancer_model_id from abs_cancer_model am where am.abs_cancer_model_Id 
IN ( SELECT distinct t.abs_Cancer_Model_Id FROM Transient_Interference t WHERE upper(t.targeted_Region) like '%TEST%' ) )


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%TEST%' AND engineered_gene_type = 'T'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%TEST%' AND engineered_gene_type = 'TM'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(clone_designator) LIKE '%TEST%' AND engineered_gene_type = 'GS'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg 
WHERE eg.ENGINEERED_GENE_ID IN ( SELECT distinct eg2.engineered_gene_id FROM environmental_factor ef, engineered_gene eg2
WHERE ef.NAME LIKE '%TEST%' AND ef.ENVIRONMENTAL_FACTOR_ID = eg2.ENVIRONMENTAL_FACTOR_ID) AND engineered_gene_type = 'IM')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist INNER join Organ o on hist.ORGAN_ID = o.ORGAN_ID
where upper(o.NAME) like '%TEST%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist, Disease d
where hist.DISEASE_ID=d.DISEASE_ID AND hist.ABS_CANCER_MODEL_ID IS NOT null AND upper(d.NAME) like '%TEST%' )






--for the term 'GENE' 
(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved' and av.release_date < sysdate
AND upper(am.model_descriptor) LIKE '%GENE%')

UNION 

(Select am.abs_cancer_model_id from abs_cancer_model am Where am.abs_cancer_model_id in (SELECT distinct ce.abs_Cancer_Model_Id FROM Carcinogen_Exposure ce      			
WHERE ce.environmental_Factor_id IN ( SELECT ef.environmental_factor_id FROM Carcinogen_Exposure ce, Environmental_Factor ef WHERE ce.environmental_Factor_id = ef.environmental_factor_id 
AND upper(ef.name) LIKE '%MAMMARY%'	OR upper(ef.name_Altern_Entry) LIKE '%GENE%' )))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT c.abs_cancer_model_id FROM cell_line c WHERE upper(c.name) like '%GENE%')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT distinct ther.abs_cancer_model_id FROM therapy ther 
WHERE ther.therapy_id IN (SELECT t.therapy_id FROM therapy t, agent ag
WHERE t.agent_id = ag.agent_id AND upper(ag.name) like '%GENE%'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select abs.ABS_CANCER_MODEL_ID 
from abs_cancer_model abs, Phenotype ph
where abs.PHENOTYPE_ID=ph.PHENOTYPE_ID 
AND upper(ph.DESCRIPTION) like '%GENE%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
Select am.abs_cancer_model_id from abs_cancer_model am where am.abs_cancer_model_Id 
IN ( SELECT distinct t.abs_Cancer_Model_Id FROM Transient_Interference t WHERE upper(t.targeted_Region) like '%GENE%' ) )


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%GENE%' AND engineered_gene_type = 'T'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(name) LIKE '%GENE%' AND engineered_gene_type = 'TM'))

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg WHERE eg.ENGINEERED_GENE_ID IN
(SELECT distinct engineered_gene_id FROM engineered_gene WHERE upper(clone_designator) LIKE '%GENE%' AND engineered_gene_type = 'GS'))


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
SELECT eg.ABS_CANCER_MODEL_ID FROM engineered_gene eg 
WHERE eg.ENGINEERED_GENE_ID IN ( SELECT distinct eg2.engineered_gene_id FROM environmental_factor ef, engineered_gene eg2
WHERE ef.NAME LIKE '%GENE%' AND ef.ENVIRONMENTAL_FACTOR_ID = eg2.ENVIRONMENTAL_FACTOR_ID) AND engineered_gene_type = 'IM')


UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist INNER join Organ o on hist.ORGAN_ID = o.ORGAN_ID
where upper(o.NAME) like '%GENE%')

UNION 

(select am.abs_cancer_model_id from abs_cancer_model am Inner join availability av on am.AVAILABILITY_ID=av.availability_id 
where am.STATE='Edited-approved'  and av.release_date < sysdate
INTERSECT
select hist.ABS_CANCER_MODEL_ID 
from histopathology hist, Disease d
where hist.DISEASE_ID=d.DISEASE_ID AND hist.ABS_CANCER_MODEL_ID IS NOT null AND upper(d.NAME) like '%GENE%' )

