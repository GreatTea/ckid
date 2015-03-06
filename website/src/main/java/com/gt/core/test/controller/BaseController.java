package com.gt.core.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.DateFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.gt.core.G;
import com.gt.core.account.entity.Account;
import com.gt.core.IBaseService;
import com.gt.core.account.service.IAccountService;
import com.gt.core.ext.EasyUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2014/12/18.
 */
@RequestMapping("/account")
@Controller
public class BaseController {

    public String absJsp(String str) {
        return "/core" + this.getClass().getAnnotation(RequestMapping.class).value()[0] + "/" + str;
    }

    @Autowired
    private IAccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        System.out.println(G.V.get("VERSION"));
        return absJsp("index");
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String view(@PathVariable String id) {
        return absJsp("view");
    }

    @RequestMapping(value = "addPage")
    public String addAccount(Account account) {
        return absJsp("addPage");
    }

    @RequestMapping(value = "saveAccount")
    public String saveAccount(Account account) {
        this.accountService.saveAccount(account);
        throw new IllegalStateException("也穿过人山人海");
    }

    @EasyUI(EasyUI.Comp.TREE_GRID)
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable String id, Account account) {
        return null;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public String delAccount(@PathVariable String id) {
        return null;
    }

    public static void main(String[] args) {
        List<Account> as = new ArrayList<Account>();
        Account a = new Account();
        a.setId("afsad");
        a.setName("clarence");
        a.setLastLoginDate(new Date());
        as.add(a);
        JSONObject jo = new JSONObject();
        jo.put("rows", as);

        SerializeConfig config = new SerializeConfig();

        config.put(SimpleDateFormat.class, DateFormatSerializer.instance);
        SimplePropertyPreFilter sppf =  new SimplePropertyPreFilter(Account.class, "name", "lastLoginDate");
        System.out.println(JSON.toJSONString(as, config, sppf));
    }
}
