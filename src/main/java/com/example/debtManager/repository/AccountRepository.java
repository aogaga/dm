package com.example.debtManager.repository;

import com.example.debtManager.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account, Integer> {

}
