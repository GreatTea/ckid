package com.gt.core;

/**
 * Created by Administrator on 14-9-9.
 */
public final class Constant {

    static final Constant INSTANCE = new Constant();

    private Constant() {

    }

    public static final String LOGIN_ACCOUNT = "LOGIN_ACCOUNT";
    public static final String LOGIN_USER = "LOGIN_USER";
    public static final String PERMISSION = "PERMISSION";

    public static final String AJAX_REQ_STATUS = "status";
    public static final String AJAX_REQ_MSG = "msg";
}
