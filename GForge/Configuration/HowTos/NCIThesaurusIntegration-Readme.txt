How can I show a concept tree from NCI Thesaurus?
-------------------------------------------------

Since you are reading this, you very well know that the 
*old* CTRM terminology database and browser are no longer 
supported by NCICB. Furthermore, all caBIG silver level  
compliant application wanting to utilize a terminology service 
should connect to the NCI Thesaurus via the caCORE/caBIO API.

To get access to the EVS web tree, deploy the war file "EVSTree.war"
into your <JBOSS-HOME>/<default>/deploy directory.

You are good to go. Test by connecting to 
http://localhost:8080/EVSTree/

The caMOD searchSimple.jsp and searchAdvanced.jsp utilize scripts to 
connect to the EVSTree application.
