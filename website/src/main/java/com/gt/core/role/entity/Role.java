package com.gt.core.role.entity;

import com.gt.core.funs.entity.Func;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2014/11/25.
 */
@Entity
@Table(name = "C_ROLE")
public class Role implements Serializable {

    @Id
    @Column(name = "ID", length = 32)
    protected String id;

    @Column(name = "NAME", length = 50)
    protected String name;

    @Column(name = "TYPE")
    protected Integer type;

    @Column(name = "HIDE")
    protected Integer hide = 0;

    @Column(name = "INVALID")
    protected Integer invalid = 0;

    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(name="MP_ROLE_FUNC", joinColumns=@JoinColumn(name="ROLE_ID"), inverseJoinColumns=@JoinColumn(name="FUNC_ID"))
    @OrderBy("hierarchy asc, sort asc")
    private List<Func> funcs;

    public List<Func> getFuncs() {
        return funcs;
    }

    public void setFuncs(List<Func> funcs) {
        this.funcs = funcs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }
}

