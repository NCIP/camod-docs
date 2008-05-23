-- Remove the trailing space after the scientific name for species
-- Allows validation to prevent SQL Injection to run correctly

update species sp
set sp.SCIENTIFIC_NAME = 'Meriones unguiculatus'
where sp.SPECIES_ID = 5;

update species sp
set sp.SCIENTIFIC_NAME = 'Mesocricetus auratus'
where sp.SPECIES_ID = 6;

update species sp
set sp.SCIENTIFIC_NAME = 'Cavia porcellus'
where sp.SPECIES_ID = 7;

update species sp
set sp.SCIENTIFIC_NAME = 'Bos taurus'
where sp.SPECIES_ID = 8;

update species sp
set sp.SCIENTIFIC_NAME = 'Canis familiaris'
where sp.SPECIES_ID = 9;

update species sp
set sp.SCIENTIFIC_NAME = 'Capra hircus'
where sp.SPECIES_ID = 10; 

update species sp
set sp.SCIENTIFIC_NAME = 'Equus Caballus'
where sp.SPECIES_ID = 11; 

update species sp
set sp.SCIENTIFIC_NAME = 'Ovis aries'
where sp.SPECIES_ID = 12; 

