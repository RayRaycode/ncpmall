<%--
  Created by IntelliJ IDEA.
  User: 45301
  Date: 2019/4/22
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

    <title>编辑用户</title>
<script>
    $(function(){

        $("#editForm").submit(function(){
            if(!checkEmpty("name","用户名"))
                return false;
            if(!checkEmpty("password","密码"))
                return false;
            return true;
        });
    });

</script>
<div class="workingArea">

    <ol class="breadcrumb">
        <li><a href="admin_category_list">用户管理</a></li>
        <li class="active">用户信息修改</li>
    </ol>

    <div class="panel panel-warning editDiv">
        <div class="panel-heading">修改用户信息</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="admin_user_update"  >
                <table class="editTable">
                    <tr>
                        <td>用户名</td>
                        <td><input  id="name" name="NAME" value="${us.NAME}" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>用户密码</td>
                        <td>
                            <input id="password"  name="password" value="${us.password}" type="text" class="form-control" />
                        </td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${us.id}">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>