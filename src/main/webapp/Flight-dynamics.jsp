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
			
		</script><script src="assets/layer/layer.js" type="text/javascript" ></script>
<script type="text/javascript" src="js/H-ui.js"></script>
    <script type="text/javascript" src="js/vue.js"></script>

<title>航班动态信息</title>
</head>
<style>
.add_menber  li{width:33%;}
.add_menber li .label_name, .member_content li .label_name{ width:100px !important;}
</style>
<body>
<div id="div">
<div class="page-content clearfix">
  <div id="Member_Ratings">
    <div class="d_Confirm_Order_style">
  
       <form id="search_form">
      <div class="search_style">
        <ul class="search_content clearfix">
          <li>
            <label class="l_f">航班号：</label>
            <input name="flight_no" type="text"  class="text_add" placeholder="输入航班号"  style=" width:190px"/>
          </li>
          <li>
            <label class="l_f">机号：</label>
            <input name="no" type="text"  class="text_add" placeholder="机号"  style=" width:190px"/>
          </li>
          <li>
            <label class="l_f">计划起飞时间：</label>
            <input class="inline laydate-icon" name="plan_take_time" type="date" style=" margin-left:10px;">
          </li>
          <li>
            <button type="button" class="btn_search" onclick="search_flight()"><i class="icon-search"  ></i>查询</button>
          </li>
        </ul>
      </div>
      <div class="search_style">
        <ul class="search_content clearfix">
          <li>
            <label class="l_f">所有航班：</label>
            <select name="attribute" style=" width:110px">
              <option value="0">---所有---</option>
              <option value="1">始发航班--</option>
            </select>
          </li>
          <li>
            <label class="l_f">进出港：</label>
            <select name="harbor" style=" width:110px">
              <option value="-1">---所有---</option>
              <option value="1">进港</option>
              <option value="0">出港</option>
            </select>
          </li>
          <li>
            <label class="l_f">航空公司：</label>
            <select name="airline" style=" width:110px">
              <option value="0">---所有---</option>
                <c:forEach items="${sessionScope.allAircompanyts}" var="Aircompanyt">
                    <option value="${Aircompanyt.id}">${Aircompanyt.aln_name_chn}</option>
                </c:forEach>
            </select>
          </li>
          <li>
            <label class="l_f">国内/外航班：</label>
            <select name="nature" style=" width:110px">
              <option value="所有">---所有---</option>
              <option value="国内航班">国内航班</option>
              <option value="国外航班">国外航班</option>
            </select>
          </li>
          <li>
            <label class="l_f">航班状态：</label>
              <select name="state" style=" width:156px; margin-left:10px;">
                  <option value="0">---所有---</option>
                  <c:forEach var="state" items="${sessionScope.stateAll}">
                      <option value="${state.id}">${state.name}</option>
                  </c:forEach>
              </select>
          </li>
        </ul>
      </div> 
	  </form>
      <!---->
      
      <div class="table_menu_list">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
          <thead>
            <tr>
              <th ><label>
                  <input type="checkbox" class="ace">
                  <span class="lbl"></span></label></th>
              <th >航空公司二字码</th>
              <th >航班</th>
              <th >任务性质</th>
              <th >进出港</th>
              <th >机号</th>
              <th >机型</th>
              <th >航班性质</th>
              <th >起飞机场</th>
              <th >计划起飞时间</th>
              <th >计划落地时间</th>
              <th >降落机场</th>
              <th >航班状态</th>
              <th width="100">操作</th>
            </tr>
          </thead>
          <tbody id="tbody">
          <tr v-for="record in massage">
              <td><label>
              <input type="checkbox" class="ace">
              <span class="lbl"></span></label></td>
                  <td>{{record.air_code}}</td>
                  <td>{{record.flight_no}}</td>
                  <td>{{record.task.task_zh_short}}</td>
                  <td>{{record.harbor==1?"进港":"出港"}}</td>
                  <td>{{record.no}}</td>
                  <td class="text-l">{{record.jix}}</td>
                  <td>{{record.nature}}</td>
                  <td>{{record.airport_start}}</td>
                  <td>{{record.plan_take_time}}</td>
                  <td>{{record.plan_land_time}}</td>
                  <td>{{record.airport_end}}</td>
                  <td class="td-status">
                      <span class="label label-success radius" v-if="record.state.id==1">{{record.state.name}}</span>
                      <span class="label label-yellow radius" v-else-if="record.state.id==2">{{record.state.name}}</span>
                      <span class="label label-important radius" v-else-if="record.state.id==3">{{record.state.name}}</span>
                      <span class="label label-left radius" v-else-if="record.state.id==4">{{record.state.name}}</span>
                      <span class="label label-purple radius" v-else-if="record.state.id==5">{{record.state.name}}</span>
                  </td>
                  <td class="td-manage"><a title="编辑" @click="member_edit(record.id)" href="javascript:;"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a>  </td>
              </tr>

          </tbody>
        </table>
        <div style=" float:right; margin-right:20px;">
          <nav aria-label="Page navigation">
            <ul class="pagination">
              <li> <a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a> </li>
              <li class="active" ><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">5</a></li>
              <li> <a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
            </ul>
          </nav>
        </div>
      </div>
    </div>
  </div>
