package com.gt.workflow.entity;

/**
 * Created by Administrator on 14-8-27.
 */
public enum Status {
    HANDLING("处理中")
    ,COMPLETE("已完成")
    ,SUSPEND("挂起");
    private String chinese;
    private Status(String chinese) {
        this.chinese = chinese;
    }
}
