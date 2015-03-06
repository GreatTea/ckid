package com.gt.workflow.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Administrator on 14-8-27.
 */
@Entity
@DiscriminatorValue(value = "STEP")
public class Step extends FlowNode {

    @Column(name="is_first")
    private Boolean isFirst;

    public Boolean getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }
}
