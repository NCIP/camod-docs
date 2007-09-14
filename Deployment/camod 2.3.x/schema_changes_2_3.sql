-- Modify EF.type values instead of reloading data

-- Synronize type = Chemical / Drug
UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Chemical / Drug' 
where ef.TYPE_UNCTRL_VOCAB = 'Chemical/Drug' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Synronize type = Growth Factor
UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Growth Factor' 
where ef.TYPE_UNCTRL_VOCAB = 'Growth Factor Type' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Synronize type = Hormone
UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Hormone' 
where ef.TYPE_UNCTRL_VOCAB = 'Hormone Type' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Synronize type = Other
UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Other' 
where ef.TYPE_UNCTRL_VOCAB = 'Other Type' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Radiation Type in newest QA, Stage and Prod script - not in dev
UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Radiation' 
where ef.TYPE_UNCTRL_VOCAB = 'Radiation Type' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Synronize type = Viral
UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Viral' 
where ef.TYPE_UNCTRL_VOCAB = 'Virus' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Add MGI as prefix to mgi_number value
UPDATE MUTATION_IDENTIFIER MI
SET MI.MGI_NUMBER = 'MGI:' || MI.MGI_NUMBER;

-- Add column named zfin_id to Mutation_Identifier
alter table Mutation_Identifier
ADD zfin_Id VARCHAR2(255);

-- Add column named rgd_id to Mutation_Identifier
alter table Mutation_Identifier
ADD rgd_Id VARCHAR2(255);

-- Change column name from mgi_number to mgi_id
ALTER TABLE Mutation_Identifier
RENAME COLUMN mgi_number to mgi_id;

-- Add column named developmental_stage to abs_cancer_model (for Animal_Model)
alter table abs_cancer_model
ADD developmental_stage  VARCHAR2(255);

-- Add column named targetSite to Transient_Interference
alter table Transient_Interference
ADD target_site VARCHAR2(255);

-- Insert animal distributor for models from zfin
INSERT INTO ANIMAL_DISTRIBUTOR (ANIMAL_DISTRIBUTOR_ID, NAME )
VALUES(5, 'ZFIN');

-- Insert Small Molecule option into chemical_class lookup table
INSERT INTO CHEMICAL_CLASS(CHEMICAL_CLASS_ID, NAME)
VALUES(7, 'Small Molecule');

-- Add column named conditioning_regimen  to Abs_Cancer _Model
alter table Abs_Cancer_Model
ADD conditioning_regimen  VARCHAR2(255);

-- Add column named cond_regimen_unctrl_vocab to Abs_Cancer _Model
alter table Abs_Cancer_Model
ADD cond_regimen_unctrl_vocab  VARCHAR2(255);

-- Update stock_number add pre-ceeding 0's
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002020' WHERE ABS_CANCER_MODEL_ID = '49';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '86';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '154';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '250';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002020' WHERE ABS_CANCER_MODEL_ID = '307';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002376' WHERE ABS_CANCER_MODEL_ID = '343';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '434';

UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002080' WHERE ABS_CANCER_MODEL_ID = '106' and animal_distributor_id=2;
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002080' WHERE ABS_CANCER_MODEL_ID = '217' and animal_distributor_id=2;
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '003135' WHERE ABS_CANCER_MODEL_ID = '251' and animal_distributor_id=2;
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '003380' WHERE ABS_CANCER_MODEL_ID = '252' and animal_distributor_id=2;

-- Fix rows with null PI records - set PI to Ulli Wagner to fix
UPDATE ABS_CANCER_MODEL ac 
SET ac.PRINCIPAL_INVESTIGATOR_ID = '56' 
where ac.ABS_CANCER_MODEL_TYPE = 'AM'
and ac.PRINCIPAL_INVESTIGATOR_ID IS NULL;

-- Add column named NAME_UNCTRL_VOCAB to Disease to store other option for Zebrafish dropdown
alter table DISEASE
ADD NAME_UNCTRL_VOCAB VARCHAR2(255);

-- Add column named zfin_number to hold identifier for Zebrafish publications (ex. ZDB-PUB-010207-3)
alter table PUBLICATION
ADD ZFIN_PUB_ID VARCHAR2(255);

-- Create table for developmental stage used for Therapy
create table developmental_stage (
   developmental_stage_id number(19,0) not null,
   name varchar2(255),
   concept_code varchar2(255),
   primary key (developmental_stage_id)
);

alter table Therapy
ADD developmental_stage_id number(19,0);

alter table therapy add constraint FKAF8F6C6936A94812 foreign key (developmental_stage_id) references developmental_stage;

-- Add proteomics_DATA table for future implementation
CREATE TABLE PROTEOMICS_DATA
(
  PROTEOMICS_DATA_ID  NUMBER(19)               NOT NULL,
  EXPERIMENT_NAME      VARCHAR2(255),
  EXPERIMENT_ID        NUMBER(19),
  OTHER_LOCATION_URL   VARCHAR2(255),
  ABS_CANCER_MODEL_ID  NUMBER(19)
);

alter table PROTEOMICS_DATA add constraint FKC3D0BA2B1CC8B88E foreign key (abs_cancer_model_id) references abs_cancer_model;

commit;