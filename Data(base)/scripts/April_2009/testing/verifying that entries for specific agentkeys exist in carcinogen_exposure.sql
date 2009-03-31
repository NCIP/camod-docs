select * from carcinogen_exposure where abs_cancer_model_id in 
(select abs_cancer_model_id from zstg_tumor where tumorkey in 
(select tumorkey from zstg_tumor_agent where agentkey=1
)
)
