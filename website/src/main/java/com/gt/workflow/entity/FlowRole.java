package com.gt.workflow.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 14-8-29.
 */
@Entity
@Table(name="WF_FLOW_ROLE")
public class FlowRole implements Serializable {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="id", columnDefinition="VARCHAR(32)")
    private String id;

    @Column(name="name", columnDefinition="NVARCHAR(40)")
    private String name;

    @ManyToOne(fetch= FetchType.LAZY, optional=true)
    @JoinColumn(name="flow_id", columnDefinition="VARCHAR(32)")
    private Flow flow;

    @Transient
    private List<FlowRoleRef> flowRoleRefs;

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

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    public List<FlowRoleRef> getFlowRoleRefs() {
        return flowRoleRefs;
    }

    public void setFlowRoleRefs(List<FlowRoleRef> flowRoleRefs) {
        this.flowRoleRefs = flowRoleRefs;
    }
}
