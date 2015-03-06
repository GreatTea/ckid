package com.gt.core.account.entity;

import com.gt.core.user.entity.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2014/11/25.
 */
@Entity
@Table(name = "C_ACCOUNT")
public class Account implements Serializable {

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

    @Column(name = "PASSWORD", length = 20)
    private String password;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "LAST_LOGIN_DATE")
    private Date lastLoginDate;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
