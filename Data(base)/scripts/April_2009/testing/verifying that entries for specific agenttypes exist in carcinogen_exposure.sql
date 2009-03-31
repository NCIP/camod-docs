select * from carcinogen_exposure where abs_cancer_model_id in 
(select abs_cancer_model_id from zstg_tumor where tumorkey in 
(select ta.tumorkey from zstg_tumor_agent ta, zstg_agent a where a.agenttype='Signaling Molecule' and a.agentkey=ta.agentkey

)
)