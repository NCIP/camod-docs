-- Rename GRAFT_INVIVO_RESULT to Transplantation_INVIVO_RESULT

-- Create bkp table to hold data
create table GRAFT_INVIVO_RESULT_bkp as select * from GRAFT_INVIVO_RESULT;

-- Create table with new name
create table Transplantation_INVIVO_RESULT (
  ABS_CANCER_MODEL_ID  NUMBER(19)               NOT NULL,
  INVIVO_RESULT_ID     NUMBER(19)               NOT NULL
);

-- Move data to new table from bkp
Insert into Transplantation_INVIVO_RESULT
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
  


commit;