package com.gt.core;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * Created by Administrator on 2014/12/18.
 */
public class BaseService<E, PK extends Serializable> implements IBaseService<E, PK> {

    @Autowired
    private IBaseDao<E, PK> baseDao;

    @Override
    public E find(PK id) {
        return baseDao.get(id);
    }

    @Transactional
    @Override
    public E merge(E entity) {
        return this.baseDao.merge(entity);
    }

    @Transactional
    @Override
    public void remove(E entity) {
        this.baseDao.remove(entity);
    }

    @Transactional
    @Override
    public void persist(E account) {
        this.baseDao.persist(account);
    }

}