</div>
<!--修改图层-->
<form id="add_menber_form" method="post">
    <input v-bind:value="record.id" name="id" type="hidden">
	<div  class="add_menber" id="add_menber_style" style="display:none; width:900px !important;">
   <ul class=" page-content">
    <li >
              <label class="label_name">成人数量：</label>
              <span class="add_name">
      <input v-bind:value="record.adult_num" name="adult_num" content="成人数量" type="text" content="成人数量" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">儿童数量：</label>
              <span class="add_name">
      <input name="child_num" v-bind:value="record.child_num" content="儿童数量" type="text" content="儿童数量" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">婴儿数量：</label>
              <span class="add_name"> 
      <input name="baby_num" type="text" v-bind:value="record.baby_num" content="婴儿数量" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">计划起飞时间：</label>
              <span class="add_name">
      <input name="plan_take_time" v-bind:value="record.plan_take_time" content="计划起飞时间" type="text" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">实际起飞时间：</label>
              <span class="add_name">
      <input name="real_take_time" v-bind:value="record.real_take_time" content="实际起飞时间" type="text" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">行李件数：</label>
              <span class="add_name">
      <input name="luggage_num" type="text" content="行李件数" v-bind:value="record.luggage_num"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">货邮重量：</label>
              <span class="add_name">
      <input name="cargo_weight" content="货邮重量" type="text" v-bind:value="record.cargo_weight" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">撒轮挡时间：</label>
              <span class="add_name">
      <input name="remove_time" content="撒轮挡时间" type="text" v-bind:value="record.remove_time" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">计划落地时间：</label>
              <span class="add_name">
      <input name="plan_land_time" content="计划落地时间" type="text" v-bind:value="record.plan_land_time" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航班号：</label>
              <span class="add_name">
      <input name="flight_no" content="航班号" type="text" v-bind:value="record.flight_no"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">机位：</label>
              <span class="add_name">
      <input name="seatObj" content="机位" type="text" class="text_add"/>
              </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">实际落地时间：</label>
              <span class="add_name">
      <input name="real_land_time" type="text" content="实际落地时间" v-bind:value="record.real_land_time"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">挡轮挡时间：</label>
              <span class="add_name">
      <input name="block_time" content="挡轮挡时间" type="text" v-bind:value="record.block_time"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">执行日期：</label>
              <span class="add_name">
      <input name="do_date" type="text" content="执行日期" v-bind:value="record.do_date"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">登机口：</label>
              <span class="add_name">
      <input name="gateObj" type="text" content="登机口" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">二字码：</label>
              <span class="add_name">
      <input name="air_code" type="text" content="二字码" v-bind:value="record.air_code"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">行李转盘：</label>
              <span class="add_name">
      <input name="turntableObj" content="行李转盘" type="text" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航空公司：</label>
              <span class="add_name">
      <input name="airlineObj" type="text"  class="text_add" readonly="readonly" value="江西南昌航空公司  "/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">起飞机场：</label> 
              <span class="add_name">
      <input name="airport_start" content="起飞机场" type="text" v-bind:value="record.airport_start"  class="text_add"/>
      </span>
              <div class="prompt r_f"></div> 
            </li>
    <li>
              <label class="label_name">机号：</label>
              <span class="add_name">
      <input name="no" content="机号" type="text" v-bind:value="record.no" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">机型：</label>
              <span class="add_name">
      <input name="jix" content="机型" type="text" v-bind:value="record.jix" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">备降机场：</label>
              <span class="add_name">
      <input name="airport_end_spare" content="备降机场" type="text" v-bind:value="record.airport_end_spare" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">关联航班ID：</label>
              <span class="add_name">
      <input name="relation_id" content="关联航班ID" type="text" v-bind:value="record.relation_id" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航站楼：</label>
              <span class="add_name">
      <input name="terminalObj" content="航站楼" type="text" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航班代理：</label>
              <span class="add_name">
      <input name="flight_agent" content="航班代理" type="text" v-bind:value="record.flight_agent" class="text_add"/>
      </span>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">是否始发航班：</label>
            <select name="attribute" style=" width:156px; margin-left:10px;">
                <option value="1" v-bind:selected="record.attribute==1?true:false">始发航班</option>
                <option value="0" v-bind:selected="record.attribute==0?true:false">非始发航班</option>
            </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">航班状态：</label>
              <select name="stateObj" style=" width:156px; margin-left:10px;">
                    <c:forEach var="state" items="${sessionScope.stateAll}">
                        <option value="${state.id}">${state.name}</option>
                    </c:forEach>
              </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">国内/外航班：</label>
              <select name="nature" style=" width:156px ; margin-left:10px;">
                <option value="国内航班" v-bind:selected="record.nature=='国内航班'?true:false">国内航班</option>
                <option value="国外航班" v-bind:selected="record.nature=='国外航班'?true:false">国外航班</option>
              </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">不正常原因：</label>
              <select name="trysObj" style=" width:156px; margin-left:10px;">
                <c:forEach items="${sessionScope.allReasons}" var="reason">
                    <option value="${reason.id}">${reason.zwms}</option>
                </c:forEach>
              </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">进/出港：</label>
              <select name="harbor" style=" width:156px; margin-left:10px;">
                <option value="1" v-bind:selected="record.harbor==1?true:false">进港</option>
                <option value="0" v-bind:selected="record.harbor==0?true:false">出港</option>
              </select>
              <div class="prompt r_f"></div>
            </li>
    <li>
              <label class="label_name">任务性质：</label>
              <select name="taskObj" style=" width:156px; margin-left:10px;">
                <c:forEach var="task" items="${sessionScope.allTask}">
                    <option value="${task.id}">${task.task_zh_short}</option>
                </c:forEach>
              </select>
              <div class="prompt r_f"></div>
            </li>
  </ul>
  </div>
