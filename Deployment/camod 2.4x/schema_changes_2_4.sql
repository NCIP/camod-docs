-- Rename GRAFT_INVIVO_RESULT to Transplantation_INVIVO_RESULT

-- Create bkp table to hold data
create table GRAFT_INVIVO_RESULT_bkp as select * from GRAFT_INVIVO_RESULT;

-- Create table with new name
create table Transplant_INVIVO_RESULT (
  ABS_CANCER_MODEL_ID  NUMBER(19)               NOT NULL,
  INVIVO_RESULT_ID     NUMBER(19)               NOT NULL
);

-- Move data to new table from bkp
Insert into Transplant_INVIVO_RESULT
 select ABS_CANCER_MODEL_ID, INVIVO_RESULT_ID
   from GRAFT_INVIVO_RESULT_bkp;

-- Drop Endpoint_bkp and Endpoint_code tables
Drop table GRAFT_INVIVO_RESULT_bkp cascade constraints;
Drop table GRAFT_INVIVO_RESULT cascade constraints;

-- Add column named comments to ABS_CANCER_MODEL
alter table ABS_CANCER_MODEL
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to EXPRESSION_FEATURE
alter table EXPRESSION_FEATURE
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to ENVIRONMENTAL_FACTOR
alter table ENVIRONMENTAL_FACTOR
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to GENE_DELIVERY
alter table GENE_DELIVERY
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to PUBLICATION
alter table PUBLICATION
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to CLINICAL_MARKER
alter table CLINICAL_MARKER
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to IMAGE
alter table IMAGE
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to MICRO_ARRAY_DATA
alter table MICRO_ARRAY_DATA
ADD COMMENTS       VARCHAR2(255);

-- Add column named comments to ANIMAL_AVAILABILITY
alter table ANIMAL_AVAILABILITY
ADD COMMENTS       VARCHAR2(255);

-- Add column named PRINCIPAL_INVESTIGATOR_ID to ANIMAL_AVAILABILITY
alter table ANIMAL_AVAILABILITY
ADD PRINCIPAL_INVESTIGATOR_ID   NUMBER(19);
  

-- rename columns using UNCTRL_VOCAB to ALTERN_ENTRY
ALTER TABLE CLINICAL_MARKER
RENAME COLUMN NAME_UNCTRL_VOCAB to NAME_ALTERN_ENTRY;

ALTER TABLE ENVIRONMENTAL_FACTOR
RENAME COLUMN TYPE_UNCTRL_VOCAB to TYPE_ALTERN_ENTRY;

ALTER TABLE ENVIRONMENTAL_FACTOR
RENAME COLUMN NAME_UNCTRL_VOCAB to NAME_ALTERN_ENTRY;

ALTER TABLE GENE_DELIVERY
RENAME COLUMN VIRAL_VECTOR_UNCTRL_VOCAB to VIRAL_VECTOR_ALTERN_ENTRY;

ALTER TABLE ABS_CANCER_MODEL
RENAME COLUMN ADMIN_SITE_UNCTRL_VOCAB to ADMIN_SITE_ALTERN_ENTRY;

ALTER TABLE ABS_CANCER_MODEL
RENAME COLUMN SOURCE_TYPE_UNCTRL_VOCAB to SOURCE_TYPE_ALTERN_ENTRY;

ALTER TABLE ABS_CANCER_MODEL
RENAME COLUMN COND_REGIMEN_UNCTRL_VOCAB to COND_REGIMEN_ALTERN_ENTRY;

ALTER TABLE MODIFICATION_TYPE
RENAME COLUMN NAME_UNCTRL_VOCAB to NAME_ALTERN_ENTRY;

ALTER TABLE SEGMENT_TYPE
RENAME COLUMN NAME_UNCTRL_VOCAB to NAME_ALTERN_ENTRY;

ALTER TABLE SPECIES
RENAME COLUMN SCIENTIFIC_NAME_UNCTRL_VOCAB to SCIENTIFIC_NAME_ALTERN_ENTRY;

ALTER TABLE SPECIES
RENAME COLUMN COMMON_NAME_UNCTRL_VOCAB to COMMON_NAME_ALTERN_ENTRY;

ALTER TABLE STAINING_METHOD
RENAME COLUMN NAME_UNCTRL_VOCAB to NAME_ALTERN_ENTRY;

ALTER TABLE STRAIN
RENAME COLUMN NAME_UNCTRL_VOCAB to NAME_ALTERN_ENTRY;

--Typo in name of column (missing l)
ALTER TABLE TRANSIENT_INTERFERENCE
RENAME COLUMN SOURCE_UNCTR_VOCAB to SOURCE_ALTERN_ENTRY;

ALTER TABLE TRANSIENT_INTERFERENCE
RENAME COLUMN DELIVERY_METHOD_UNCTRL_VOCAB to DELIVERY_METHOD_ALTERN_ENTRY;

