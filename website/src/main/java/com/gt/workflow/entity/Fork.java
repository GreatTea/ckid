package com.gt.workflow.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Administrator on 14-8-27.
 */
@Entity
@DiscriminatorValue(value = "WF_FORK")
public class Fork extends FlowNode {

    @Column(name="is_dynamic")
    private Boolean isDynamic;

    @Column(name="work_fork_resolver", length = 100)
    private String workForkResolver;

    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    public String getWorkForkResolver() {
        return workForkResolver;
    }

    public void setWorkForkResolver(String workForkResolver) {
        this.workForkResolver = workForkResolver;
    }
}
