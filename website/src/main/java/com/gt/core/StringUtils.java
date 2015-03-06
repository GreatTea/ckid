package com.gt.core;

// 在线编辑
/**
 * Created by Administrator on 14-8-28.
 */
public class StringUtils {

    /**
     * 生成三十二位随机字符串
     * @return
     */
    public static String uuid() {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 判断字符串是否有实际意义
     * @param str
     * @return
     */
    public static boolean isMeaningFul(String str) {
        return (null != str) && (0 < str.trim().length());
    }

    /**
     * 匹配密码的方法
     * @param validPassword
     * @param input
     * @return
     */
    public static boolean validPassword(String validPassword, String input) {
        return validPassword.equals(input);
    }
}
