Steps to configure UPT (CSM 3.0.1) w/ Oracle backend (Authentication & Authorization) 
------------------------------------------------------------------------------------- 

1) CVS Check-out caMOD/docs/UPT-Config from CVS. Verify that the following files exist 

ApplicationSecurityConfig.xml 
csm.dmp 
hibernate.cfg.xml 
upt.hibernate.cfg.xml 
oracle-ds.xml 
upt.war 
login-config.xml 
properties-service.xml 

2) Download and install Oracle9.2 database server for Windows. 
Note: This step can be skipped if any of the following is true. 
a) you have access to a 9i instance with a schema "csm" 
b) you can have the "cms" schema created on a 9i instance 

2b) Oracle database server must be up and running at this point. 

3) Create schema user "csm" with connect and resource database privileges. 
Use sqlplus or enterprise manager to create the user. 

4) import csm.dmp (schema objects and data) to csm schema. Use the following command imp csm/csm file=csm.dmp 

You now have all the objects needed by CSM and UPT. 

5) Create a folder named "UPT" <JBOSS-HOME>/server/default 

6) Move the following files to the UPT folder. 
hibernate.cfg.xml 
upt.hibernate.cfg.xml 
ApplicationSecurityConfig.xml 

7) Add the following lines to 
<JBOSS-HOME>/server/default/conf/login-config.xml 

    <!-- upt application --> 
    <application-policy name = "csmupt"> 
           <authentication> 
              <login-module code = 
"gov.nih.nci.security.authentication.loginmodules.RDBMSLoginModule" flag = "required"> 
                 <module-option name = 
"driver">oracle.jdbc.driver.OracleDriver</module-option> 
                 <module-option name = 
"url">jdbc:oracle:thin:@localhost:1521:ora9i</module-option> 
                 <module-option name = "user">csm</module-option> 
                 <module-option name = "passwd">csm</module-option> 
                 <module-option name = "query">SELECT * FROM CSM_USER WHERE LOGIN_NAME=? and PASSWORD=?</module-option> 
              </login-module> 
           </authentication> 
    </application-policy> 
   
8) Update <JBOSS-HOME>/server/standard/deploy/properties-service.xml 
with the appropriate location of the ApplicationSecurityConfig file 

    <attribute name="Properties"> 

      <!-- 
gov.nih.nci.security.configFile=C:/Devtools/jboss-4.0.0/server/default/CSM/A 
pplicationSecurityConfig.xml --> 

gov.nih.nci.security.configFile=C:/Devtools/jboss-4.0.0/server/default/UPT/A 
pplicationSecurityConfig.xml 

    </attribute> 
   
9) Copy the following files under <JBOSS-HOME>/server/default/deploy 
oracle-ds.xml 
upt.war 

10) Start JBoss 

11) Point your browser to 
http://localhost:8080/upt/ 

Login using the following parameters 

USer: admin 
Password: admin 
Application: csmupt 

12) You now have super user privs for your local CSM/UPT installation. 
Create a caMOD application 
Create one or more user accounts to access caMOD, make sure atleast one of them will be the "application admin" for caMOD

13) Log out 

14) Log back to CSM using the caMOD app admin credentials, for provisioning caMOD.... 


