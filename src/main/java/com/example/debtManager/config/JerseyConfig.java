package com.example.debtManager.config;

import com.example.debtManager.resource.AccountResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
  public JerseyConfig(){
    register(AccountResource.class);
  }
}
