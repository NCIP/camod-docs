
-- #6812 Change spelling of Motility on Biological Process selection (Therapy)
update BIOLOGICAL_PROCESS bp
set bp.NAME = 'Adhesion, Motility, Invasion, Metastasis'
where bp.BIOLOGICAL_PROCESS_ID = 1;




commit;



 

