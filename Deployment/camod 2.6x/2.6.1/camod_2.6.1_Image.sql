set scan off;


select
case
    when URL like 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=%.sid' 
       then replace(replace(SUBSTR(URL, 1, INSTR(URL, ';')), 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=', 'http://imageserver-dev.nci.nih.gov/adore-djatoka/viewer.html?rft_id=http://imageserver-dev.nci.nih.gov/adore-djatoka/images/caimage/Images/images/Model_Images/Model/'), '.sid', '.tif')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/%.tif' 
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/', 'http://imageserver-dev.nci.nih.gov/adore-djatoka/viewer.html?rft_id=http://imageserver-dev.nci.nih.gov/adore-djatoka/images/caimage/Images/images/Model_Images/GeneticConstruct/')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model/%'
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model', 'http://imageserver-dev.nci.nih.gov/adore-djatoka/viewer.html?rft_id=http://imageserver-dev.nci.nih.gov/adore-djatoka/images/caimage/Images/images/Model_Images/Model/')
    else URL
end t1
from IMAGE; /* Your table here*/


-- use for updating


update IMAGE set URL =
case
    when URL like 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=%.sid' 
       then replace(replace(SUBSTR(URL, 1, INSTR(URL, ';')), 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=', 'http://imageserver-dev.nci.nih.gov/adore-djatoka/viewer.html?rft_id=http://imageserver-dev.nci.nih.gov/adore-djatoka/images/caimage/Images/images/Model_Images/Model/'), '.sid', '.tif')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/%.tif' 
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/', 'http://imageserver-dev.nci.nih.gov/adore-djatoka/viewer.html?rft_id=http://imageserver-dev.nci.nih.gov/adore-djatoka/images/caimage/Images/images/Model_Images/GeneticConstruct/')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model/%'
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model', 'http://imageserver-dev.nci.nih.gov/adore-djatoka/viewer.html?rft_id=http://imageserver-dev.nci.nih.gov/adore-djatoka/images/caimage/Images/images/Model_Images/Model/')
    else URL
end;

-- copy URL over completely for all tif images
Update IMAGE i set i.THUMB_URL=i.URL
where i.url LIKE '%.tif%';

Update IMAGE i set i.THUMB_URL=i.URL
where i.url LIKE '%.tif';

-- modify inner string for thumb_url column in tif images
Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'viewer.html?','resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&')  
where i.url LIKE '%.tif%'; 

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'viewer.html?','resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&')  
where i.url LIKE '%.tif'; 

-- update url on QA and stage to point to caIMAGE prod tier
Update IMAGE i set i.URL=replace (i.URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.url LIKE '%.JPG';

Update IMAGE i set i.URL=replace (i.URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.url LIKE '%.jpg';

Update IMAGE i set i.URL=replace (i.URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.url LIKE '%.png';

Update IMAGE i set i.URL=replace (i.URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.url LIKE '%.gif';

Update IMAGE i set i.URL=replace (i.URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.url LIKE '%.jpeg';

Update IMAGE i set i.URL=replace (i.URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.url LIKE '%.tif';

Update IMAGE i set i.URL=replace (i.URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.url LIKE '%.tif%';

-- update thumb_url on QA and stage to point to caIMAGE prod tier
Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.THUMB_URL LIKE '%.JPG';

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.THUMB_URL LIKE '%.jpg';

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.THUMB_URL LIKE '%.png';

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.THUMB_URL LIKE '%.gif';

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.THUMB_URL LIKE '%.jpeg';

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.THUMB_URL LIKE '%.tif';

Update IMAGE i set i.THUMB_URL=replace (i.THUMB_URL,'http://imageserver-stage.nci.nih.gov','http://imageserver.nci.nih.gov')  
where i.THUMB_URL LIKE '%.tif%';



commit;

