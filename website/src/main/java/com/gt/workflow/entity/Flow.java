package com.gt.workflow.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 流程定义表
 * Created by Administrator on 14-8-27.
 */
@Entity
@Table(name="WF_FLOW")
public class Flow implements Serializable {

    @Id
    @Column(name="ID", length = 32)
    private String id;

    /**
     * 名称
     */
    @Column(name="NAME", length = 100)
    private String name;

    /**
     * 编码
     */
    @Column(name="CODE", length = 30)
    private String code;

    /**
     * 是否有效
     */
    @Column(name="INVALID")
    private Boolean invalid = Boolean.FALSE;

    /**
     * 是否在数据库中隐藏，系统中对该数据不可见
     */
    @Column(name="HIDE")
    private Boolean hide = Boolean.FALSE;

    /**
     * 流程类型ID
     */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FLOW_TYPE_ID", nullable = false, insertable = false, updatable = false)
    private FlowType flowType;

    /**
     * 流程发起页面
     */
    @Column(name="START_PAGE", length = 200)
    private String startPage;

    /**
     * 流程工作页面
     */
    @Column(name="WORK_PAGE", length = 200)
    private String workPage;

    /**
     * 排序
     */
    @Column(name="SORT_CODE", nullable=false)
    private String sortCode;

    /**
     * 备注
     */
    @Column(name="REMARK", length = 200)
    private String remark;

    public Flow() {

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public FlowType getFlowType() {
        return flowType;
    }

    public void setFlowType(FlowType flowType) {
        this.flowType = flowType;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public String getWorkPage() {
        return workPage;
    }

    public void setWorkPage(String workPage) {
        this.workPage = workPage;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
