package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("isolation2")
public class IsolationService2 {
    @Resource(name = "accountDao")
    AccountDao accountDao;

    @Transactional(noRollbackFor = NullPointerException.class)
    public void save(Account act) {
        accountDao.insert(act);
    }
}
