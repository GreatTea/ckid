package com.gt.core.account.dao;

import com.gt.core.BaseDao;
import com.gt.core.IBaseDao;
import com.gt.core.account.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2014/12/18.
 */
@Repository
public class AccountDao extends BaseDao<Account, String> implements IAccountDao {

}
