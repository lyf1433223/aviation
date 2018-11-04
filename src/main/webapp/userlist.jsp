<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
 
		<script src="assets/layer/layer.js" type="text/javascript" ></script>
<script type="text/javascript" src="js/H-ui.js"></script>
		<title>用户列表</title>
		</head>

		<body>
<div class="page-content clearfix">
          <div id="Member_Ratings">
    <div class="d_Confirm_Order_style">
              <form class="search_style" id="search_form" action="selectUserLike" method="post">
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
            <button type="button" class="btn_search" onclick="search_user()"><i class="icon-search"></i>查询</button>
          </li>
                </ul>
      </form>
              <!---->
              <div class="border clearfix"> <span class="l_f"> <a href="javascript: " id="member_add" class="btn btn-warning"><i class="icon-plus"></i>添加用户</a>  </span> <span class="r_f">共：<b>2</b> 条</span> </div>
              <!---->
              <div class="table_menu_list">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
                  <thead>
            <tr>
                      <th width="25"><label>
                          <input type="checkbox" class="ace">
                          <span class="lbl"></span></label></th>
                      <th  >账号</th>
                      <th  >名称</th>
                      <th  >年龄</th>
                      <th >电话</th>
                      <th >QQ</th>
                      <th >邮箱</th>
                      <th >职务</th>
                      <th >角色</th>
                      <th >添加时间</th>
                      <th >状态</th>
                      <th width="180">操作</th>
                    </tr>
          </thead>
                  <tbody id="tbody">
                  <c:forEach items="${sessionScope.Admins}" var="admin">
            <tr>
                      <td><label>
                          <input type="checkbox" class="ace">
                          <span class="lbl"></span></label></td>
                      <td>${admin.id}</td>
                      <td>${admin.name}</td>
                      <td>${admin.age}</td>
                      <td>${admin.tel}</td>
                      <td>${admin.qq}</td>
                      <td>${admin.email}</td>
                      <td >${admin.dept.dept_name}</td>
                      <td>${admin.adminRole.name}</td>
                      <td>${admin.add_time}</td>
                      <c:if test="${admin.state==1}">
                          <td class="td-status"><span class="label label-success radius">正常</span></td>
                          <td class="td-manage"><a onClick="member_stop(this,${admin.id},${admin.state})"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> <a title="编辑" onclick="member_edit(this,${admin.id})" href="javascript:;"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a> <a title="删除" href="javascript:;"  onclick="member_del(this,${admin.id})" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a></td>
                      </c:if>
                      <c:if test="${admin.state==0}">
                          <td class="td-status"><span class="label label-defaunt radius">已停用</span></td>
                          <td class="td-manage"><a onClick="member_start(this,${admin.id},${admin.state})"  href="javascript:;" title="启用"  class="btn btn-xs"><i class="icon-ok bigger-120"></i></a> <a title="编辑" onclick="member_edit(this,${admin.id})" href="javascript:;"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a> <a title="删除" href="javascript:;"  onclick="member_del(this,${admin.id})" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a></td>
                      </c:if>
                    </tr>
                  </c:forEach>
          </tbody>
                </table>
      </div>
            </div>
  </div>
        </div>
<!--添加用户图层-->
<form class="add_menber" id="add_menber_style" style="display:none" method="post">
    <input name="id" type="hidden"/>
