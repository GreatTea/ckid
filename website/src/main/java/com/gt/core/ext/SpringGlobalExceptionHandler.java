package com.gt.core.ext;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.gt.core.G;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.*;

/**
 * Created by Administrator on 2014/12/26.
 */
public class SpringGlobalExceptionHandler extends SimpleMappingExceptionResolver implements HandlerExceptionResolver {

    private final static List<Class<? extends Annotation>> JSON_RESULT_ANNOTATES = Collections.unmodifiableList(Arrays.asList(ResponseBody.class, EasyUI.class));

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception ex) {
        HandlerMethod hm = (HandlerMethod) o;

        /**
         * 如果是请求返回JSON格式的字符串。
         */
        for (Class<? extends  Annotation> a : JSON_RESULT_ANNOTATES) {
            if (null != hm.getMethodAnnotation(a)) {
                FastJsonJsonView view = new FastJsonJsonView();
                Map<String, Object> attributes = new HashMap<String, Object>();
                attributes.put(G.C.AJAX_REQ_STATUS, Boolean.FALSE);
                attributes.put(G.C.AJAX_REQ_MSG, ex.getMessage());
                view.setAttributesMap(attributes);
                return new ModelAndView(view);
            }
        }
        return super.doResolveException(request, response, o, ex);
    }
}
