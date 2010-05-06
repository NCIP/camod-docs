set scan off;

-- modify inner string for url (switch)
Update IMAGE i set i.URL=replace (i.URL,'resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&','viewer.html?')  
where i.url LIKE '%.tif%'; 

Update IMAGE i set i.URL=replace (i.URL,'resolver?url_ver=Z39.88-2004&svc_id=info:lanl-repo/svc/getRegion&svc_val_fmt=info:ofi/fmt:kev:mtx:jpeg2000&svc.scale=100&','viewer.html?')  
where i.url LIKE '%.tif'; 


commit;

