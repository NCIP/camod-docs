
-- #6812 Change spelling of Equus Caballus - start Caballus with a lower case "c"
update species sp
set sp.SCIENTIFIC_NAME = 'Equus caballus'
where sp.SPECIES_ID = 11;

-- #10654 Clean up contact_info set e-mail to null
UPDATE CONTACT_INFO
SET EMAIL = Null
WHERE EMAIL IS NOT NULL;

--  #13898 Renamed OtherLocationURL in micro array data object to url
ALTER TABLE MICRO_ARRAY_DATA
RENAME COLUMN OTHER_LOCATION_URL to URL;

-- Add flag named is_Induced_Mutation_Trigger to ENVIRONMENTAL_FACTOR
alter table ENVIRONMENTAL_FACTOR
ADD is_Induced_Mutation_Trigger       NUMBER(1);

