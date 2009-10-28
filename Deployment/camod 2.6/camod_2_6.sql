update ENVIRONMENTAL_FACTOR ef
set ef.IS_INDUCED_MUTATION_TRIGGER = '0'
where ef.IS_INDUCED_MUTATION_TRIGGER is null;

-- ran on dev manually - will automate in BDA (Fixed 1730 rows)
update ENVIRONMENTAL_FACTOR ef
set ef.TYPE = ef.TYPE_ALTERN_ENTRY
where ef.TYPE is null
and ef.ENVIRONMENTAL_FACTOR_ID IN (
select ef.ENVIRONMENTAL_FACTOR_ID 
From environmental_factor ef, abs_cancer_model ac, carcinogen_exposure ce 
where ef.ENVIRONMENTAL_FACTOR_ID = ce.ENVIRONMENTAL_FACTOR_ID
and ce.ABS_CANCER_MODEL_ID = ac.ABS_CANCER_MODEL_ID
and ac.EXTERNAL_SOURCE = 'Jax MTB');

-- then null out the typeAlternEntry field (Fixed 1730 rows)
update ENVIRONMENTAL_FACTOR ef
set ef.TYPE_ALTERN_ENTRY = null
where ef.ENVIRONMENTAL_FACTOR_ID IN (
select ef.ENVIRONMENTAL_FACTOR_ID 
From environmental_factor ef, abs_cancer_model ac, carcinogen_exposure ce 
where ef.ENVIRONMENTAL_FACTOR_ID = ce.ENVIRONMENTAL_FACTOR_ID
and ce.ABS_CANCER_MODEL_ID = ac.ABS_CANCER_MODEL_ID
and ac.EXTERNAL_SOURCE = 'Jax MTB');

-- repeat for name and nameAlternEntry fields (Fixed 1723 rows)
update ENVIRONMENTAL_FACTOR ef
set ef.NAME = ef.NAME_ALTERN_ENTRY
where ef.NAME is null
and ef.ENVIRONMENTAL_FACTOR_ID IN (
select ef.ENVIRONMENTAL_FACTOR_ID 
From environmental_factor ef, abs_cancer_model ac, carcinogen_exposure ce 
where ef.ENVIRONMENTAL_FACTOR_ID = ce.ENVIRONMENTAL_FACTOR_ID
and ce.ABS_CANCER_MODEL_ID = ac.ABS_CANCER_MODEL_ID
and ac.EXTERNAL_SOURCE = 'Jax MTB');

-- then null out the typeAlternEntry field (Fixed 1730 rows)
update ENVIRONMENTAL_FACTOR ef
set ef.NAME_ALTERN_ENTRY = null
where ef.ENVIRONMENTAL_FACTOR_ID IN (
select ef.ENVIRONMENTAL_FACTOR_ID 
From environmental_factor ef, abs_cancer_model ac, carcinogen_exposure ce 
where ef.ENVIRONMENTAL_FACTOR_ID = ce.ENVIRONMENTAL_FACTOR_ID
and ce.ABS_CANCER_MODEL_ID = ac.ABS_CANCER_MODEL_ID
and ac.EXTERNAL_SOURCE = 'Jax MTB'); 

-- Delete duplicate (old) entries from micro_array_data table (re-entered from GUI)
DELETE FROM micro_array_data
WHERE experiment_id is not null;

-- Delete disease entries without parent record in histopathology
Delete from disease d 
where d.NAME is null
and d.NAME_ALTERN_ENTRY is null
and d.DISEASE_ID NOT IN
(select disease_id from histopathology h);