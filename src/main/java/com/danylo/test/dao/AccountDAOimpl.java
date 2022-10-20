package com.danylo.test.dao;


import com.danylo.test.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AccountDAOimpl implements AccountDAO {
    @Autowired
    private EntityManager entityManager;

    public List<Account> getAllAccounts() {

        Query query = entityManager.createQuery("from Account");
        List<Account> accountList = query.getResultList();
        return accountList;
    }

    public Account getAccount(int id) {

        Account account = entityManager.find(Account.class, id);

        return account;
    }

    public void saveAccount(Account account) {

        Account newAccount = entityManager.merge(account);
        account.setId(newAccount.getId());

    }


    public void updateAccount(Account account) {
        Account newaccount = entityManager.merge(account);
    }

    public void deleteAccount(int id){


        Query query = entityManager.createQuery("delete from Account where id =:id");
      query.setParameter("id", id);
      query.executeUpdate();
    }

}
