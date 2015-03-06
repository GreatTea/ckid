package com.gt.core.account.service;

import com.gt.core.account.entity.Account;
import com.gt.core.BaseService;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/18.
 */
@Service
public class AccountService extends BaseService<Account, String> implements IAccountService {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void saveAccount(Account account) {
        try {
            SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("select name from tbbaseData");
            List<Object[]> list = query.list();
            for (Object[] o : list) {
                System.out.println(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