ALTER TABLE TRANSIENT_INTERFERENCE
RENAME COLUMN VISUAL_LIGAND_UNCTRL_VOCAB to VISUAL_LIGAND_ALTERN_ENTRY;

ALTER TABLE TREATMENT
RENAME COLUMN ADMIN_ROUTE_UNCTRL_VOCAB to ADMIN_ROUTE_ALTERN_ENTRY;

ALTER TABLE DISEASE
RENAME COLUMN NAME_UNCTRL_VOCAB to NAME_ALTERN_ENTRY;

-- Rename geneID to geneIdentifier
ALTER TABLE SPONTANEOUS_MUTATION
RENAME COLUMN GENE_ID to GENE_IDENTIFIER_ID;

ALTER TABLE ENGINEERED_GENE
RENAME COLUMN GENE_ID to GENE_IDENTIFIER_ID;

CREATE TABLE Gene_Identifier
(
  Gene_Identifier_ID  NUMBER(19)                 NOT NULL,
  Entrez_Gene_ID      VARCHAR2(255)
);

--Migrate data from spontaneous_mutation for gene_identifier
-- Create bkp table to hold data
create table spontaneous_mutation_bkp as select * from spontaneous_mutation;

insert into GENE_IDENTIFIER
 select hibernate_sequence.nextval, GENE_IDENTIFIER_ID
   from spontaneous_mutation_bkp sp
   where sp.GENE_IDENTIFIER_ID IS NOT NULL;   
   
update spontaneous_mutation sp
    set sp.GENE_IDENTIFIER_ID = (
   select gi.GENE_IDENTIFIER_ID
     from gene_identifier gi
      where sp.GENE_IDENTIFIER_ID = gi.ENTREZ_GENE_ID );

drop table spontaneous_mutation_bkp;

--Migrate data from Engineered_gene for gene_identifier
-- Create bkp table to hold data
drop table engineered_gene_bkp;

create table engineered_gene_bkp as select * from engineered_gene;

insert into GENE_IDENTIFIER
 select hibernate_sequence.nextval, GENE_IDENTIFIER_ID
   from engineered_gene_bkp eg
   where eg.GENE_IDENTIFIER_ID IS NOT NULL;
   
DELETE FROM GENE_IDENTIFIER 
WHERE rowid not in (SELECT MIN(rowid) FROM GENE_IDENTIFIER GROUP BY entrez_gene_ID);	
   
update engineered_gene eg
    set eg.GENE_IDENTIFIER_ID = (
   select gi.GENE_IDENTIFIER_ID
     from GENE_IDENTIFIER gi
      where eg.GENE_IDENTIFIER_ID = gi.ENTREZ_GENE_ID ); 
      
drop table engineered_gene_bkp;               
   

-- Update disease_id for rat models
UPDATE histopathology h
SET h.DISEASE_ID = '138'
WHERE h.ABS_CANCER_MODEL_ID = '26' 
and h.HISTOPATHOLOGY_ID = '750';

UPDATE histopathology h
SET h.DISEASE_ID = '138'
WHERE h.ABS_CANCER_MODEL_ID = '30' 
and h.HISTOPATHOLOGY_ID = '945';

UPDATE histopathology h
SET h.DISEASE_ID = '183'
WHERE h.ABS_CANCER_MODEL_ID = '52' 
and h.HISTOPATHOLOGY_ID = '955';

UPDATE histopathology h
SET h.DISEASE_ID = '138'
WHERE h.ABS_CANCER_MODEL_ID is null
and h.HISTOPATHOLOGY_ID = '956';

UPDATE histopathology h
SET h.DISEASE_ID = '10009738'
WHERE h.ABS_CANCER_MODEL_ID = '10009706' 
and h.HISTOPATHOLOGY_ID = '10009737';

UPDATE histopathology h
SET h.DISEASE_ID = '10009844'
WHERE h.ABS_CANCER_MODEL_ID is null
and h.HISTOPATHOLOGY_ID = '10009843';

-- Update organ_id for Zebrafish models
INSERT INTO ORGAN
(organ_id, concept_code, name)
VALUES
(hibernate_sequence.nextval, 'ZFA:0001078', 'Thymus');

UPDATE histopathology h
SET h.ORGAN_ID = (SELECT organ_id from organ o
where o.CONCEPT_CODE = 'ZFA:0001078'
and o.NAME = 'Thymus')
WHERE h.ABS_CANCER_MODEL_ID = '10010598'
and h.HISTOPATHOLOGY_ID = '10010609';

UPDATE histopathology h
SET h.ORGAN_ID = (SELECT organ_id from organ o
where o.CONCEPT_CODE = 'ZFA:0001078'
and o.NAME = 'Thymus')
WHERE h.ABS_CANCER_MODEL_ID = '10010640'
and h.HISTOPATHOLOGY_ID = '10010651';



commit;