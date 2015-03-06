package com.gt.core;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.persister.entity.AbstractEntityPersister;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Administrator on 14-8-27.
 */
public class BaseDao<E, PK extends Serializable> implements IBaseDao<E, PK> {

    protected Class<E> type;

    public BaseDao() {
        this.type = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Resource
    protected SessionFactory sessionFactory;

    @Override
    public String getTableName() {
        return ((AbstractEntityPersister) sessionFactory.getClassMetadata(type)).getTableName();
    }

    @Override
    public String getCanonicalName() {
        return ((AbstractEntityPersister) sessionFactory.getClassMetadata(type)).getEntityName();
    }

    @Override
    public E get(PK id) {
        return (E) this.sessionFactory.getCurrentSession().get(type, id);
    }

    @Override
    public void persist(E entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
    }

    @Override
    public void refresh(E entity) {
        this.sessionFactory.getCurrentSession().refresh(entity);
    }

    @Override
    public E merge(E entity) {
        return (E) sessionFactory.getCurrentSession().merge(entity);
    }

    @Override
    public void remove(E entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    @Override
    public List<E> findListByHql(String hql, Object[] params) {
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        if (null != params && 0 != params.length) {
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i, params[i]);
            }
        }
        return query.list();
    }

    @Override
    public List<E> findListByHql(String hql, int firstResult, int maxResult, Object[] params) {
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResult);
        if (null != params && 0 != params.length) {
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i, params[i]);
            }
        }
        return query.list();
    }

    @Override
    public <E> E getUniqueByHql(String hql, Object[] params) {
        List<E> list = (List<E>) this.findListByHql(hql, params);
        return (0 < list.size()) ? list.get(0) : null;
    }

}
