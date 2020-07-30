package com.example.debtManager.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("acct")
public class AccountResource {


  @GET
  @Produces("application/json")
  public String getAccounts(){
    return "Hello World";
  }
}
