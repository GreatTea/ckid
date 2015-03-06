package com.gt.workflow.dao;

import com.gt.core.IBaseDao;
import com.gt.workflow.entity.FlowNode;

/**
 * Created by Administrator on 14-8-28.
 */
public interface FlowNodeDao extends IBaseDao<FlowNode, String> {

    FlowNode getStartNodeByFlowId(String flowId);

    FlowNode getStartFlowNodeByFlowId(String flowId);
}
