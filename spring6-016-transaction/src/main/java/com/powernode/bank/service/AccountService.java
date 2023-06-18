package com.powernode.bank.service;

import com.powernode.bank.pojo.Account;

public interface AccountService {
    void transfer(String fromActno, String toActno, double money);

    void save(Account act);
}
