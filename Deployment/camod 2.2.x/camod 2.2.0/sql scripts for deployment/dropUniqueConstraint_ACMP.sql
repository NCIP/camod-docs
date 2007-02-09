-- drop unique constraint for ABS_CAN_MOD_PUBLICATION
declare
begin
   for c1 in (
     select uc.constraint_name theName, ucc.column_name
       from user_constraints uc,
            user_cons_columns ucc
      where uc.constraint_type = 'U' 
        and uc.table_name = 'ABS_CAN_MOD_PUBLICATION'
        and uc.constraint_name = ucc.constraint_name
        and ucc.column_name = 'PUBLICATION_ID'
   ) loop
       execute immediate 'alter table ABS_CAN_MOD_PUBLICATION drop constraint ' || c1.theName;
   end loop;
end;
/
