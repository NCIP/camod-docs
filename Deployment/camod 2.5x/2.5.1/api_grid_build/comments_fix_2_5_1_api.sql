
-- Fix comments.remark to remove the . and modify to - for API to work
update Comments c
set c.Remark = 
'This does not appear to be a lung model from the abstract The RASSF1A isoform of RASSF1, a tumor suppressor, promotes microtubule stability and suppresses tumorigenesis. Irradiated Rassf1A null mice also showed increased tumor susceptibility, particularly to tumors associated with the gastrointestinal tract. 

No histological differences
could be seen between wild-type -/-, c1/c1, and m2/m2
mice in all tissues examined (heart, lung, spleen, brain, thymus,
kidney, stomach, intestine, pancreas, and testis; data not
shown).'
where c.comments_id = 10009766;



commit;



 

