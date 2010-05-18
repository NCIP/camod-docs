Update IMAGE i set i.URL=replace (i.URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.tif'; 

Update IMAGE i set i.URL=replace (i.URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.tif%'; 

Update IMAGE i set i.URL=replace (i.URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.jpeg';

Update IMAGE i set i.URL=replace (i.URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.JPG';		
		
Update IMAGE i set i.URL=replace (i.URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.jpg';
		
Update IMAGE i set i.URL=replace (i.URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.png'; 
		
Update IMAGE i set i.URL=replace (i.URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.gif'; 

-- thumb url
Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.tif'; 

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.tif%'; 

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.jpeg';

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.JPG';		
		
Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.jpg';
		
Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.png'; 
		
Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://ncias-d330-v.nci.nih.gov:19080','http://imageserver-dev.nci.nih.gov')  
where i.url LIKE '%.gif'; 


commit;