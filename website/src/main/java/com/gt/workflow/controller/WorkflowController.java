package com.gt.workflow.controller;

import com.gt.workflow.entity.FlowUser;
import com.gt.workflow.service.WorkflowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 14-9-9.
 */
@RequestMapping(value = "/wf")
@Controller
public class WorkflowController {

    @Resource
    private WorkflowService workflowService;

    @RequestMapping(value = "startFlow")
    protected void startFlow(String flowId, String formId, HttpServletRequest request) {
        FlowUser user = null;
        this.workflowService.startFlow(flowId, formId, user);
    }

}
