package com.gt.core.account.service;

import com.gt.core.account.entity.Account;
import com.gt.core.IBaseService;

/**
 * Created by Administrator on 2014/12/18.
 */
public interface IAccountService extends IBaseService<Account, String> {

    void saveAccount(Account account);
}