<ul class=" page-content">
          <li>
    <label class="label_name">用户账号：</label>
    <span class="add_name">
            <input name="username" content="账号" type="text"  class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name">用户姓名：</label>
    <span class="add_name">
            <input name="name" content="姓名" type="text"  class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name">所属部门：</label>
    <span class="add_name">
            <select name="dept" class="text_add" style="width:160px; margin-left:9px;">
      <div class="prompt r_f">
      </div>
      <c:forEach items="${sessionScope.depts}" var="dept">
          <option value="${dept.id}">${dept.dept_name}</option>
      </c:forEach>
    </select>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name"> QQ：</label>
    <span class="add_name">
            <input name="qq" type="text" content="qq" class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li>
    <label class="label_name">联系电话：</label>
    <span class="add_name">
            <input name="tel" type="text" content="联系电话" class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
    <li>
        <label class="label_name">电子邮箱：</label>
        <span class="add_name">
            <input name="email" type="text" content="邮箱" class="text_add"/>
            </span>
        <div class="prompt r_f"></div>
    </li>
          <li>
    <label class="label_name">用户年龄：</label>
    <span class="add_name">
            <input name="age" type="text" content="年龄" class="text_add"/>
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li >
    <label class="label_name">初始密码：</label>
    <span class="add_name">
            <input name="password" type="text" content="密码" class="text_add" />
            </span>
    <div class="prompt r_f"></div>
  </li>
          <li >
    <label class="label_name">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
    <span class="add_name">
            <label>
      <input name="sex" value="1" type="radio" checked="checked" class="ace">
      <span class="lbl">男</span></label>
            &nbsp;&nbsp;&nbsp;
            <label>
      <input name="sex" value="2" type="radio" class="ace">
      <span class="lbl">女</span></label>
            &nbsp;&nbsp;&nbsp; </span>
    <div class="prompt r_f"></div>
  </li>
    <li>
        <label class="label_name">备注：</label>
        <span class="add_name">
            <input name="remark" type="email" class="text_add"/>
            </span>
        <div class="prompt r_f"></div>
    </li>
  <li style="width:60%;">
    <label class="label_name">用户组：</label>
    <span class="add_name">
        <c:forEach items="${sessionScope.roles}" var="role">
            <label>
      <input name="adminRole" value="${role.id}" type="radio" checked="checked" class="ace">
      <span class="lbl">${role.name}</span></label>
            &nbsp;&nbsp;&nbsp;
        </c:forEach>
            &nbsp;&nbsp;&nbsp;</span>
            <label>
    <div class="prompt r_f"></div>
            </label>
  </li>
        </ul>
</form>
</body>
</html>
<script>
   var trs = $("#tbody").find("tr");
   $(".r_f").find("b").html(trs.length);



