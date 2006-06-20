-- This is a control file for MTB data from Jackson Labs
LOAD DATA
	INFILE "C:\temp\MTB_source_data_v1.txt" 
	BADFILE 'jackson.bad'
DISCARDFILE 'JACKSON.dsc'
REPLACE
INTO TABLE jackson_Lab_tmp
FIELDS TERMINATED BY WHITESPACE ENCLOSED BY '"'
TRAILING NULLCOLS
      (
      mtb_id,
      tumor_name, 
      tumor_synonyms,
      strain_name,
      strain_types,
      strain_general_note, 
      treatment_type,
      treatment_agents,
      organ_affected,
      metastasized_to, 
      mtbids_of_corres_metastases,
      sex,
      reproductive_status,
      tumor_frequency,
      age_of_onset,
      age_of_detection,
      references
    )
