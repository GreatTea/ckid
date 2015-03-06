package com.gt.core.ext;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2014/12/26.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ResponseBody
public @interface EasyUI {

    public enum Comp {
        DATA_GRID, TREE_GRID
    }

    Comp value();

}
