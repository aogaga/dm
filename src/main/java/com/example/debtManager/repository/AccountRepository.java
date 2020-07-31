package com.example.debtManager.repository;

import com.example.debtManager.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository  extends CrudRepository<Account, Long> {
 
}
