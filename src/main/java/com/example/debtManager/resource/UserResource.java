package com.example.debtManager.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/userService")
public class UserResource {

  @GET
  public String getUser(){
    return  "john";
  }

  @GET
  @Path("/getUserName")
  public String getUserName(){
    return "John";
  }


  @Path("/getAddress")
  public AddressResource  getAddress(){
    return new AddressResource();
  }
}
