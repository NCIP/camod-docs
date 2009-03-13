
-- Fix comments.remark to remove the . and modify to - for API to work
update Comments c
set c.Remark = 'No histological differences
could be seen between wild-type -/-, c1/c1, and m2/m2
mice in all tissues examined (heart, lung, spleen, brain, thymus,
kidney, stomach, intestine, pancreas, and testis; data not
shown).'
where c.comments_id = 10009766;

commit;



 

