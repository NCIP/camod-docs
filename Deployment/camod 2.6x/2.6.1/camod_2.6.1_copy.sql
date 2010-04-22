Delete from IMAGE_TEST i
where i.ABS_CANCER_MODEL_ID is null
And i.IMAGE_ID NOT IN (Select eg.IMAGE_ID
from engineered_gene eg
where eg.IMAGE_ID IS NOT NULL);
		
Update abs_cancer_model abs 
set abs.submitter_id=150063906 
where abs.submitter_id=50057228 or abs.submitter_id=50056983
or abs.submitter_id=237 or abs.submitter_id=56;
		
Update IMAGE_TEST i set i.URL=replace (i.URL,'http://caimage.nci.nih.gov/lizardtech','http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images')  
where i.url LIKE '%.JPG';
		
		
Update IMAGE_TEST i set i.URL=replace (i.URL,'http://caimage.nci.nih.gov/lizardtech','http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images')  
where i.url LIKE '%.jpg';
		
Update IMAGE_TEST i set i.URL=replace (i.URL,'http://caimage.nci.nih.gov/lizardtech','http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images')  
where i.url LIKE '%.png'; 
		
Update IMAGE_TEST i set i.URL=replace (i.URL,'http://caimage.nci.nih.gov/lizardtech','http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images')  
where i.url LIKE '%.gif'; 
		
drop index IMAGEMAGE_URL;
drop index IMAGEMAGE_URL_LWR;

ALTER TABLE IMAGE_TEST MODIFY (URL VARCHAR2(1000));

CREATE INDEX IMAGEMAGE_URL ON IMAGE(URL);

CREATE INDEX IMAGEMAGE_URL_LWR ON IMAGE(LOWER("URL"));
		
delete from image_test i 
where i.URL LIKE '%.cpt';
		
Update engineered_gene eg
set eg.IMAGE_ID = null
where eg.ENGINEERED_GENE_ID = '63';
		
Update Animal_Distributor ad
set ad.NAME = 'NCI Mouse Repository'
where ad.ANIMAL_DISTRIBUTOR_ID = '3';
		
Update Organ_test o 
set o.CONCEPT_CODE=replace (o.CONCEPT_CODE,'\_','\:')  
where o.CONCEPT_CODE LIKE 'ZFA_%';

Update Developmental_stage_test ds 
set ds.CONCEPT_CODE=replace (ds.CONCEPT_CODE,'\_','\:')  
where ds.CONCEPT_CODE LIKE 'ZFS_%';		

commit;

