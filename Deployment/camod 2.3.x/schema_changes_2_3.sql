-- Modify EF.type values instead of reloading data
-- Protect disease, organ, microarray, ect.
UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Chemical / Drug' 
where ef.TYPE_UNCTRL_VOCAB = 'Chemical/Drug' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Growth Factor' 
where ef.TYPE_UNCTRL_VOCAB = 'Growth Factor Type' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Hormone' 
where ef.TYPE_UNCTRL_VOCAB = 'Hormone Type' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Other' 
where ef.TYPE_UNCTRL_VOCAB = 'Other Type' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Radiation Type in newest QA, Stage and Prod script - not in dev


UPDATE environmental_factor ef 
SET ef.TYPE_UNCTRL_VOCAB = 'Viral' 
where ef.TYPE_UNCTRL_VOCAB = 'Virus' 
and ef.TYPE_UNCTRL_VOCAB IS NOT NULL;

-- Add column named zfin_Number to Mutation_Identifier
alter table Mutation_Identifier
ADD zfin_Number VARCHAR2(255);

-- Add column named rgd_number to Mutation_Identifier
alter table Mutation_Identifier
ADD rgd_number VARCHAR2(255);

-- Add MGI” as prefix to mgi_number value
UPDATE MUTATION_IDENTIFIER MI
SET MI.MGI_NUMBER = 'MGI:' || MI.MGI_NUMBER;

-- Add column named developmental_stage to abs_cancer_model (for Animal_Model)
alter table abs_cancer_model
ADD developmental_stage  VARCHAR2(255);

-- Add column named site to Transient_Interference
alter table Transient_Interference
ADD site VARCHAR2(255);

-- Insert animal distributor for models from zfin
INSERT INTO ANIMAL_DISTRIBUTOR (ANIMAL_DISTRIBUTOR_ID, NAME )
VALUES(5, 'ZFIN');

-- Insert Small Molecule option into chemical_class lookup table
INSERT INTO CHEMICAL_CLASS(CHEMICAL_CLASS_ID, NAME)
VALUES(7, 'Small Molecule');

-- Add column named developmental_stage to Therapy
alter table Therapy
ADD developmental_stage VARCHAR2(255);

-- Add column named conditioning_regime  to Abs_Cancer _Model
alter table Abs_Cancer_Model
ADD conditioning_regime  VARCHAR2(255);

-- Add column named cond_regime_unctrl_vocab to Abs_Cancer _Model
alter table Abs_Cancer_Model
ADD cond_regime_unctrl_vocab  VARCHAR2(255);

-- Update stock_number add pre-ceeding 0's
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002020' WHERE ABS_CANCER_MODEL_ID = '49';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '86';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002080' WHERE ABS_CANCER_MODEL_ID = '106';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '154';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002080' WHERE ABS_CANCER_MODEL_ID = '217';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '250';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '003135' WHERE ABS_CANCER_MODEL_ID = '251';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '003380' WHERE ABS_CANCER_MODEL_ID = '252';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002020' WHERE ABS_CANCER_MODEL_ID = '307';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002376' WHERE ABS_CANCER_MODEL_ID = '343';
UPDATE ANIMAL_AVAILABILITY SET STOCK_NUMBER = '002373' WHERE ABS_CANCER_MODEL_ID = '434';

-- Fix rows with null PI records
UPDATE ABS_CANCER_MODEL ac 
SET ac.PRINCIPAL_INVESTIGATOR_ID = '56' 
where ac.ABS_CANCER_MODEL_TYPE = 'AM'
and ac.PRINCIPAL_INVESTIGATOR_ID IS NULL;