</form>
</div>
</body>
</html>
<script>

    var app = new Vue({
        el:"#div",
        data:{massage:"",
              record:'aa'
        },
        methods:{
            member_edit:function (value,e) {
                var r;
                $.each(this.massage,function (index,recoed) {
                    if(recoed.id==value){
                       r = recoed;
                    }
                });
                this.record = r;
                $("[name='seatObj']").val(this.record.seat.bay_lx);
                $("[name='gateObj']").val(this.record.gate.bay);
                $("[name='turntableObj']").val(this.record.turntable.xl_tpxs);
                $("[name='airlineObj']").val(this.record.airline.aln_name_chn);
                $("[name='terminalObj']").val(this.record.terminal.name);
                var stateid = this.record.state.id;
                $.each($("[name='stateObj'] option"),function (index,option) {
                    if(option.value==stateid){
                        option.selected=true;
                    }
                });

                var taskid = this.record.task.id;
                $.each($("[name='taskObj'] option"),function (index,option) {
                    if(option.value==taskid){
                        option.selected=true;
                    }
                });

                var tryid = this.record.trys.id;
                $.each($("[name='trysObj'] option"),function (index,option) {
                    if(option.value==tryid){
                        option.selected=true;
                    }
                });
                layer.open({
                    type: 1,
                    title: '修改航班动态信息',
                    maxmin: true,
                    shadeClose:false, //点击遮罩关闭层
                    area : ['920px' , ''],
                    content:$('#add_menber_style'),
                    btn:['提交','取消'],
                    yes:function(index,layero){
                        var num=0;
                        var str="";
                        $(".add_menber input[type$='text']").each(function(n){
                            if($(this).val()=="") {
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
                            var from = $("#add_menber_form");
                            $.ajax({
                                type:"post",
                                url:"EditRecord",
                                async:false,
                                data:from.serialize(),
                                dataType:"json",
                                success:function (data) {
                                    app.massage=data
                                }
                            })
                            layer.alert('修改成功！',{
                                title: '提示框',
                                icon:1,
                            });
                            layer.close(index);

                        }
                    }
                });
            }



        }
    });

    $.ajax({
        url:'selectAll',
        type:'post',
        dataType:"json",
        success:function(data) {
            app.$data.massage=data;
        }
    });




/*查询*/
function search_flight(){
	var from = $("#search_form").serialize();
	$.ajax({
        url:"SelectRecordLike",
        type:"post",
        data:from,
        dataType:"json",
        success:function (data) {
            app.massage=data
        }
	})
}

/*-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
 

</script>