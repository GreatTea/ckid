package com.gt.workflow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 14-8-27.
 */
@Entity
@Table(name="WF_FLOW_TYPE")
public class FlowType {

    @Id
    @Column(name="id", columnDefinition="VARCHAR(32)")
    private String id;

    @Column(name="flow_type_name", columnDefinition="NVARCHAR(50)")
    private String name;

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
}
