package com.danylo.test.service;

import com.danylo.test.account.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAllAccounts();

    public Account getAccount(int id);

    public void saveAccount(Account account);

    public void updateAccount(Account account);

    public void deleteAccount(int id);

}
