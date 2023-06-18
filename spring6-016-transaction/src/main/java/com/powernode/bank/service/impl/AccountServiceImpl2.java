package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService2")
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class AccountServiceImpl2 implements AccountService {

    @Resource(name = "accountDao")
    AccountDao accountDao;
    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }

    @Override
    public void save(Account act) {
        accountDao.insert(act);
    }
}
