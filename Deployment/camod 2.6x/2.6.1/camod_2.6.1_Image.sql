set scan off;


select
case
    when URL like 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=%.sid' 
       then replace(replace(SUBSTR(URL, 1, INSTR(URL, ';')), 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=', 'http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&rft_id=http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images/Model_Images/Model/'), '.sid', '.tif')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/%.tif' 
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/', 'http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&rft_id=http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images/Model_Images/GeneticConstruct/')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model/%'
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model', 'http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&rft_id=http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images/Model_Images/Model/')
    else URL
end t1
from IMAGE; /* Your table here*/


-- use for updating


update IMAGE set URL =
case
    when URL like 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=%.sid' 
       then replace(replace(SUBSTR(URL, 1, INSTR(URL, ';')), 'http://caimage.nci.nih.gov/lizardtech//iserv/getthumb?cat=Model&img=', 'http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&rft_id=http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images/Model_Images/Model/'), '.sid', '.tif')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/%.tif' 
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/GeneticConstruct/', 'http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&rft_id=http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images/Model_Images/GeneticConstruct/')
    when URL like 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model/%'
       then replace(URL, 'http://caimage.nci.nih.gov/lizardtech/Model_Images/Model', 'http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&rft_id=http://ncias-d330-v.nci.nih.gov:19080/adore-djatoka/images/caimage/Images/images/Model_Images/Model/')
    else URL
end;

-- copy URL over completely for all tif images
Update IMAGE i set i.THUMB_URL=i.URL
where i.url LIKE '%.tif%';

Update IMAGE i set i.THUMB_URL=i.URL
where i.url LIKE '%.tif';

-- modify inner string for thumb_url
Update IMAGE i set i.THUMB_URL=replace (i.URL,'resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&','viewer.html?')  
where i.url LIKE '%.tif%'; 

Update IMAGE i set i.THUMB_URL=replace (i.URL,'resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&','viewer.html?')  
where i.url LIKE '%.tif'; 


commit;

