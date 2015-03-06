package com.gt.workflow.dao.impl;

import com.gt.core.BaseDao;
import com.gt.workflow.dao.FlowNodeDao;
import com.gt.workflow.entity.FlowNode;
import com.gt.workflow.entity.Step;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 14-8-28.
 */
@Repository("flowNodeDaoImpl")
public class FlowNodeDaoImpl extends BaseDao<FlowNode, String> implements FlowNodeDao {

    @Override
    public FlowNode getStartNodeByFlowId(String flowId) {
        String hql = String.format(" from %s o where o.flow_id = ? and o.isFirst = 1", Step.class.getSimpleName());
        List<FlowNode> list = this.findListByHql(hql, new Object[]{flowId});
        return (0 == list.size()) ? null : list.get(0);
    }

    @Override
    public FlowNode getStartFlowNodeByFlowId(String flowId) {
        return null;
    }

}
