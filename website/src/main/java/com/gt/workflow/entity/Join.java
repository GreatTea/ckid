package com.gt.workflow.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Administrator on 14-8-27.
 */
@Entity
@DiscriminatorValue(value = "WF_JOIN")
public class Join extends FlowType {

    @Column(name="is_dynamic")
    private Boolean isDynamic;

    @Column(name="work_join_resolver", length = 100)
    private String workJoinResolver;

    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    public String getWorkJoinResolver() {
        return workJoinResolver;
    }

    public void setWorkJoinResolver(String workJoinResolver) {
        this.workJoinResolver = workJoinResolver;
    }
}
