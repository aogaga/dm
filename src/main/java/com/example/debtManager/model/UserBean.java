package com.example.debtManager.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class UserBean {

  @PathParam("id")
  private String id;

  @MatrixParam("name")
  private String name;

  @MatrixParam("age")
  private String age;

  @DefaultValue("No address provided")
  @QueryParam("address")
  private String address;

  @HeaderParam("user-agent")
  private String userAgent;

  public String toString(){
    return
        "Id: " + id +
            "\nName : " + name +
            "\nAge : " + age +
            "\nAddress : " + address +
            "\nUser Agent : " + userAgent + "\n";

  }
}
