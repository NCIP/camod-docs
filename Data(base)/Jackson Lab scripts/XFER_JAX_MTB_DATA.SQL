CREATE OR REPLACE PROCEDURE XFER_JAX_MTB_DATA AS

	CURSOR getAllMTBData IS
	SELECT *
	FROM JACKSON_LAB_TMP;

	CURSOR getDistinctMTBModels IS
	SELECT DISTINCT STRAIN_KEY, STRAIN_NAME, STRAIN_TYPES, STRAIN_GENERAL_NOTE, TREATMENT_TYPE, TREATMENT_AGENTS
	FROM JACKSON_LAB_TMP;

	CURSOR getMTBModels IS
	SELECT DISTINCT MTB_ID, STRAIN_KEY, STRAIN_NAME, STRAIN_TYPES, STRAIN_GENERAL_NOTE, TREATMENT_TYPE, TREATMENT_AGENTS, AGE_OF_ONSET, AGE_OF_DETECTION, TUMOR_FREQUENCY, REFERENCES
	FROM JACKSON_LAB_TMP;

	CURSOR getMTBStrains IS
	SELECT DISTINCT STRAIN_KEY, STRAIN_NAME
	FROM JACKSON_LAB_TMP;

	CURSOR getMTBOrgans IS
	SELECT DISTINCT jlt.ORGAN_KEY, jlt.ORGAN_AFFECTED, mom.EVS_ID
	FROM JACKSON_LAB_TMP jlt, MTB_ORGAN_MAP mom
	WHERE jlt.ORGAN_KEY = mom.MTB_ORGAN_KEY;

	CURSOR getMTBTumors IS
	SELECT DISTINCT TUMOR_NAME
	FROM JACKSON_LAB_TMP;

	CURSOR getGenotypeData IS
	SELECT acm.ABS_CANCER_MODEL_ID, n.NOMENCLATURE_ID
	FROM ABS_CANCER_MODEL acm, NOMENCLATURE n
	WHERE acm.MODEL_DESCRIPTOR = n.name;

	CURSOR getMetastasisRecs IS
	SELECT MTB_ID, MTBIDS_OF_METS
	FROM JACKSON_LAB_TMP
	WHERE MTBIDS_OF_METS IS NOT NULL;

	CURSOR getEnvFactorData IS
	SELECT DISTINCT TREATMENT_TYPE, TREATMENT_AGENTS
	FROM JACKSON_LAB_TMP;

	CURSOR getHistopathologyData IS
	SELECT * FROM HISTOPATHOLOGY
	WHERE HISTOPATHOLOGY_ID > 50000000;

	CURSOR getMTBHistopathologyData IS
	SELECT h.HISTOPATHOLOGY_ID, jlt.TUMOR_SYNONYMS, jlt.REPRODUCTIVE_STATUS, jlt.SEX
	FROM HISTOPATHOLOGY h, JACKSON_LAB_TMP jlt
	WHERE h.MTB_ID = jlt.MTB_ID;

	CURSOR getMTBHistopathologyData2 IS
	SELECT h.HISTOPATHOLOGY_ID, jlt.MTB_ID, jlt.ORGAN_AFFECTED, o.ORGAN_ID
	FROM HISTOPATHOLOGY h, JACKSON_LAB_TMP jlt
	RIGHT JOIN ORGAN o
	ON RTRIM(o.NAME) = RTRIM(jlt.ORGAN_AFFECTED)
	WHERE h.MTB_ID = jlt.MTB_ID;

	CURSOR getMTBHistopathologyData3 IS
	SELECT h.HISTOPATHOLOGY_ID, jlt.MTB_ID, jlt.TUMOR_NAME, d.DISEASE_ID
	FROM HISTOPATHOLOGY h, JACKSON_LAB_TMP jlt
	RIGHT JOIN DISEASE d
	ON RTRIM(d.NAME) = RTRIM(jlt.TUMOR_NAME)
	WHERE h.MTB_ID = jlt.MTB_ID;

	CURSOR getPubData IS
	SELECT * FROM MTB_PUBLICATION;

	CURSOR getPubData2 IS
	SELECT * FROM PUBLICATION
	WHERE PUBLICATION_ID >= 50000000;


	mtbModelCount		number:= 0;
	mtbModelIndex		number:= 0;

	mtbStrainCount		number:= 0;
	mtbStrainIndex		number:= 0;

	mtbOrganCount		number:= 0;
	mtbOrganIndex		number:= 0;

	mtbHistopathologyCount	number:= 0;
	mtbHistopathologyIndex	number:= 0;
	histopathologyCount	number:= 0;
	histopathologyIndex	number:= 0;

	mtbTumorCount		number:= 0;
	mtbTumorIndex		number:= 0;

	genotypeCount		number:= 0;
	genotypeIndex		number:= 0;

	envFactorCount		number:= 0;
	envFactorIndex		number:= 0;

	pubCount		number:= 0;
	pubIndex		number:= 0;

	disease_id 		number;
	organ_id 		number;
	pub_id 			number;
	startPos		number:= 1;
	charLoc			number:= 1;
	parentId		number;
	childId			number;
	mtbIdExists		number;
	childIdExists		number;
	parentIdExists		number;

	synonyms		varchar2(2000);
	strainNote		varchar2(2000);
	treatmentType		varchar2(2000);
	mtidsofmetsStr		varchar2(255);
	metsid			varchar2(255);
	comments		varchar2(255);
	todaysDate		date;



