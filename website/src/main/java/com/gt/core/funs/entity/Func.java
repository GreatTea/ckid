package com.gt.core.funs.entity;

import com.gt.core.role.entity.Role;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2014/11/25.
 */
@Entity
@Table(name = "C_FUNC")
public class Func {

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

    @Column(name = "PARENT_ID", length = 32)
    private String parentId;

    @Column(name = "HIERARCHY")
    private Integer hierarchy = 1;

    @Column(name = "HREF", length = 200)
    private String href;

    @ManyToMany(mappedBy="funcs", fetch= FetchType.LAZY)
    @OrderBy("sort asc")
    private List<Role> roles;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Integer hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
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
