package com.gt.workflow.entity;

/**
 * Created by Administrator on 14-8-27.
 */
public enum ReadStatus {
    UNREAD("未读"),READ("已读");
    private String chinese;
    private ReadStatus(String chinese) {
        this.chinese = chinese;
    }
}
