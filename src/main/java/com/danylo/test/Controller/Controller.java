package com.danylo.test.Controller;


import com.danylo.test.account.Account;
import com.danylo.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class Controller {
    @Autowired
    private  AccountService accountService;


    @GetMapping
    public List<Account> getAllAccounts(){
        List<Account> accounts = accountService.getAllAccounts();
        return accounts;
    }

@GetMapping("/{id}")
    public Account getAccount(@PathVariable int id) {
        return accountService.getAccount(id);
    }
@PostMapping
    public void saveAccount(@RequestBody Account account){
        accountService.saveAccount(account);

    }

@PutMapping
    public void updateAccount(@RequestBody Account account){
        accountService.updateAccount(account);

    }
@DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable int id){
        Account account = accountService.getAccount(id);

    }

}
