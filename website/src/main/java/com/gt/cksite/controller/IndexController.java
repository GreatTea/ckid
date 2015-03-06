package com.gt.cksite.controller;

import com.gt.cksite.service.IDesignService;
import com.gt.core.test.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2015/3/4.
 */
@RequestMapping(value = "/ck")
@Controller
public class IndexController {

    @Autowired
    private HttpServletRequest request;

    @Resource
    private IDesignService designService;

    @RequestMapping(value = "index.html")
    public String index() {
        request.setAttribute("designs", this.designService.listDesign());
        return "/ck/index";
    }

    @RequestMapping(value = "profile.html")
    public String profile() {
        return "/ck/profile";
    }

    @RequestMapping(value = "blog.html")
    public String blog() {
        return "/ck/blog";
    }
}
