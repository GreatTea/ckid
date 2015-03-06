<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-27
  Time: 上午9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <base href="<%=basePath%>"/>
    <script src="grs/js/jquery-1.11.2.min.js"></script>

    <link rel="stylesheet" href="grs/js/jquery-easyui-1.4.1/themes/bootstrap/easyui.css">
    <script src="grs/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>

    <style>
        nav ul {list-style: none inside; margin:0px; padding:0px; width:100%;}
        nav ul li {height:50px; line-height:50px; border: 1px solid skyblue;}

    </style>
</head>
<body>
    <div class="easyui-layout" fit="true">
        <div data-options="region:'north', border:true, split:true" style="height:120px">
            sdfsaf

        </div>
        <div data-options="region:'center', border:true" >

            <div class="easyui-layout" fit="true">

                <div data-options="region:'west', border:true, split:true" style="width:150px">
                    <nav>
                        <ul>
                            <li>项目管理</li>
                            <li>投资监控</li>
                        </ul>
                    </nav>
                </div>

                <div data-options="region:'center', border:true"></div>
            </div>
        </div>

        <div data-options="region:'south'" style="height:30px"></div>
    </div>
</body>
</html>
