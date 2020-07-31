package com.example.debtManager.resource;

import com.example.debtManager.model.Account;
import com.example.debtManager.repository.AccountRepository;
import com.example.debtManager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.util.List;

@Path("acct")
public class AccountResource {

  @Autowired
  AccountService accountService;


  
  @GET
  @Produces({"application/json", "application/xml"})
  public List<Account> getAccounts(){

     return accountService.getAll();
  }

   @GET
   @Produces({"application/json", "application/xml"})
   @Path("/{id}")
   public Account getById(@PathParam("id") Long id){
      return accountService.getById(id);
   }

  @PUT
  @Produces({"application/json", "application/xml"})
  @Consumes("application/json")
  public Account createAccount(){
     return null;
  }
}
