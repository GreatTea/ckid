package com.gt.workflow.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 14-8-27.
 */
@Entity
@Table(name="WF_TODO")
public class StepTodo {

    @Id
    @Column(name="todo_id", length = 32)
    private String id;

    @Column(name="handle_id", length = 32, nullable = false)
    private String handleId;

    @Column(name="handle_name", length = 50)
    private String handleName;

    @Column(name="begin_date")
    private Date beginDate;

    @Column(name="end_date")
    private Date endDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    private Status status;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="read_status")
    private ReadStatus readStatus;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="work_id")
    private StepWork work;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public ReadStatus getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(ReadStatus readStatus) {
        this.readStatus = readStatus;
    }

    public StepWork getWork() {
        return work;
    }

    public void setWork(StepWork work) {
        this.work = work;
    }

    public String getHandleId() {
        return handleId;
    }

    public void setHandleId(String handleId) {
        this.handleId = handleId;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }
}
