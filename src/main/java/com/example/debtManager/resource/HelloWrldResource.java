package com.example.debtManager.resource;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.data.repository.query.Param;

@Path("/helloWrld")
public class HelloWrldResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("{name : ([a-zA-Z])}")
  public String sayHello(@PathParam("name") String name ){
    return "hello " + name ;
  }

  @GET
  public String getUser(){
    System.out.println("GET");
    return "Hello User";
  }

  @PUT
  public void updateUser(String userData){
    System.out.println("PUT");
    System.out.println("User Data" + userData);
  }

  @POST
  public void addUser(@FormParam("id") String id, @FormParam("name") String name){
    System.out.println("POST");
    System.out.println("id" + id);
    System.out.println("Name: " + name);
  }

  @DELETE
  @Path("{name}")
  public void delete(@PathParam("name") String name){
    System.out.println("DELETE : " + name);
  }
}
