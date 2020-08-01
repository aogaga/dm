package com.example.debtManager.resource;

import com.example.debtManager.model.UserBean;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/beanresource")
public class BeanResource {

  @GET
  @Path("/getUserDetails/{id}")
  public String getUser(@BeanParam UserBean userBean){
    return "User Bean " + userBean.toString();
  }
}
