package com.gt.core;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 14-8-27.
 */
public interface IBaseDao<E, PK extends Serializable> {

    /**
     *获取该接口实现类操作的数据库表
     */
    String getTableName();

    /**
     * 获取该接口实现类操作的实体类的canonicalName;
     * @return
     */
    String getCanonicalName();

    /**
     * 通过Id获取实体类对象。
     * @param id
     * @return
     */
    E get(PK id);

    /**
     * 对不同状态下的实例A，persist会产生以下操作：
     * 1.如果A是一个new状态的实体，它将会转为managed状态；
     * 2.如果A是一个managed状态的实体，它的状态不会发生任何改变。但是系统仍会在数据库执行INSERT操作；
     * 3.如果A是一个removed状态的实体，它将会转换为受控状态；
     * 4.如果A是一个detached状态的实体，该方法会抛出IllegalArgumentException异常，具体异常根据不同的JPA实现有关。
     * @param entity
     */
    void persist(E entity);

    /**
     * 对不同状态下的实例A，refresh会产生以下操作：
     * 1.如果A是一个new状态的实例，不会发生任何操作，但有可能会抛出异常，具体情况根据不同JPA实现有关；
     * 2.如果A是一个managed状态的实例，它的属性将会和数据库中的数据同步；
     * 3.如果A是一个removed状态的实例，不会发生任何操作；
     * 4.如果A是一个detached状态的实体，该方法将会抛出异常。
     * @param entity
     */
    void refresh(E entity);

    /**
     * 对不同状态下的实例A，merge会产生以下操：
     * 1.如果A是一个detached状态的实体，该方法会将A的修改提交到数据库，并返回一个新的managed状态的实例A2；
     * 2.如果A是一个new状态的实体，该方法会产生一个根据A产生的managed状态实体A2；
     * 3.如果A是一个managed状态的实体，它的状态不会发生任何改变。但是系统仍会在数据库执行UPDATE操作；
     * 4.如果A是一个removed状态的实体，该方法会抛出IllegalArgumentException异常。
     * @param entity
     * @return
     */
    E merge(E entity);

    /**
     * 对不同状态下的实例A，remove会产生以下操作：
     * 1.如果A是一个new状态的实例，A的状态不会发生任何改变，但系统仍会在数据库中执行DELETE语句；
     * 2.如果A是一个managed状态的实例，它的状态会转换为removed；
     * 3.如果A是一个removed状态的实例，不会发生任何操作；
     * 4.如果A是一个detached状态的实体，该方法将会抛出异常。
     * @param entity
     */
    void remove(E entity);

    /**
     * 根据HQL查询语句、参数列表、分页信息，将数据封装为dao实现类泛型指定的实体类型
     * @param hql
     * @param params
     * @return
     */
    List<E> findListByHql(String hql, Object[] params);

    /**
     * 根据HQL查询语句、参数列表、分页信息，将数据封装为dao实现类泛型指定的实体类型
     * @param hql
     * @param firstResult
     * @param maxResult
     * @param params
     * @return
     */
    List<E> findListByHql(String hql, int firstResult, int maxResult, Object[] params);

    /**
     * 根据HQL查询唯一的一条记录
     * @param hql
     * @param params
     * @param <E>
     * @return
     */
    <E> E getUniqueByHql(String hql, Object[] params);
}
