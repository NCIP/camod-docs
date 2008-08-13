
-- #6812 Change spelling of Equus Caballus - start Caballus with a lower case "c"
update species sp
set sp.SCIENTIFIC_NAME = 'Equus caballus'
where sp.SPECIES_ID = 11;

-- #10654 Clean up contact_info set e-mail to null
UPDATE CONTACT_INFO
SET EMAIL = Null
WHERE EMAIL IS NOT NULL;

-- Remove EMAIL from CONTACT_INFO 
Alter table CONTACT_INFO drop column EMAIL;

--  #13898 Renamed OtherLocationURL in micro array data object to url
ALTER TABLE MICRO_ARRAY_DATA
RENAME COLUMN OTHER_LOCATION_URL to URL;

-- Add flag named is_Induced_Mutation_Trigger to ENVIRONMENTAL_FACTOR
alter table ENVIRONMENTAL_FACTOR
ADD is_Induced_Mutation_Trigger       NUMBER(1);

-- update models that previously used dose units no longer selectable
update TREATMENT t
set t.DOSAGE_UNIT = 'ml/animal/injection'
where t.TREATMENT_id = '10009554';

update treatment t
set t.DOSAGE_UNIT = 'microliter/animal/injection'
where t.TREATMENT_id = '50050274';

--  Add RGD_PUB_ID to Publication object for MTB import
alter table PUBLICATION
ADD RGD_PUB_ID       VARCHAR2(255);

-- clean up IM records from EF table to clean up CI adv search dropdown
delete from environmental_factor ef
where ef.ENVIRONMENTAL_FACTOR_ID = '50053159';

delete from environmental_factor ef
where ef.ENVIRONMENTAL_FACTOR_ID = '50057007';

-- clean up Animal Availability records for models with IMSR (test models added)
-- clean up models not deleted correctly through GUI
delete from ANIMAL_AVAILABILITY aa
where aa.ABS_CANCER_MODEL_ID is null;

-- (NOT RUN ON DEV) Update Environmental_Factor and set IS_INDUCED_MUTATION_TRIGGER flag for CE
update Environmental_Factor ef
set IS_INDUCED_MUTATION_TRIGGER = 0
where ef.TYPE IS NOT NULL
and ef.name IS NOT NULL;





commit;



 

