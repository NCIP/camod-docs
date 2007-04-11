ALTER TABLE abs_cancer_model
RENAME COLUMN is_tool_strain to is_tool_mouse;

drop table transient_interference_method cascade constraints;

drop table transient_interference cascade constraints;

create table MORPHOLINO (
   morpholino_id number(19,0) not null,
   source varchar2(255),
   source_unctr_vocab varchar2(255),
   type varchar2(255),
   sequence_direction varchar2(255),
   targeted_region varchar2(255),
   concentration varchar2(255),
   concentration_unit varchar2(255),
   delivery_method varchar2(255),
   delivery_method_unctrl_vocab varchar2(255),
   visual_ligand varchar2(255),
   visual_ligand_unctrl_vocab varchar2(255),
   comments clob,
   abs_cancer_model_id number(19,0) not null,
   primary key (morpholino_id)
);


alter table morpholino add constraint FKE89F80171CC8B88B foreign key (abs_cancer_model_id) references abs_cancer_model;

RENAME genotype to genotype_summary;

ALTER TABLE Genotype_summary
RENAME COLUMN name to summary;

ALTER TABLE genotype_summary
RENAME column  genotype_id TO genotype_summary_id;

Alter table genotype_summary
add genotype VARCHAR2(255);

alter table histopathology
drop column TUMOR_INCIDENCE_RATE;

alter table histopathology
add TUMOR_INCIDENCE_RATE float;


--**not done yet
--move genotype_summary to EG instead of animal_model

-- Add abs_cancer_model_id column
Alter table genotype_summary
add abs_cancer_model_id number(19,0);



