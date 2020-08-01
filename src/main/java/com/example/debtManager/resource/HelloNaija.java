package com.example.debtManager.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hellonaija")
@Produces(MediaType.TEXT_PLAIN)
public class HelloNaija {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String greet(){
    return "Hello world ";
  }
}