/*用户-添加*/
 $('#member_add').on('click', function(){
     document.getElementById("add_menber_style").reset();
    layer.open({
        type: 1,
        title: '添加用户',
		maxmin: true, 
		shadeClose: true, //点击遮罩关闭层
        area : ['800px' , ''],
        content:$('#add_menber_style'),
		btn:['提交','取消'],
		yes:function(index,layero){	
		 var num=0;
		 var str="";
     $(".add_menber input[type$='text']").each(function(n){
          if($(this).val()=="")
          {
			   layer.alert(str+=""+$(this).attr("content")+"不能为空！\r\n",{
                title: '提示框',				
				icon:0,								
          }); 
		    num++;
            return false;            
          } 
		 });
		  if(num>0){  return false;}
          else{
              var from = $("#add_menber_style").serialize();
              $.ajax({
                  url: "AddUser",
                  type: "post",
                  data: from,
                  dataType: "json",
                  success:function (data) {
                      var tbody = $("#tbody");
                      var html = "<tr><td><label>\n" +
                          "                          <input type=\"checkbox\" class=\"ace\">\n" +
                          "                          <span class=\"lbl\"></span></label></td>\n" +
                          "                      <td>"+data.id+"</td>\n" +
                          "                      <td>"+data.name+"</td>\n" +
                          "                      <td>"+data.age+"</td>\n" +
                          "                      <td>"+data.tel+"</td>\n" +
                          "                      <td>"+data.qq+"</td>\n" +
                          "                      <td>"+data.email+"</td>\n" +
                          "                      <td >"+data.dept.dept_name+"</td>\n" +
                          "                      <td>"+data.adminRole.name+"</td>\n" +
                          "                      <td>"+data.add_time+"</td>";
                      if(data.state==1){
                          html+="<td class=\"td-status\"><span class=\"label label-success radius\">正常</span></td>\n" +
                              "                          <td class=\"td-manage\"><a onClick=\"member_stop(this,"+data.id+","+data.state+")\"  href=\"javascript:;\" title=\"停用\"  class=\"btn btn-xs btn-success\"><i class=\"icon-ok bigger-120\"></i></a> <a title=\"编辑\" onclick=\"member_edit(this,"+data.id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+data.id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                      }else{
                          html+="<td class=\"td-status\"><span class=\"label label-defaunt radius\">已停用</span></td>\n" +
                              "                          <td class=\"td-manage\"><a onClick=\"member_start(this,"+data.id+","+data.state+")\"  href=\"javascript:;\" title=\"启用\"  class=\"btn btn-xs\"><i class=\"icon-ok bigger-120\"></i></a> <a title=\"编辑\" onclick=\"member_edit(this,"+data.id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+data.id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td><tr>";
                      }
                      tbody.append(html);
                      var trs = tbody.find("tr");
                      $(".r_f").find("b").html(trs.length);
                  }
              })
			  layer.alert('添加成功！',{
               title: '提示框',
			   icon:1,
			  });
			   layer.close(index);
		  }
		}
    });
});
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url+'#?='+id,w,h);
}
/*用户-停用*/
function member_stop(obj,id,state){
	layer.confirm('确认要停用吗？',function(index){
        var sessionId = "${sessionScope.Admin.id}";
        if(sessionId==id){
            layer.msg('无法停用自己!',{icon:2,time:1000});
        }else{
            $.ajax({
                type:'post',
                url:"StartAndStop",
                data:{"id":id,
                    "state":state
                },
                dataType:"json",
                success:function (result) {
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,'+result.id+','+result.state+')" href="javascript:;" title="启用"><i class="icon-ok  bigger-120"></i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
                    $(obj).remove();
                    layer.msg('已停用!',{icon: 5,time:1000});
                }
            });
        }
	});
	
}
/*用户查询*/
function search_user(){
	var from = $("#search_form").serialize();
	$.ajax({
        url:"selectUserLike",
        type:"post",
        data:from,
        dataType:"json",
        success:function (data) {
            var html = "";
            for (var i = 0; i < data.length; i++) {
                html += "<tr><td><label>\n" +
                    "                          <input type=\"checkbox\" class=\"ace\">\n" +
                    "                          <span class=\"lbl\"></span></label></td>\n" +
                    "                      <td>"+data[i].id+"</td>\n" +
                    "                      <td>"+data[i].name+"</td>\n" +
                    "                      <td>"+data[i].age+"</td>\n" +
                    "                      <td>"+data[i].tel+"</td>\n" +
                    "                      <td>"+data[i].qq+"</td>\n" +
                    "                      <td>"+data[i].email+"</td>\n" +
                    "                      <td >"+data[i].dept.dept_name+"</td>\n" +
                    "                      <td>"+data[i].adminRole.name+"</td>\n" +
                    "                      <td>"+data[i].add_time+"</td>";
                if(data[i].state==1){
                    html+="<td class=\"td-status\"><span class=\"label label-success radius\">正常</span></td>\n" +
                        "                          <td class=\"td-manage\"><a onClick=\"member_stop(this,"+data[i].id+","+data[i].state+")\"  href=\"javascript:;\" title=\"停用\"  class=\"btn btn-xs btn-success\"><i class=\"icon-ok bigger-120\"></i></a> <a title=\"编辑\" onclick=\"member_edit(this,"+data[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+data[i].id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                }else{
                    html+="<td class=\"td-status\"><span class=\"label label-defaunt radius\">已停用</span></td>\n" +
                        "                          <td class=\"td-manage\"><a onClick=\"member_start(this,"+data[i].id+","+data[i].state+")\"  href=\"javascript:;\" title=\"启用\"  class=\"btn btn-xs\"><i class=\"icon-ok bigger-120\"></i></a> <a title=\"编辑\" onclick=\"member_edit(this,"+data[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+data[i].id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td><tr>";
                };
            }
            $("#tbody").html(html);
            var trs = $("#tbody").find("tr");
            $(".r_f").find("b").html(trs.length);
        }
    })
}
/*用户-启用*/
function member_start(obj,id,state){
	layer.confirm('确认要启用吗？',function(index){
        $.ajax({
            type:'post',
            url:"StartAndStop",
            data:{"id":id,
                "state":state
            },
            dataType:"json",
            success:function (result) {
                $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,'+result.id+','+result.state+')" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
                $(obj).remove();
                layer.msg('已启用!',{icon: 6,time:1000});
            }
        });

	});
}
/*用户-编辑*/
function member_edit(obj,id){
    $.ajax({
        type:"post",
        url:"selectOne",
        data:{"id":id},
        dataType:"json",
        success:function (result) {
            $("[name='id']").val(id);
            $("[name='username']").val(result.username);
            $("[name='name']").val(result.name);
            $("[name='qq']").val(result.qq);
            $("[name='tel']").val(result.tel);
            $("[name='email']").val(result.email);
            $("[name='age']").val(result.age);
            $("[name='password']").val(result.password);
            $("[name='remark']").val(result.remark);
            var option = $("[name='dept']").find("option");
            for (var i=0;i<option.length;i++){
                if(option[i].value==result.dept.id){
                    option[i].selected=true;
                }
            }
            var sex = $("[name='sex']");
            for (var i=0;i<sex.length;i++){
                if(sex[i].value==result.sex){
                    sex[i].checked=true;
                }
            }
            var role = $("[name='adminRole']");
            for (var i=0;i<role.length;i++){
                if(role[i].value==result.adminRole.id){
                    role[i].checked=true;
                }
            }
            document.getElementById("search_form").reset();
            layer.open({
                type: 1,
                title: '修改用户信息',
                maxmin: true,
                shadeClose:false, //点击遮罩关闭层
                area : ['800px' , ''],
                content:$('#add_menber_style'),
                btn:['提交','取消'],
                yes:function(index,layero){
                    var num=0;
                    var str="";
                    $(".add_menber input[type$='text']").each(function(n){
                        if($(this).val()=="")
                        {
                            layer.alert(str+=""+$(this).attr("content")+"不能为空！\r\n",{
                                title: '提示框',
                                icon:0,
                            });
                            num++;
                            return false;
                        }
                    });
                    if(num>0){  return false;}
                    else{
                        var from = $("#add_menber_style").serialize();
                        $.ajax({
                            url:"editUser",
                            type:"post",
                            data:from,
                            dataType:"json",
                            success:function (data) {
                                var tr = $(obj).parent().parent();
                                var html = "<td><label>\n" +
                                    "                          <input type=\"checkbox\" class=\"ace\">\n" +
                                    "                          <span class=\"lbl\"></span></label></td>\n" +
                                    "                      <td>"+data.id+"</td>\n" +
                                    "                      <td>"+data.name+"</td>\n" +
                                    "                      <td>"+data.age+"</td>\n" +
                                    "                      <td>"+data.tel+"</td>\n" +
                                    "                      <td>"+data.qq+"</td>\n" +
                                    "                      <td>"+data.email+"</td>\n" +
                                    "                      <td >"+data.dept.dept_name+"</td>\n" +
                                    "                      <td>"+data.adminRole.name+"</td>\n" +
                                    "                      <td>"+data.add_time+"</td>";
                                if(data.state==1){
                                    html+="<td class=\"td-status\"><span class=\"label label-success radius\">正常</span></td>\n" +
                                        "                          <td class=\"td-manage\"><a onClick=\"member_stop(this,"+data.id+","+data.state+")\"  href=\"javascript:;\" title=\"停用\"  class=\"btn btn-xs btn-success\"><i class=\"icon-ok bigger-120\"></i></a> <a title=\"编辑\" onclick=\"member_edit(this,"+data.id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+data.id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                                }else{
                                    html+="<td class=\"td-status\"><span class=\"label label-defaunt radius\">已停用</span></td>\n" +
                                        "                          <td class=\"td-manage\"><a onClick=\"member_start(this,"+data.id+","+data.state+")\"  href=\"javascript:;\" title=\"启用\"  class=\"btn btn-xs\"><i class=\"icon-ok bigger-120\"></i></a> <a title=\"编辑\" onclick=\"member_edit(this,"+data.id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+data.id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                                }
                                tr.html(html);
                                layer.alert('修改成功！',{
                                    title: '提示框',
                                    icon:1,
                                });
                                layer.close(index);
                            }
                        });

                    }
                }
            });
        }
    })

}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
	    var sessionId = "${sessionScope.Admin.id}";
	    if(sessionId==id){
            layer.msg('无法删除自己!',{icon:2,time:1000});
        }else{
            $.ajax({
                url:"deleteUser",
                type:"post",
                data:{"id":id},
                success:function () {
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                    var trs = $("#tbody").find("tr");
                    $(".r_f").find("b").html(trs.length);
                }
            })
        }


	});
}
 

</script>