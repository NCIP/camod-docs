update ENVIRONMENTAL_FACTOR ef
set ef.IS_INDUCED_MUTATION_TRIGGER = '0'
where ef.IS_INDUCED_MUTATION_TRIGGER is null;

--  does not work yet
update ENVIRONMENTAL_FACTOR ef
set ef.TYPE = ef.TYPE_ALTERN_ENTRY
where ef.TYPE is null
and ef.ENVIRONMENTAL_FACTOR_ID is IN (

-- returns 4023 rows, I manually changed 7 rows on dev
select ef.ENVIRONMENTAL_FACTOR_ID, ef.TYPE, ef.TYPE_ALTERN_ENTRY, ef.NAME, ef.NAME_ALTERN_ENTRY, ac.EXTERNAL_SOURCE
from environmental_factor ef, abs_cancer_model ac, carcinogen_exposure ce
where ef.ENVIRONMENTAL_FACTOR_ID = ce.ENVIRONMENTAL_FACTOR_ID
and ce.ABS_CANCER_MODEL_ID = ac.ABS_CANCER_MODEL_ID
and ac.EXTERNAL_SOURCE = 'Jax MTB'
order by ef.TYPE, ef.TYPE_ALTERN_ENTRY;


-- then null out the typeAlternEntry field
update ENVIRONMENTAL_FACTOR ef
set ef.TYPE_ALTERN_ENTRY = null
where ef.ENVIRONMENTAL_FACTOR_ID is IN (

-- returns 4023 rows, I manually changed 7 rows on dev
select ef.ENVIRONMENTAL_FACTOR_ID, ef.TYPE, ef.TYPE_ALTERN_ENTRY, ef.NAME, ef.NAME_ALTERN_ENTRY, ac.EXTERNAL_SOURCE
from environmental_factor ef, abs_cancer_model ac, carcinogen_exposure ce
where ef.ENVIRONMENTAL_FACTOR_ID = ce.ENVIRONMENTAL_FACTOR_ID
and ce.ABS_CANCER_MODEL_ID = ac.ABS_CANCER_MODEL_ID
and ac.EXTERNAL_SOURCE = 'Jax MTB'
order by ef.TYPE, ef.TYPE_ALTERN_ENTRY;

-- repeat for name and nameAlternEntry fields

