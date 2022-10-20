package com.danylo.test.service;

import com.danylo.test.account.Account;
import com.danylo.test.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AccountServiceimpl implements  AccountService{

    @Autowired
   private AccountDAO accountDAO;

    @Override
    @Transactional
    public List<Account> getAllAccounts() {
        return  accountDAO.getAllAccounts();
    }

    @Override
    @Transactional
    public Account getAccount(int id) {
         return accountDAO.getAccount(id);
    }

    @Override
    @Transactional
    public void saveAccount(Account account) {
accountDAO.saveAccount(account);
    }

    @Override
    @Transactional
    public void updateAccount(Account account) {
accountDAO.updateAccount(account);
    }


    public void deleteAccount(int id){
        accountDAO.deleteAccount(id);
}

}
