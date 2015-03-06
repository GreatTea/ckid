<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <base href="<%=basePath %>" />
    <title><s:message code="SYS_TITLE" /></title>
    <meta content="text/html; charset=utf-8" http-equiv="content-type" />
    <script src="grs/jslib/jquery-1.9.1.min.js"></script>
    <script src="grs/jslib/jquery-easyui-1.3.4/jquery.easyui.min.js"></script>
    <script src="grs/jslib/jquery.SuperSlide.js"></script>
    <script src="grs/jslib/TogetherJS.js"></script>
    <link href="<s:message code="CRS" />/css/new-login.css" rel="stylesheet" type="text/css" />
</head>
<body style="overflow-y:hidden;">
	<div class="header">
		<div class="headerLogo">
			<a title="<s:message code="SYS_TITLE" />" target="_self" href="#">
				<img alt="logo"  id="loginLogo" src="<s:message code="CRS" />/img/auditLogo1.png">
			</a>
			<h1 class="hide">
			<a title="<s:message code="SYS_TITLE" />" target="_self" href="#"><s:message code="SYS_TITLE" /></a>
			</h1>
		</div>
		<div class="headerNav">
			<a  href="javascript:void(0)">政府官网</a>
			<a  href="javascript:void(0)">财局官网</a>
			<a  href="javascript:void(0)">关于易达</a>
			<a  href="javascript:void(0)" onclick="TogetherJS(this)">实时协助</a>
			<a href="<%=basePath%>/enterprise/editEnterpriseInfo?fsn=0&editSubType=1&view=&fsystemType=2">企业注册</a>
			
			<!-- <a target="_blank" href="http://www.zhuhai.gov.cn/">政府官网</a>
			<a target="_blank" href="http://www.zhcz.gov.cn/">财局官网</a>
			<a target="_blank" href="http://www.gczj.com.cn/">关于易达</a>
			<a target="_blank" href="#">系统帮助</a> -->
		</div>
	</div>

	<div class="banner">
		<div class="login-aside">
			<div id="o-box-up"></div>
			<div id="o-box-down" style="table-layout:fixed;">
				<div class="error-box">错误信息</div>
				<form id="login_form"  action="user/login" method="post">
				<input name="requestUrl" type="hidden" value="${param.requestUrl}"/>
					<div class="fm-item">
						<label class="form-label">帐 号</label>
						<input type="text" id="accounts" name="accounts" placeholder="输入用户名" class="i-text" />
						<div class="ui-form-explain"></div>
					</div>

					<div class="fm-item">
						<label class="form-label">密 码</label>
						<input type="password" id="password" name="password" placeholder="输入密码" class="i-text" />
						<div class="ui-form-explain"></div>
					</div>
					
					<div class="fm-item">
						<label class="form-label"></label>
						<input type="submit" value="" tabindex="4" id="login" class="btn-login">
						<div class="ui-form-explain"></div>
					</div>
				</form>
			</div>
		</div>

		<div class="bd">
			<ul>
				<li style="background:url(<s:message code="CRS" />/img/theme-pic1.jpg) #CCE1F3 center 0 no-repeat;"></li>
				<li style="background:url(<s:message code="CRS" />/img/theme-pic2.jpg) #BCE0FF center 0 no-repeat;"></li>
				<li style="background:url(<s:message code="CRS" />/img/theme-pic3.jpg) #BCE0FF center 0 no-repeat;"></li>
				<li style="background:url(<s:message code="CRS" />/img/theme-pic4.jpg) #BCE0FF center 0 no-repeat;"></li>
				<!-- <li style="background:url(images/themes/theme-pic5.jpg) #BCE0FF center 0 no-repeat;"></li> -->
			</ul>
		</div>

		<div class="hd">
			<ul></ul>
		</div>
	</div>

	<div class="banner-shadow"></div>

	<div class="footer">
		<s:message code="SYS_TITLE" />
		<br /><br /> 
		Copyright © 2014-2049 All Rights Reserved Powered By <s:message code="SYS_TITLE" />
		<br /><br /> 
		技术支持:<a href="http://www.gczj.com.cn" target="_blank" title="<s:message code="DEVELOP_COMPANY_NAME" />"><s:message code="DEVELOP_COMPANY_NAME" /></a>
	</div>

    <script>
        $(function() {
            $(".i-text").on("focus", function(){
                $(this).addClass('h-light');
            });

            $(".i-text").on("blur", function(){
                $(this).removeClass('h-light');
            });

            //简单验证一下。
            var subimtLoginForm = function() {
                if ('' === $.trim($('#accounts').val())) {
                    $("#accounts").css({
                        "border" : "1px solid red"
                    });
                } else if ('' === $.trim($('#password').val())) {
                    $("#password").css({
                        "border" : "1px solid red"
                    });
                } else {
                    $('#login_form').submit();
                    $(".error-box").text("正在登录系统，请稍后...");
                }
            };

            $('#accounts, #password').bind('keydown', function(ev) {
                if (13 == ev.keyCode) {
                    return subimtLoginForm() && false;
                }
                ev.stopPropagation();
            });

            $('#login').bind('click', function(ev) {
                return subimtLoginForm() && false;
            });

            $('#loginReset').bind('click', function(ev) {
                $("#accounts").val("");
                $("#password").val("");
            });

            $(window).resize(function(){
                var width = $(window).width();
                if(width >= 855){
                    $('.login-aside').css('right','15%');
                    $('#loginLogo').removeClass('hide').parent().next().addClass('hide');
                }else if(width >= 755 && width <= 855){
                    $('.login-aside').css('right','25%');
                    $('#loginLogo').removeClass('hide').parent().next().addClass('hide');
                }else if(width >= 655 && width <= 755){
                    $('.login-aside').css('right','35%');
                    $('#loginLogo').addClass('hide').parent().next().removeClass('hide');
                }else if(width >= 370 && width <= 655){
                    $('.login-aside').css('right','55%');
                    $('#loginLogo').addClass('hide').parent().next().removeClass('hide');
                }else{
                    $('.login-aside').css('right','65%');
                    $('#loginLogo').addClass('hide').parent().next().removeClass('hide');
                }
            });

            $(".banner").slide({
                titCell : ".hd ul",
                mainCell : ".bd ul",
                effect : "fold",
                autoPlay : true,
                autoPage : true,
                trigger : "click"
            });
        });
    </script>
</body>
</html>