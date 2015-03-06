package com.gt.core;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2014/11/25.
 */
public final class G {

    public static final Constant C = Constant.INSTANCE;
    public static final Variable V = Variable.INSTANCE;

    public static final class SafeDateFormat {
        private ThreadLocal<DateFormat> threadLocal;
        private SafeDateFormat(final String format) {
            threadLocal = new ThreadLocal<DateFormat>() {
                @Override
                protected synchronized DateFormat initialValue() {
                    return new SimpleDateFormat(format);
                }
            };
        }
        public Date parse(String dateStr) throws ParseException {
            if (null == dateStr) return null;
            dateStr = dateStr.trim();
            if (0 == dateStr.length()) return null;
            return threadLocal.get().parse(dateStr);
        }

        public String format(Object date) {
            if (null == date) return "";
            return threadLocal.get().format(date);
        }
    }

    public final static SafeDateFormat YMD = new SafeDateFormat("yyyy-MM-dd");
    public final static SafeDateFormat YMD_H = new SafeDateFormat("yyyy-MM-dd HH");
    public final static SafeDateFormat YMD_HM = new SafeDateFormat("yyyy-MM-dd HH:mm");
    public final static SafeDateFormat YMD_HMS = new SafeDateFormat("yyyy-MM-dd HH:mm:ss");

    public final static SafeDateFormat CYMD = new SafeDateFormat("yyyy年MM月dd日");
    public final static SafeDateFormat CYMD_H = new SafeDateFormat("yyyy年MM月dd日 HH时");
    public final static SafeDateFormat CYMD_HM = new SafeDateFormat("yyyy年MM月dd日 HH时mm分");
    public final static SafeDateFormat CYMD_HMS = new SafeDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

    public final static SafeDateFormat UUDT = new SafeDateFormat("yyyyMMddHHmmssSSS");
}
