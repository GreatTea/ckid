package com.gt.workflow.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Administrator on 14-8-27.
 */
@Entity
@Table(name="WF_WORK")
public class StepWork {

    @Id
    @Column(name="id", length = 32)
    private String id;

    @Column(name="name", length = 50)
    private String name;

    @Column(name="step_id", length = 32)
    private String stepId;

    @Column(name="step_name", length = 50)
    private String stepName;

    @Column(name="begin_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginDate;

    @Column(name="end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    private Status status;

    @Column(name="form_id")
    private String formId;

    @OneToMany(mappedBy="work", fetch=FetchType.LAZY, cascade={CascadeType.PERSIST})
    private Set<StepTodo> todos;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="flow_inst_id")
    private FlowInst flowInst;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name = "WF_MP_WORK", joinColumns = @JoinColumn(name = "from_work_id"), inverseJoinColumns = @JoinColumn(name = "to_work_id"))
    private Set<StepWork> children;

    public StepWork() {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public Set<StepTodo> getTodos() {
        return todos;
    }

    public void setTodos(Set<StepTodo> todos) {
        this.todos = todos;
    }

    public FlowInst getFlowInst() {
        return flowInst;
    }

    public void setFlowInst(FlowInst flowInst) {
        this.flowInst = flowInst;
    }

    public Set<StepWork> getChildren() {
        return children;
    }

    public void setChildren(Set<StepWork> children) {
        this.children = children;
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }
}
