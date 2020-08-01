package com.example.debtManager.resource;

import javax.activation.MimetypesFileTypeMap;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/upload")
@Consumes("multipart/related")
public class UploadResource {

  @POST
  public String processMultipart(MimetypesFileTypeMap mimeMultipart){
    return null;
  }

  @POST
  @Consumes("application/x-www-form-urlencoded")
  public String processForm(){
    return null;

  }
}
