-- Add column named abs_cancer_model to Nomenclature
alter table nomenclature 
ADD abs_cancer_model_id number(19,0);

-- Populate abs_cancer_model in Nomenclature
update Nomenclature n
    set abs_cancer_model_id = (
   select distinct  g.abs_cancer_model_id
     from genotype g
      where g.Nomenclature_id = n.Nomenclature_id
and abs_cancer_model_id is not null);


-- Add abs_cancer_model_id for remaining nomenclature objects from spreadsheet (42)
update nomenclature set abs_cancer_model_id = 16 where nomenclature_id = 32;
update nomenclature set abs_cancer_model_id = 27 where nomenclature_id = 43;
update nomenclature set abs_cancer_model_id = 28 where nomenclature_id = 44;
update nomenclature set abs_cancer_model_id = 30 where nomenclature_id = 46;
update nomenclature set abs_cancer_model_id = 33 where nomenclature_id = 49;
update nomenclature set abs_cancer_model_id = 99 where nomenclature_id = 115;

update nomenclature set abs_cancer_model_id = 100 where nomenclature_id = 116;
update nomenclature set abs_cancer_model_id = 110 where nomenclature_id = 126;
update nomenclature set abs_cancer_model_id = 115 where nomenclature_id = 131;
update nomenclature set abs_cancer_model_id = 151 where nomenclature_id = 167;
update nomenclature set abs_cancer_model_id = 152 where nomenclature_id = 168;
update nomenclature set abs_cancer_model_id = 153 where nomenclature_id = 169;
update nomenclature set abs_cancer_model_id = 180 where nomenclature_id = 196;

update nomenclature set abs_cancer_model_id = 221 where nomenclature_id = 237;
update nomenclature set abs_cancer_model_id = 232 where nomenclature_id = 248;
update nomenclature set abs_cancer_model_id = 233 where nomenclature_id = 249;
update nomenclature set abs_cancer_model_id = 234 where nomenclature_id = 250;
update nomenclature set abs_cancer_model_id = 235 where nomenclature_id = 251;
update nomenclature set abs_cancer_model_id = 239 where nomenclature_id = 255;
update nomenclature set abs_cancer_model_id = 277 where nomenclature_id = 293;
update nomenclature set abs_cancer_model_id = 283 where nomenclature_id = 299;
update nomenclature set abs_cancer_model_id = 284 where nomenclature_id = 34;
update nomenclature set abs_cancer_model_id = 297 where nomenclature_id = 313;

update nomenclature set abs_cancer_model_id = 323 where nomenclature_id = 339;
update nomenclature set abs_cancer_model_id = 357 where nomenclature_id = 373;
update nomenclature set abs_cancer_model_id = 358 where nomenclature_id = 374;
update nomenclature set abs_cancer_model_id = 363 where nomenclature_id = 379;
update nomenclature set abs_cancer_model_id = 369 where nomenclature_id = 385;

update nomenclature set abs_cancer_model_id = 406 where nomenclature_id = 422;
update nomenclature set abs_cancer_model_id = 407 where nomenclature_id = 423;
update nomenclature set abs_cancer_model_id = 408 where nomenclature_id = 424;
update nomenclature set abs_cancer_model_id = 409 where nomenclature_id = 425;
update nomenclature set abs_cancer_model_id = 410 where nomenclature_id = 426;
update nomenclature set abs_cancer_model_id = 449 where nomenclature_id = 465;
update nomenclature set abs_cancer_model_id = 450 where nomenclature_id = 466;
update nomenclature set abs_cancer_model_id = 455 where nomenclature_id = 471;
update nomenclature set abs_cancer_model_id = 458 where nomenclature_id = 474;
update nomenclature set abs_cancer_model_id = 465 where nomenclature_id = 481;
update nomenclature set abs_cancer_model_id = 499 where nomenclature_id = 515;

update nomenclature set abs_cancer_model_id = 500 where nomenclature_id = 516;
update nomenclature set abs_cancer_model_id = 501 where nomenclature_id = 517;
update nomenclature set abs_cancer_model_id = 503 where nomenclature_id = 519;


-- Drop FK Constraint on genotype
alter table genotype drop constraint FK6ECA840B35AE2BF;

-- Add FK constraint to Nomenclature table
alter table Nomenclature add constraint FK6ECA840B35AE2BF foreign key (abs_cancer_model_id) references abs_cancer_model;

-- Remove rows with no name in Nomenclature
delete nomenclature n
where n.name IS NULL;

-- Make column not null after loading data
Alter table Nomenclature
modify abs_cancer_model_id  not null;

-- Set Nomenclature_id in Genotype to null
update genotype set Nomenclature_id = null;

-- Drop Nomenclature_id from genotype table
alter table genotype  drop column Nomenclature_id;

-- Remove rows with no name in Genotype
delete genotype g
where g.name IS NULL;

commit;