BEGIN
	-- -----------------------------------------------------------------------------------------
	-- Insert the common Submitter Record for the MTB data into the PARTY table.
	-- -----------------------------------------------------------------------------------------
	INSERT INTO PARTY
		( PARTY_ID, PARTY_TYPE, FIRST_NAME, LAST_NAME, IS_PRINCIPAL_INVESTIGATOR, USERNAME )
	VALUES
	(
		50000000,
		'PE',
		'Mouse Genome Informatics, The Jackson Laboratory, Bar Harbor Maine.',
		'This record was retrieved from the Mouse Tumor Biology Database (MTB)',
		0,
		'JacksonLab'
	);

	COMMIT;

	-- -----------------------------------------------------------------------------------------
	-- Insert the common PI Record for the MTB data into the PARTY table.
	-- -----------------------------------------------------------------------------------------
	INSERT INTO PARTY
		( PARTY_ID, PARTY_TYPE, FIRST_NAME, LAST_NAME, IS_PRINCIPAL_INVESTIGATOR, USERNAME )
	VALUES
	(
		50000001,
		'PE',
		'(July 2006)',
		'World Wide Web (URL: http://www.informatics.jax.org/)',
		1,
		'JacksonLab2'
	);

	COMMIT;

	-- -----------------------------------------------------------------------------------------
	-- Insert the common Strain entry for the MTB data.
	-- -----------------------------------------------------------------------------------------
	INSERT INTO STRAIN
		( STRAIN_ID, NAME_UNCTRL_VOCAB, SPECIES_ID )
	VALUES ( 50000000, 'Please refer to the official nomenclature name', 1 );

	COMMIT;

	-- -----------------------------------------------------------------------------------------
	-- Insert the common Phenotype entry for the MTB data.
	-- -----------------------------------------------------------------------------------------
	INSERT INTO PHENOTYPE
		( PHENOTYPE_ID, DESCRIPTION )
	VALUES ( 50000000, 'For a detailed description refer to the histopathology section of this record' );

	COMMIT;

	-- -----------------------------------------------------------------------------------------
	-- Insert the common Availability entry for the MTB data.
	-- -----------------------------------------------------------------------------------------
	SELECT SYSDATE INTO todaysDate FROM DUAL;

	INSERT INTO AVAILABILITY
		( AVAILABILITY_ID, ENTERED_DATE, RELEASE_DATE, VISIBLE_TO )
	VALUES ( 50000000, todaysDate, todaysDate, 'PUBLIC' );

	COMMIT;

	-- -----------------------------------------------------------------------------------------
	-- Insert Publication Data
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getPubData LOOP

		pubIndex := 50000000 + pubCount;

	    	INSERT INTO PUBLICATION
	    		( PUBLICATION_ID, VOLUME, YEAR, TITLE, START_PAGE, END_PAGE, PMID, AUTHORS, JOURNAL, J_NUMBER, PUBLICATION_STATUS_ID )
	    	VALUES
	    		( pubIndex, aRec.VOLUME,  CAST(aRec.YEAR as INT), aRec.TITLE, CAST(aRec.START_PAGE as INT), CAST(aRec.END_PAGE as INT), CAST(aRec.PMID as INT), aRec.AUTHORS, aRec.JOURNAL, aRec.J_NUMBER, CAST(aRec.PUBLICATION_STATUS_ID as INT));

		pubCount := pubCount + 1;

	END LOOP;

	COMMIT;

	-- -----------------------------------------------------------------------------------------
	-- Find models in the MTB data and add them as Abstract Cancer Models.
	-- Insert the Environmental Factor Data
	-- Insert the Carcinogen Exposure Data
	-- Insert the Carcinogen Exposure Data
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getDistinctMTBModels LOOP

		strainNote := ' ';
		mtbModelIndex := 50000000 + mtbModelCount;

		IF ( aRec.STRAIN_GENERAL_NOTE IS NULL ) THEN
			strainNote := ' ';
		ELSE
			strainNote := '<BR>Notes: ' || replace(aRec.STRAIN_GENERAL_NOTE, '|', ' & ');
		END IF;

	    	INSERT INTO ABS_CANCER_MODEL
	    		( ABS_CANCER_MODEL_ID, MODEL_DESCRIPTOR, ABS_CANCER_MODEL_TYPE, EXPERIMENT_DESIGN, STATE, SUBMITTER_ID,
	    		  PRINCIPAL_INVESTIGATOR_ID, URL, IS_TOOL_STRAIN, PHENOTYPE_ID, AVAILABILITY_ID, STRAIN_ID, EXTERNAL_SOURCE )
	    	VALUES
	    		( mtbModelIndex, aRec.STRAIN_NAME, 'AM', '<BR> Strain Type: ' || replace(aRec.STRAIN_TYPES, '|', ' & ') || strainNote, 'Edited-approved', 50000000, 50000001,
	    		 'http://tumor.informatics.jax.org', 0, 50000000, 50000000, 50000000, 'Jax MTB' );

		COMMIT;

		IF ( aRec.TREATMENT_TYPE <> 'None (Spontaneous)' ) THEN

			treatmentType := aRec.TREATMENT_TYPE;
			IF (  aRec.TREATMENT_TYPE = 'Growth Factor' ) THEN
				treatmentType := 'Growth Factor Type';
			END IF;
			IF (  aRec.TREATMENT_TYPE = 'Hormone' ) THEN
				treatmentType := 'Hormone Type';
			END IF;
			IF (  aRec.TREATMENT_TYPE = 'Radiation Type' ) THEN
				treatmentType := 'Radiation Type';
			END IF;
			IF (  aRec.TREATMENT_TYPE = 'Other' ) THEN
				treatmentType := 'Other Type';
			END IF;

	    		INSERT INTO ENVIRONMENTAL_FACTOR
	    			( ENVIRONMENTAL_FACTOR_ID, TYPE_UNCTRL_VOCAB, NAME_UNCTRL_VOCAB )
	    		VALUES
	    			( mtbModelIndex, treatmentType, REPLACE(aRec.TREATMENT_AGENTS, '|', ' & ') );

			COMMIT;

	    		INSERT INTO CARCINOGEN_EXPOSURE
	    			( CARCINOGEN_EXPOSURE_ID, ENVIRONMENTAL_FACTOR_ID, ABS_CANCER_MODEL_ID )
	    		VALUES
	    			( mtbModelIndex, mtbModelIndex, mtbModelIndex );

			COMMIT;

		END IF;

		FOR bRec IN (
			select *
			from JACKSON_LAB_TMP jlt
			 where RTRIM(jlt.STRAIN_KEY) = RTRIM(aRec.STRAIN_KEY)
	  		   and RTRIM(jlt.STRAIN_NAME) = RTRIM(aRec.STRAIN_NAME)
	  		   and (RTRIM(jlt.STRAIN_TYPES) = RTRIM(aRec.STRAIN_TYPES)
	  		    or RTRIM(jlt.STRAIN_TYPES) IS NULL )
	  		   and (RTRIM(jlt.STRAIN_GENERAL_NOTE) = RTRIM(aRec.STRAIN_GENERAL_NOTE)
			    or RTRIM(jlt.STRAIN_GENERAL_NOTE) IS NULL)
	  		   and RTRIM(jlt.TREATMENT_TYPE) = RTRIM(aRec.TREATMENT_TYPE)
	  		   and (RTRIM(jlt.TREATMENT_AGENTS) = RTRIM(aRec.TREATMENT_AGENTS)
			    or RTRIM(jlt.TREATMENT_AGENTS) IS NULL ) ) LOOP

			histopathologyIndex := 50000000 + histopathologyCount;

	    		INSERT INTO HISTOPATHOLOGY
	    		   ( HISTOPATHOLOGY_ID, AGE_OF_ONSET, AGE_OF_DETECTION, TUMOR_INCIDENCE_RATE, MTB_ID, ABS_CANCER_MODEL_ID )
	    		VALUES
	    		   ( histopathologyIndex, bRec.AGE_OF_ONSET, bRec.AGE_OF_DETECTION, bRec.TUMOR_FREQUENCY, bRec.MTB_ID, mtbModelIndex);

			COMMIT;

	    		histopathologyCount := histopathologyCount + 1;

	    	END LOOP;

		FOR cRec IN (SELECT jlt.REFERENCES
				 	 FROM JACKSON_LAB_TMP jlt
			  		 WHERE RTRIM(jlt.STRAIN_KEY) = RTRIM(aRec.STRAIN_KEY)
	  		  		   AND RTRIM(jlt.STRAIN_NAME) = RTRIM(aRec.STRAIN_NAME)
	  		  		   AND RTRIM(jlt.STRAIN_TYPES) = RTRIM(aRec.STRAIN_TYPES)
	  		    	   AND (RTRIM(jlt.STRAIN_GENERAL_NOTE) = RTRIM(aRec.STRAIN_GENERAL_NOTE)
			    	    OR RTRIM(jlt.STRAIN_GENERAL_NOTE) IS NULL)
	  		    	   AND RTRIM(jlt.TREATMENT_TYPE) = RTRIM(aRec.TREATMENT_TYPE)
	  		    	   AND (RTRIM(jlt.TREATMENT_AGENTS) = RTRIM(aRec.TREATMENT_AGENTS)
			    	    OR RTRIM(jlt.TREATMENT_AGENTS) IS NULL ) ) LOOP

			pub_id := 0;
		    SELECT MIN(p.PUBLICATION_ID) INTO pub_id
			FROM PUBLICATION p
			WHERE p.PUBLICATION_ID >= 50000000
		      AND RTRIM (p.J_NUMBER) = RTRIM(cRec.REFERENCES);

		IF pub_id > 0 THEN

	    	   INSERT INTO ABS_CAN_MOD_PUBLICATION
	    	     ( ABS_CANCER_MODEL_ID, PUBLICATION_ID )
	    	   VALUES
	    	     ( mtbModelIndex, pub_id);

			   COMMIT;

	    	END IF;
	    END LOOP;

	    INSERT INTO NOMENCLATURE
	   		( NOMENCLATURE_ID, NAME )
	   	VALUES
	   		( mtbModelIndex, aRec.STRAIN_NAME );

		COMMIT;

	   	INSERT INTO GENOTYPE
    		( GENOTYPE_ID, NOMENCLATURE_ID, ABS_CANCER_MODEL_ID )
	  	VALUES
	   		( mtbModelIndex, mtbModelIndex, mtbModelIndex );

		COMMIT;

		mtbModelCount := mtbModelCount + 1;

	END LOOP;


	-- -----------------------------------------------------------------------------------------
	-- Insert MTB Organ Data
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getMTBOrgans LOOP

		mtbOrganIndex := 50000000 + mtbOrganCount;

	    	INSERT INTO ORGAN
	    		( ORGAN_ID, NAME, CONCEPT_CODE)
	    	VALUES
	    		( mtbOrganIndex,  aRec.ORGAN_AFFECTED, aRec.EVS_ID);

		mtbOrganCount := mtbOrganCount + 1;

	END LOOP;
      	dbms_output.put_line('Organ data added......');

	-- -----------------------------------------------------------------------------------------
	-- Insert MTB Tumor Data
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getMTBTumors LOOP

		mtbTumorIndex := 50000000 + mtbTumorCount;

	    	INSERT INTO DISEASE
	    		( DISEASE_ID, NAME, CONCEPT_CODE )
	    	VALUES
	    		( mtbTumorIndex, aRec.TUMOR_NAME, '000000');

		mtbTumorCount := mtbTumorCount + 1;

	END LOOP;
     	dbms_output.put_line('Tumor data added......');


	-- -----------------------------------------------------------------------------------------
	-- Insert MTB Histopathology Organ Data
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getMTBHistopathologyData2 LOOP

		UPDATE HISTOPATHOLOGY h
		SET h.ORGAN_ID = aRec.ORGAN_ID
		WHERE h.HISTOPATHOLOGY_ID = aRec.HISTOPATHOLOGY_ID;

	END LOOP;
     	dbms_output.put_line('Histopatholgy organ data updated......');


	-- -----------------------------------------------------------------------------------------
	-- Insert MTB Histopathology Disease Data
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getMTBHistopathologyData3 LOOP

		UPDATE HISTOPATHOLOGY h
		SET h.DISEASE_ID = aRec.DISEASE_ID
		WHERE h.HISTOPATHOLOGY_ID = aRec.HISTOPATHOLOGY_ID;

	END LOOP;
     	dbms_output.put_line('Histopatholgy disease data updated......');


	-- -----------------------------------------------------------------------------------------
	-- Insert MTB Histopathology Comments Data
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getMTBHistopathologyData LOOP

	    IF LENGTH(aRec.TUMOR_SYNONYMS) is null THEN
		synonyms := ' ';
	    ELSE
		synonyms := 'Disease Name Synonyms: ' || replace(aRec.TUMOR_SYNONYMS, '|', ' & ');
	    END IF;

	    IF RTRIM(aRec.SEX) = RTRIM('F') THEN
		   	 UPDATE HISTOPATHOLOGY h
		   	 SET h.COMMENTS = synonyms || '   <BR>Reproductive Status:  ' || aRec.REPRODUCTIVE_STATUS || '    <BR>Gender: female'
		   	 WHERE h.HISTOPATHOLOGY_ID = aRec.HISTOPATHOLOGY_ID;
	    END IF;

	    IF RTRIM(aRec.SEX) = RTRIM('M') THEN

			 UPDATE HISTOPATHOLOGY h
			 SET h.COMMENTS = synonyms || '   <BR>Reproductive Status:  ' || aRec.REPRODUCTIVE_STATUS || '    <BR>Gender: male'
			 WHERE h.HISTOPATHOLOGY_ID = aRec.HISTOPATHOLOGY_ID;

	    END IF;

	    IF RTRIM(aRec.SEX) = RTRIM('X') THEN

			 UPDATE HISTOPATHOLOGY h
			 SET h.COMMENTS = synonyms || '   <BR>Reproductive Status:  ' || aRec.REPRODUCTIVE_STATUS || '    <BR>Gender: mixed population'
			 WHERE h.HISTOPATHOLOGY_ID = aRec.HISTOPATHOLOGY_ID;

	    END IF;

	    IF RTRIM(aRec.SEX) = RTRIM('U') THEN

			 UPDATE HISTOPATHOLOGY h
			 SET h.COMMENTS = synonyms || '   <BR>Reproductive Status:  ' || aRec.REPRODUCTIVE_STATUS || '    <BR>Gender: unspecified'
			 WHERE h.HISTOPATHOLOGY_ID = aRec.HISTOPATHOLOGY_ID;

	    END IF;


	END LOOP;
     	dbms_output.put_line('Histopatholgy comments data updated......');


	-- -----------------------------------------------------------------------------------------
	-- Update MTB Histopathology Entries with Metastases
	-- -----------------------------------------------------------------------------------------
	FOR aRec IN getMetastasisRecs LOOP

		mtidsofmetsStr := aRec.MTBIDS_OF_METS;
		charLoc := 1;
		startPos := 1;
		parentId := 0;
		childId := 0;

		IF INSTR(mtidsofmetsStr, '|') = 0 THEN

	    	    dbms_output.put_line(' ');

		    SELECT count(*) into childIdExists
		    FROM HISTOPATHOLOGY h
		    WHERE h.MTB_ID = mtidsofmetsStr;

		    IF ( childIdExists > 0 ) THEN

		        SELECT HISTOPATHOLOGY_ID into childId
		       	FROM HISTOPATHOLOGY h
		       	WHERE h.MTB_ID = mtidsofmetsStr;

		    	SELECT count(*) into parentIdExists
		    	FROM HISTOPATHOLOGY h
		    	WHERE h.MTB_ID = aRec.MTB_ID;

			IF ( parentIdExists > 0 ) THEN

		       	   SELECT HISTOPATHOLOGY_ID into parentId
		       	   FROM HISTOPATHOLOGY h
		       	   WHERE h.MTB_ID = aRec.MTB_ID;

		      	   UPDATE HISTOPATHOLOGY h
		      	   SET h.PARENT_HISTOPATHOLOGY_ID = parentId
		      	   WHERE h.HISTOPATHOLOGY_ID = childId;

		      	   UPDATE HISTOPATHOLOGY h
		    	   SET h.ABS_CANCER_MODEL_ID = NULL
		    	   WHERE h.HISTOPATHOLOGY_ID = childId;

			   COMMIT;

			 END IF;

		    END IF;

		ELSE

		    SELECT count(*) into parentIdExists
		    FROM HISTOPATHOLOGY h
		    WHERE h.MTB_ID = aRec.MTB_ID;

			IF ( parentIdExists > 0 ) THEN

		       SELECT HISTOPATHOLOGY_ID into parentId
		       FROM HISTOPATHOLOGY h
		       WHERE h.MTB_ID = aRec.MTB_ID;

			   WHILE charLoc > 0 LOOP

			   	   IF ( INSTR(mtidsofmetsStr, '|') = 0 ) THEN
			  	   	  metsid := SUBSTR(mtidsofmetsStr, 0);
				 	  charLoc := 0;
			  	   ELSE
			  		  metsid := SUBSTR(mtidsofmetsStr, 0, INSTR(mtidsofmetsStr, '|')-1 );
			  		  mtidsofmetsStr := SUBSTR(mtidsofmetsStr, INSTR(mtidsofmetsStr, '|')+1);
			  	   END IF;

		    	   SELECT count(*) into childIdExists
		    	   FROM HISTOPATHOLOGY h
		    	   WHERE h.MTB_ID = metsid;

				   IF ( childIdExists > 0 ) THEN

		       		   SELECT HISTOPATHOLOGY_ID into childId
		       		   FROM HISTOPATHOLOGY h
		       		   WHERE h.MTB_ID = metsid;

		    		   UPDATE HISTOPATHOLOGY h
		    		   SET h.PARENT_HISTOPATHOLOGY_ID = parentId
		    		   WHERE h.HISTOPATHOLOGY_ID = childId;

		    		   UPDATE HISTOPATHOLOGY h
		    		   SET h.ABS_CANCER_MODEL_ID = NULL
		    		   WHERE h.HISTOPATHOLOGY_ID = childId;

					   COMMIT;

			   	   END IF;

				END LOOP;

			END IF;

		END IF;

	END LOOP;
     	dbms_output.put_line('Histopatholgy metastasis data updated......');


	COMMIT;

    EXCEPTION

	WHEN OTHERS THEN
      dbms_output.put_line(SQLERRM);

END;
/



Execute XFER_JAX_MTB_DATA;


