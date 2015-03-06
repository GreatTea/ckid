package com.gt.workflow.entity;

/**
 * Created by Administrator on 14-8-27.
 */
public interface StepForm {

    /**
     * 设置流程实例ID
     * @param flowInstId
     */
    public void setFlowInstId(String flowInstId);

    /**
     * 获取流程实例ID
     * @return
     */
    public String getFlowInstId();

    /**
     * 设置流程实例当前步骤ID
     */
    public void setCurStepId(String curStepId);

    /**
     * 获取流程实例当前步骤ID
     * @return
     */
    public String getCurStepId();
}
