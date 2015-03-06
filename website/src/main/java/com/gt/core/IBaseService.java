package com.gt.core;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by Administrator on 2014/12/18.
 */
public interface IBaseService<E, PK extends Serializable> {

    E find(PK id);

    void persist(E entity);

    E merge(E entity);

    void remove(E entity);
}
