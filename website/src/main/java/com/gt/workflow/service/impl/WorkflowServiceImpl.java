package com.gt.workflow.service.impl;

import com.gt.core.StringUtils;
import com.gt.workflow.dao.FlowDao;
import com.gt.workflow.dao.FlowInstDao;
import com.gt.workflow.dao.FlowNodeDao;
import com.gt.workflow.entity.*;
import com.gt.workflow.service.WorkflowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by Administrator on 14-8-27.
 */
@Service("WorkflowServiceImpl")
public class WorkflowServiceImpl implements WorkflowService {

    @Resource(name="flowDaoImpl")
    protected FlowDao flowDao;

    @Resource(name="flowInstDaoImpl")
    protected FlowInstDao flowInstDao;

    @Resource(name="flowNodeDaoImpl")
    protected FlowNodeDao flowNodeDao;

    @Transactional
    @Override
    public FlowInst startFlow(String flowId, String flowInstId, FlowUser user) {

        Flow flow = this.flowDao.get(flowId);
        if (null == flow) {
            throw new IllegalStateException("没有找到相应的流程配置信息，不能发起流程。");
        }

        // 获取流程起始步骤
        FlowNode firstNode = flowNodeDao.getStartFlowNodeByFlowId(flow.getId());
        if (null == firstNode) {
            throw new IllegalStateException("还没有设置相关的流程步骤，不能发起流程。");
        }

        FlowInst flowInst = this.createFlow(flow, flowInstId, user);
        return null;
    }

    /**
     * 根据流程类型，流程标识，创建用户来创建一个流程实例。
     * 其中流程标识如果为空。则使用随机三十二位编码来做为ID。
     * @param flow
     * @param flowInstId
     * @param user
     * @return
     */
    @Transactional
    private FlowInst createFlow(Flow flow, String flowInstId, FlowUser user) {
        FlowInst flowInst = new FlowInst();
        flowInst.setFlow(flow);
        flowInst.setBeginDate(new Date());
        flowInst.setEndDate(new Date());
        flowInst.setStatus(Status.HANDLING);
        flowInst.setHide(Boolean.FALSE);
        if (null != user) {
            flowInst.setCreateUserId(user.getId());
            flowInst.setCreateUsername(user.getName());
        }
        flowInst.setId(StringUtils.isMeaningFul(flowInstId) ? flowInstId : StringUtils.uuid());
        return flowInst;
    }
}
