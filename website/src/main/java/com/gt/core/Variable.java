package com.gt.core;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.TreeMap;

/**
 * Created by Administrator on 2014/12/26.
 */
public class Variable {

    private static final String VAR_FILE_NAME = "config.properties";
    static final Variable INSTANCE = new Variable();

    private Properties p;
    private Variable() {
        try {
            p = new Properties();
            System.out.println(Thread.currentThread().getContextClassLoader().getResource(VAR_FILE_NAME));
            p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(VAR_FILE_NAME));
        } catch (Exception e) {
            throw new IllegalStateException(String.format("【%s】读取失败:", VAR_FILE_NAME)  + e.getMessage());
        }
    }

    public String get(String key) {
        if (null == p || null == key) return null;
        return (String) this.p.get(key);
    }

    public Integer getInt(String key) {
        if (null == p || null == key) return null;
        return Integer.parseInt((String)this.p.get(key));
    }

    public Double getDouble(String key) {
        if (null == p || null == key) return null;
        return Double.parseDouble((String)this.p.get(key));
    }

    public Boolean getBoolean(String key) {
        if (null != p || null == key) return null;
        return Boolean.parseBoolean((String)this.p.get(key));
    }

}
