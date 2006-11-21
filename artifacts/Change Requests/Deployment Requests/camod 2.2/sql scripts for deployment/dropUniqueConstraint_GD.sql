-- drop unique constraint for GENE_DELIVERY
declare
begin
   for c1 in (
     select uc.constraint_name theName, ucc.column_name
       from user_constraints uc,
            user_cons_columns ucc
      where uc.constraint_type = 'U' 
        and uc.table_name = 'GENE_DELIVERY'
        and uc.constraint_name = ucc.constraint_name
        and ucc.column_name = 'ORGAN_ID'
   ) loop
       execute immediate 'alter table GENE_DELIVERY drop constraint ' || c1.theName;
   end loop;
end;
/
