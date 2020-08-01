package com.example.debtManager.resource;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

public class AddressResource {

  @GET
  public Response getUserName(){
    return  Response
        .status(200)
        .entity("Address")
        .build();

  }
}
