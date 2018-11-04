<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="css/style.css"/>
		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

		<!--  <link rel="stylesheet" href="font/css/font-awesome.min.css" />-->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>
		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<!-- page specific plugin scripts --> 
		<title>用户组信息查看</title>
		</head>
		<body>
<div class="page-content clearfix">
          <div id="Member_Ratings">
    <div class="d_Confirm_Order_style">
              <form class="search_style" id="search_form_list">
               <%--用户组id   --%>
               <input type="hidden" name="role_id" value="${param.role_id}">

        <ul class="search_content clearfix">
                  <li>
            <label class="l_f">用户账号：</label>
            <input name="username" type="text"  class="text_add" placeholder="输入用户账号"  />
          </li>
                  <li>
            <label class="l_f">用户姓名：</label>
            <input name="name" type="text"  class="text_add" placeholder="输入用户姓名"  />
          </li>
                  <li>
            <label class="l_f">手机号：</label>
            <input name="tel" type="text"  class="text_add" placeholder="输入手机号"  />
          </li>
                  <li>
            <label class="l_f">部门：</label>
            <select name="post" style="width:90px">
                      <option value="0">--所有--</option>
                      <c:forEach items="${sessionScope.depts}" var="dept">
                          <option value="${dept.id}">${dept.dept_name}</option>
                      </c:forEach>
                    </select>
          </li>
                  <li style="width:90px;">
            <button type="button" class="btn_search" onclick="search_user_list()"><i class="icon-search"></i>查询</button>
          </li>
                </ul>
      </form>
              <div class="table_menu_list">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
                  <thead>
            <tr>
                      <th>账号</th>
                      <th>名称</th>
                      <th>年龄</th>
                      <th>电话</th>
                      <th>QQ</th>
                      <th>职务</th>
                      <th>角色</th>
                      <th>添加时间</th>
                      <th>状态</th>
                    </tr>
          </thead>
                  <tbody id="tbody">
                  <c:forEach items="${requestScope.Roleadmins}" var="admin">
                    <tr>
                        <td>${admin.username}</td>
                        <td>${admin.name}</td>
                        <td>${admin.age}</td>
                        <td>${admin.tel}</td>
                        <td>${admin.qq}</td>
                        <td>${admin.dept.dept_name}</td>
                        <td>${admin.adminRole.name}</td>
                        <td>${admin.add_time}</td>
                        <c:if test="${admin.state==1}">
                        <td class="td-status"><span class="label label-success radius">正常</span></td>
                        </c:if>
                        <c:if test="${admin.state==0}">
                            <td class="td-status"><span class="label label-defaunt radius">已停用</span></td>
                        </c:if>
                    </tr>
                    </c:forEach>
          </tbody>
                </table>
      </div>
            </div>
  </div>
        </div>
<div style="margin:0 auto; width:80px;">
          <button onclick="return_close();" class="btn btn-default radius" type="button">返回上一步</button>
        </div>
</body>
</html>
<script>
 /*查询*/
function search_user_list(){
    var from = $("#search_form_list").serialize();
    $.ajax({
        url:"SelectUserandRoleLike",
        type:"post",
        data:from,
        dataType:"json",
        success:function (data) {
            var html = "";
            for (var i = 0; i < data.length; i++) {
                html += "<tr><td>"+data[i].username+"</td>\n" +
                    "    <td>"+data[i].name+"</td>\n" +
                    "    <td>"+data[i].age+"</td>\n" +
                    "    <td>"+data[i].tel+"</td>\n" +
                    "    <td>"+data[i].qq+"</td>\n" +
                    "    <td>"+data[i].dept.dept_name+"</td>\n" +
                    "    <td>"+data[i].adminRole.name+"</td>\n" +
                    "    <td>"+data[i].add_time+"</td>";
                if(data[i].state==1){
                    html+="<td class=\"td-status\"><span class=\"label label-success radius\">正常</span></td></tr>";
                }else{
                    html+="<td class=\"td-status\"><span class=\"label label-defaunt radius\">已停用</span></td></tr>";
                };
            }
            $("#tbody").html(html);
        }
    })

}	 

	 //返回操作
function return_close(){
	location.href="user-group.jsp";
	  
	}
</script>