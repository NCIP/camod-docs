CREATE OR REPLACE PROCEDURE REMOVE_JAX_MTB_DATA AS

BEGIN
	-- -----------------------------------------------------------------------------------------
	-- Delete the Carcinogen Exposure Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM CARCINOGEN_EXPOSURE
	WHERE CARCINOGEN_EXPOSURE_ID >= 50000000
	  AND CARCINOGEN_EXPOSURE_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete the Environmental Factor Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM ENVIRONMENTAL_FACTOR
	WHERE ENVIRONMENTAL_FACTOR_ID >= 50000000
	  AND ENVIRONMENTAL_FACTOR_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete Genotype Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM GENOTYPE
	WHERE GENOTYPE_ID >= 50000000
	  AND GENOTYPE_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete MTB Nomenclature Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM NOMENCLATURE
	WHERE NOMENCLATURE_ID >= 50000000
	  AND NOMENCLATURE_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete MTB Histopathology Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM HISTOPATHOLOGY
	WHERE HISTOPATHOLOGY_ID >= 50000000
	  AND HISTOPATHOLOGY_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete MTB Organ Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM ORGAN
	WHERE ORGAN_ID >= 50000000
	  AND ORGAN_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete MTB Tumor Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM DISEASE
	WHERE DISEASE_ID >= 50000000
	  AND DISEASE_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete Abstract Cancer Models Publications.
	-- -----------------------------------------------------------------------------------------
	DELETE FROM ABS_CAN_MOD_PUBLICATION
	WHERE ABS_CANCER_MODEL_ID >= 50000000
	  AND ABS_CANCER_MODEL_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Insert MTB Publication Data
	-- -----------------------------------------------------------------------------------------
	DELETE FROM Publication
	WHERE PUBLICATION_ID >= 50000000
	  AND PUBLICATION_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete models in the MTB data and add them as Abstract Cancer Models.
	-- -----------------------------------------------------------------------------------------
	DELETE FROM ABS_CANCER_MODEL
	WHERE ABS_CANCER_MODEL_ID >= 50000000
	  AND ABS_CANCER_MODEL_ID < 50050000;

	-- -----------------------------------------------------------------------------------------
	-- Delete the common Submitter Record for the MTB data into the PARTY table.
	-- -----------------------------------------------------------------------------------------
	DELETE FROM PARTY
	WHERE PARTY_ID = 50000000;

	-- -----------------------------------------------------------------------------------------
	-- Delete the common PI Record for the MTB data into the PARTY table.
	-- -----------------------------------------------------------------------------------------
	DELETE FROM PARTY
	WHERE PARTY_ID = 50000001;

	-- -----------------------------------------------------------------------------------------
	-- Delete the common Strain entry for the MTB data.
	-- -----------------------------------------------------------------------------------------
	DELETE FROM STRAIN
	WHERE STRAIN_ID = 50000000;

	-- -----------------------------------------------------------------------------------------
	-- Delete the common Phenotype entry for the MTB data.
	-- -----------------------------------------------------------------------------------------
	DELETE FROM PHENOTYPE
	WHERE PHENOTYPE_ID = 50000000;


	-- -----------------------------------------------------------------------------------------
	-- Delete the common Availability entry for the MTB data.
	-- -----------------------------------------------------------------------------------------
	DELETE FROM AVAILABILITY
	WHERE AVAILABILITY_ID = 50000000;


	COMMIT;

    EXCEPTION

	WHEN OTHERS THEN
	    --ROLLBACK TO myTrans;
	    NULL;

END;
/

Execute REMOVE_JAX_MTB_DATA;

