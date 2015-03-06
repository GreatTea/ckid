package com.gt.workflow.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 流程实例表
 * Created by Administrator on 14-8-27.
 */
@Entity
@Table(name="WF_FLOW_INST")
public class FlowInst {

    @Id
    @Column(name="ID", length = 32)
    private String id;

    @Column(name="NAME", length = 100)
    private String name;

    @ManyToOne(cascade={CascadeType.REFRESH}, fetch= FetchType.LAZY, optional=true)
    @JoinColumn(name="FLOW_ID", nullable=true)
    private Flow flow;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="STATUS")
    private Status status;

    @Column(name="BEGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginDate;

    @Column(name="END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name="CREATE_USER_ID", length = 32)
    private String createUserId;

    @Column(name="CREATE_USER_NAME", length = 100)
    private String createUsername;

    @Column(name="HIDE")
    private Boolean hide;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

}
