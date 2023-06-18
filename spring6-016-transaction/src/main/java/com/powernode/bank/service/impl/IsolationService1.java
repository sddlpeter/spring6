package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service("isolation1")
public class IsolationService1 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void getByActno(String actno) {
        Account account = accountDao.selectByActno(actno);
        System.out.println("account info: " + account);
    }
}
