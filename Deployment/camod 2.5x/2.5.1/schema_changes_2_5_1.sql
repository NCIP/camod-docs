
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


-- Alter data type for column START_PAGE n table
-- 1. Create new column with different name and data type
ALTER TABLE PUBLICATION
ADD START_PAGE_tmp VARCHAR2(4000);

-- 2. Copy data to new column (with new data type)
update publication p
set p.START_PAGE_TMP = p.START_PAGE;

-- 3. Drop old column with old data type
ALTER TABLE publication drop column START_PAGE;

-- 4. Alter table column name (removed tmp)
ALTER TABLE publication RENAME COLUMN START_PAGE_tmp to START_PAGE;


-- Alter data type for column END_PAGE n table
-- 1. Create new column with different name and data type
ALTER TABLE PUBLICATION
ADD END_PAGE_tmp VARCHAR2(4000);

-- 2. Copy data to new column (with new data type)
update publication p
set p.END_PAGE_TMP = p.END_PAGE;

-- 3. Drop old column with old data type
ALTER TABLE publication drop column END_PAGE;

-- 4. Alter table column name (removed tmp)
ALTER TABLE publication RENAME COLUMN END_PAGE_tmp to END_PAGE;



-- Change : to _ for Zebrafish anatomy vocabulary tree
Update 	Organ
Set	concept_code = replace(CONCEPT_CODE, 'ZFA:0', 'ZFA_0');

-- Change : to _ for Zebrafish stage vocabulary tree
Update 	DEVELOPMENTAL_STAGE
Set	concept_code = replace(CONCEPT_CODE, 'ZFS:0', 'ZFS_0');  
   


commit;



 

