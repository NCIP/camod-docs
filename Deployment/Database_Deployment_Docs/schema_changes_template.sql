-- Add column in table
alter table PUBLICATION
ADD ZFIN_PUB_ID VARCHAR2(255);

-- Drop column in table
Alter table log drop column sub_system;

-- Rename column
ALTER TABLE publication RENAME COLUMN Start_PAGE_tmp to Start_PAGE;

-- Alter data type for column in table
-- 1. Create new column with different name and data type
ALTER TABLE PUBLICATION
ADD END_PAGE_tmp VARCHAR2(4000);

-- 2. Copy data to new column (with new data type)
update publication p
set p.End_PAGE_TMP = p.end_page;

-- 3. Drop old columns with old data type
ALTER TABLE publication drop column Start_PAGE;

-- 4. Alter table column name (removed tmp)
ALTER TABLE publication RENAME COLUMN Start_PAGE_tmp to Start_PAGE;

-- Insert row into table
INSERT INTO SPECIES(SPECIES_ID, SCIENTIFIC_NAME,COMMON_NAME, CONCEPT_CODE)  
VALUES (hibernate_sequence.NEXTVAL, 'Oryctolagus cuniculus', 'Rabbit', 'C14264');


-- Modify Endpoint_Code object name to EndPoint
-- Create bkp table to hold data
create table Endpoint_bkp as select * from Endpoint_Code;

-- Create table with new name
create table endpoint (
   endpoint_id number(19,0) not null,
   code varchar2(255),
   description varchar2(2000),
   primary key (endpoint_id)
);

-- Move data to new table from bkp
Insert into endpoint
 select Endpoint_id, code, description
   from Endpoint_bkp;

-- Drop Endpoint_bkp and Endpoint_code tables
Drop table Endpoint_bkp cascade constraints;
Drop table Endpoint_Code cascade constraints;


-- Add foreign key constraint (automatically deleted when the table was dropped)
Alter table invivo_result add constraint FKC187E8CB887C658A foreign key (endpoint_id) references endpoint;



-- Create Table
CREATE TABLE GRAFT_INVIVO_RESULT
(
  ABS_CANCER_MODEL_ID  NUMBER(19)               NOT NULL,
  INVIVO_RESULT_ID     NUMBER(19)               NOT NULL
);

-- Update data in column
update species sp
set sp.SCIENTIFIC_NAME = 'Meriones unguiculatus'
where sp.SPECIES_ID = 5;

-- Add MicroArray Data for caMOD
INSERT INTO MICRO_ARRAY_DATA ( MICRO_ARRAY_DATA_ID, EXPERIMENT_NAME, EXPERIMENT_ID,
OTHER_LOCATION_URL, ABS_CANCER_MODEL_ID ) VALUES ( 
6, 'Identification of large-scale embryonic and oncogenic transcriptional modules in human colon cancer using mouse models comparisons'
, 1015897590913471, NULL, 50050295);

-- Add rabbit to database
INSERT INTO SPECIES(SPECIES_ID, SCIENTIFIC_NAME,COMMON_NAME, CONCEPT_CODE)  
VALUES (hibernate_sequence.NEXTVAL, 'Oryctolagus cuniculus', 'Rabbit', 'C14264');
 
 -- Add Not Specified for each new species  
INSERT INTO STRAIN(STRAIN_ID, NAME, SPECIES_ID )
Select hibernate_sequence.NEXTVAL, 'Not specified', 
sp.SPECIES_ID 
from species sp 
where sp.SCIENTIFIC_NAME = 'Oryctolagus cuniculus';
   

commit;


