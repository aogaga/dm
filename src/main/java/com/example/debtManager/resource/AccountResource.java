package com.example.debtManager.resource;

import com.example.debtManager.model.Account;
import com.example.debtManager.repository.AccountRepository;
import com.example.debtManager.service.AccountService;
import javax.print.attribute.standard.Media;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.util.List;

@Path("acct")
public class AccountResource {

  @Autowired
  AccountService accountService;


  
  @GET
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public List<Account> getAccounts(){

     return accountService.getAll();
  }

   @GET
   @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
   @Path("/{id}")
   public Account getById(@PathParam("id") Long id){
      return accountService.getById(id);
   }

  @PUT
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  @Consumes("application/json")
  public Account createAccount(){
     return null;
  }


  @DELETE
  @Path("/{id}")
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public String deleteAccount(@PathParam("id") Long id){
    return null;
  }



}
