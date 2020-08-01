package com.example.debtManager.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloWorld/{name}")
public class HelloWorldResource {


  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String sayHello(@PathParam("name") String name){
    return "Hello, " + name;
  }

  // path
}



