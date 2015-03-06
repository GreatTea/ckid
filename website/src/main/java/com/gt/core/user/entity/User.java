package com.gt.core.user.entity;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2014/11/25.
 */
@Entity
@Table(name = "C_USER")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User implements Serializable {

    @Id
    @Column(name = "ID", length = 32)
    protected String id;

    @Column(name = "NAME", length = 50)
    protected String name;

    @Column(name = "HIDE")
    protected Integer hide = 0;

    @Column(name = "INVALID")
    protected Integer invalid = 0;

    @Column(name = "TYPE")
    protected Integer type;

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
