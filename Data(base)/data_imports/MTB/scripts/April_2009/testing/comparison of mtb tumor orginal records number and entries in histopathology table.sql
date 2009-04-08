-- query compares the number of histopathology records created in the caMOD histopathology table with the number of origianl records received from MTB 
-- the expected outcome is zero meaning that for each zstg_tumor record (minus the records that describe metastases which are identified in the zstg_metastases table)
-- an entry in the caMOD histopathology table was created 
-- count (zstg_tumor) minus count (zstg_metastases) minus count (histopath records for edited approved MTB models)


select (select count(*) from zstg_tumor) - (select count (*) from zstg_metastases) - (select count (*) from histopathology h where h.abs_cancer_model_id 
in (select a.abs_cancer_model_id from abs_cancer_model a where a.external_source = 'Jax MTB' and a.state = 'Edited-approved')) as mtb_histology_records from dual ;


