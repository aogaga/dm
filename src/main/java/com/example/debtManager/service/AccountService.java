package com.example.debtManager.service;

import com.example.debtManager.model.Account;
import com.example.debtManager.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAll(){
        List<Account> accounts  = new ArrayList<>();
        accountRepository.findAll().forEach(account -> accounts.add(account));
        return accounts;
    }

    public Account getById(Long Id){
        return accountRepository.findById(Id).get();
    }
}
