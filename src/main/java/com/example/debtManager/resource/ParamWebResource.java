package com.example.debtManager.resource;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;

@Path("web")
public class ParamWebResource {


  //@PathParam
  @GET
  @Path("{name}")
  public String getUSerByName(@PathParam("name") String name){

    return name;
  }

  //@QueryParam
  @GET
  @Path("/queryParam")
  public  String getUser(@QueryParam("name") String name){
    System.out.println("Name : " + name);
    return name;
  }

  //@DefaultValue
  @GET
  @Path("queryparam")
  public String getUserAge(@QueryParam("name") String name, @DefaultValue("15") @QueryParam("age") String age){

    System.out.println("Name: " + name );
    System.out.println("Age : " + age);
    return name;
  }



  //MatrixParam
  @GET
  @Path("/getUserById/{userId}")
  public Response getUserBySingleId(@PathParam("userId") String userId, @MatrixParam("name") String name, @DefaultValue("15") @MatrixParam("age") String age){
    return Response
        .status(200)
        .entity("id" + userId + " Name : " + name + "Age : " + age)
        .build();
  }


  //@HeaderParam
  @GET
  @Path("/getUserAgent")
  public String getUserDevice(@HeaderParam("user-agent") String userAgent, @HeaderParam("Content-Type")
      MediaType contentType){
    return "User Agent  :" + userAgent + "Content-Type : " + contentType;
  }


  // @CookieParam
  @GET
  @Path("/getCookies")
  public String getCookies(@CookieParam("sessionid") int sessionId){
    return "Session Id : " + sessionId;
  }

  @GET
  @Path("getCookies")
  public String getCookiesAll(@CookieParam("sessionid") int sessionId){
    return "session Id : " + sessionId;
  }


  @GET
  @Path("/getCookies")
  public String getCookiesAt(@CookieParam("user-agent")Cookie userAgentCookie){
  return
        "Name : " + userAgentCookie.getName() +
            "value : " + userAgentCookie.getValue() +
            "Domain : " + userAgentCookie.getDomain() +
            "Path : " + userAgentCookie.getPath() +
            "version : " + userAgentCookie.getVersion();
  }

  //@FormParam

  @POST
  @Path("/addUser")
  public void addUser(@FormParam("name") String name, @FormParam("id") String id){
    System.out.println("Add User: ");
    System.out.println("Id : " + id);
    System.out.println("Name: " + name);
  }

  @POST
  @Path("/addUser")
  public String addUser(MultivaluedHashMap<String, String> formData){
    return  "form data : " + formData;
  }




}
