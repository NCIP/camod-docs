
-- #6812 Change spelling of Motility on Biological Process selection (Therapy)
update BIOLOGICAL_PROCESS bp
set bp.NAME = 'Adhesion, Motility, Invasion, Metastasis'
where bp.BIOLOGICAL_PROCESS_ID = 1;

-- Drop unused tables from database - clean up on all tiers
drop table ABS_CANCER_MODEL_TMP;
drop table DISEASE_MAPPING_STG;
drop table DISEASE_STG;
drop table ENV_CAS_NSC_STG;
drop table GENOTYPE_BKP;
drop table JACKSON_LAB_TMP;
drop table MGITEMP;
drop table MTB_ORGAN_MAP;
drop table MTB_PUBLICATION;
drop table ORGAN_MAPPING_STG;
drop table PUBLICATION_STG;
drop table REPOSITORY_INFO_BKP;
drop table SPECIES_STG;
drop table SPECIES_STRAIN_STG;
drop table STAIN2IMAGE_STG;
drop table STAINING_STG;
drop table STRAIN_RATTUS_STG;
drop table STRAIN_STG;
drop table TAXON_MAPPING_STG;
drop table XENOGRAFT_INVIVO_RESULT_BKP;
drop table JACKSON_LAB_TMP2;

alter table TRANSPLANT_INVIVO_RESULT
rename to TRANSPLANTATION_INVIVO_RESULT;

-- Add rabbit to database
INSERT INTO SPECIES(SPECIES_ID, SCIENTIFIC_NAME,COMMON_NAME, CONCEPT_CODE)  
VALUES (hibernate_sequence.NEXTVAL, 'Oryctolagus cuniculus', 'Rabbit', 'C14264');


commit;



 

