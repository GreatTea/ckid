package com.gt.workflow.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 14-8-29.
 */
@Entity
@Table(name="WF_FLOW_ROLE_REF")
public class FlowRoleRef implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", columnDefinition="bigint")
    private Long id;

    @Column(name="flow_role_id", columnDefinition = "varchar(32)")
    private String flowRoleId;

    @Column(name="flow_user_id", columnDefinition = "varchar(32)")
    private String flowUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlowRoleId() {
        return flowRoleId;
    }

    public void setFlowRoleId(String flowRoleId) {
        this.flowRoleId = flowRoleId;
    }

    public String getFlowUserId() {
        return flowUserId;
    }

    public void setFlowUserId(String flowUserId) {
        this.flowUserId = flowUserId;
    }
}
