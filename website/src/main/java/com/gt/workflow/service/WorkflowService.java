package com.gt.workflow.service;

import com.gt.workflow.entity.FlowInst;
import com.gt.workflow.entity.FlowUser;

/**
 * Created by Administrator on 14-8-27.
 */
public interface WorkflowService {
    public FlowInst startFlow(String flowId, String flowInstId, FlowUser user);
}

