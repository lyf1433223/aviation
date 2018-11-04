<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<script type="text/javascript"  src="js/jquery-2.1.1.js"></script>
		<title>基础数据维护</title>
		</head>
		<style>
.btn_search:hover {
	cursor: pointer;
}
.add_menber li .label_name, .member_content li .label_name{ width:70px;}
.page-content li {
	width: 33% !important;
}
.add_menber li .add_name{ margin-left:2px !important;}
</style>
		<body>
<div class="page-content clearfix ">
    <div class="d_Confirm_Order_style">
        <form class="search_style">
            <ul class="search_content clearfix">
                <li>
                    <label class="l_f">部门：</label>
                        <select name="queryType" onchange="selectInfo()" id="sel">
                            <option class="f_aircompanyt_basic_data" value="1">航空公司</option>
                            <option class="f_aircraft_basic_data" value="2">飞机信息</option>
                            <option class="f_airport_basic_data" value="3" >机场数据</option>
                            <option class="f_channel_basic_data" value="4">安检通道</option>
                            <option class="f_checkin_basic_data" value="5">值机柜台</option>
                            <option class="f_gate_basic_data" value="6" >登机口</option>
                            <option class="f_passenger" value="7">旅客属性信息</option>
                            <option class="f_passenger_info" value="8">旅客航班流水信息</option>
                            <option class="f_reason_basic_data" value="9">异常原因</option>
                            <option class="f_rec_basic_data" value="10">廊桥数据</option>
                            <option class="f_runway_basic_data" value="11">跑道数据</option>
                            <option class="f_seat_basic_data" value="12">机位数据</option>
                            <option class="f_task_basic_data" value="13">航班任务</option>
                            <option class="f_terminal_basic_data" value="14">航站楼数据</option>
                            <option class="f_turntable_basic_data" value="15">行李转盘</option>
                        </select>
                </li>
            </ul>
        </form>

    <div class="border clearfix">
        <span class="l_f">
            <a href="javascript:" id="member_add" class="btn btn-warning"><i class="icon-plus" ></i>添加数据</a>
        </span>
    </div>

    <div class="table_menu_list">
        <table class="table table-striped table-bordered table-hover" id="div1">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>英文简称</th>
                    <th>二字码</th >
			        <th>公司属性</th>
                    <th>中文简称</th>
                    <th>首飞时间</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab1"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div2" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>机号</th>
                    <th>机型</th >
			        <th>飞机属性</th>
                    <th>二字码</th>
                    <th>航空(分)公司</th>
                    <th width="180">操作</th>
                </tr>
            </thead>

            <tbody id="tab2"></tbody>
        </table>

        <table class="table table-striped table-bordered table-hover" id="div3" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th  >三字码</th>
                    <th  >机场属性</th >
			        <th >中文简称</th>
                    <th >航线简称</th>
                    <th >英文简称</th>
			        <th>所在省市</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab3"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div4" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>安检通道编号</th>
                    <th>属性</th >
			        <th>对应区域</th>
                    <th>安检口状态</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab4"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div5" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>值机柜台编号</th>
                    <th>所属航空公司</th >
			        <th>对应区域</th>
                    <th>所属航站楼</th>
                    <th>属性</th>
			        <th>类别</th>
			        <th>状态</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab5"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div6" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>登机口编号</th>
                    <th>名称</th >
			        <th>属性</th>
                    <th>类型</th>
                    <th>对应机位</th>
			        <th>对应航站楼</th>
			        <th>状态</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab6"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div7" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>姓名</th>
                    <th>身份证号(护照)</th >
			        <th>电话</th>
                    <th>性别</th>
                    <th>是否是贵宾</th>
			        <th>最后一次起飞时间</th>
			        <th>最后一次起飞航班号</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab7"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div8" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>姓名</th>
                    <th>航班号</th >
			        <th>座位号</th>
                    <th>舱位</th>
			        <th>舱程</th>
			        <th>值机时间</th>
                    <th>值机柜台</th>
			        <th>安检时间</th>
			        <th>安检通道</th>
			        <th>登机时间</th>
			        <th>同行旅客</th>
			        <th>目的地</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab8"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div9" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>编码</th>
                    <th>中文描述</th >
			        <th>英文描述</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab9"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div10" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th  >廊桥编号</th>
                    <th  >对应机位	</th >
                    <th >所属航站楼</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab10"></tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div11" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>跑道编号</th>
                    <th>跑道长度</th >
                    <th>跑道方向</th>
                    <th>跑道属性</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab11"></tbody>
            </tbody>
        </table>

	    <table class="table table-striped table-bordered table-hover" id="div12" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>机位号</th>
                    <th>机位属性</th >
                    <th>停靠属性</th>
                    <th>机位长</th>
                    <th>机位宽</th>
                    <th>机位类型</th>
                    <th>机位状态</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab12"></tbody>
        </table>


        <table class="table table-striped table-bordered table-hover" id="div13" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>任务代码</th>
                    <th>任务简称</th >
                    <th>任务排序</th>
                    <th>中文名称</th>
                    <th>英文名称</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab13"></tbody>
        </table>


	    <table class="table table-striped table-bordered table-hover" id="div14" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>航站楼编号</th>
                    <th>航站楼属性</th >
                    <th>状态</th>
                    <th>所属航空公司</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab14"></tbody>
        </table>


	    <table class="table table-striped table-bordered table-hover" id="div15" style="display:none;">
            <thead>
                <tr>
                    <th width="25">
                        <label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span>
                        </label>
                    </th>
                    <th>行李转盘编码</th>
                    <th>属性</th >
                    <th>状态</th>
                    <th>所属航空公司</th>
                    <th>所属航站楼</th>
                    <th width="180">操作</th>
                </tr>
            </thead>
            <tbody id="tab15"></tbody>
        </table>
    </div>
    </div>
</div>


<form id="form1">
    <div class="add_menber" id="add_menber_style1" style="display:none">
        <ul class=" page-content">
            <li>
                <label class="label_name">二字码：</label>
                <span class="add_name">
                    <input value="" id="二字码" name="data['aln_iata']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">三字码：</label>
                <span class="add_name">
                    <input value="" id="三字码" name="data['aln_icao']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">公司性质：</label>
                <select id="公司性质" name="data['aln_iod']" style=" width:110px">
                    <option>国际</option>
                    <option>国内</option>
                </select>
            </li>
			<li>
                <label class="label_name">代理标志：</label>
                <span class="add_name">
                    <input value="" id="代理标志" name="data['aln_agent']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">航站楼：</label>
                    <select id="航站楼" name="data['aln_terminal']" style=" width:110px">
                        <option>T1</option>
                        <option>T2</option>
                        <option>T3</option>
                        <option>T4</option>
                    </select>
            </li>
			<li>
                <label class="label_name">公司总机：</label>
                <span class="add_name">
                    <input value="" id="公司总机" name="data['aln_tel']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">中文简称：</label>
                <span class="add_name">
                    <input value="" id="中文简称" name="data['aln_short_chn']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">英文简称：</label>
                <span class="add_name">
                    <input value="" id="英文简称" name="data['aln_short_eng']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">中文名称：</label>
                <span class="add_name">
                    <input value="" id="中文名称" name="data['aln_name_chn']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">英文名称：</label>
                <span class="add_name">
                    <input value="" id="英文名称" name="data['aln_name_eng']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">公司签派：</label>
                <span class="add_name">
                    <input value="" id="公司签派" name="data['aln_dispatcher']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">办事处：</label>
                <span class="add_name">
                    <input value="" id="办事处" name="data['aln_office']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">主页地址：</label>
                <span class="add_name">
                    <input value="" id="主页地址" name="data['aln_url']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">公司描述：</label>
                <span class="add_name">
                    <input value="" id="公司描述" name="data['aln_dscrp']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">首飞时间：</label>
                <span class="add_name">
                    <input value="" id="首飞时间" name="data['aln_firsttime']" type="date"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">母公司ID：</label>
                <span class="add_name">
                    <input value="" id="母公司ID" name="data['aln_parent_com']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>



<form id="form2">
    <div class="add_menber" id="add_menber_style2" style="display:none">
        <ul class=" page-content">
            <li>
                <label class="label_name">机号：</label>
                <span class="add_name">
                    <input value="" id="机号" name="data['flt_Reg']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">机型：</label>
                <span class="add_name">
                    <input value="" id="机型" name="data['flt_Type']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			
			<li>
                <label class="label_name">最大起飞全重：</label>
                <span class="add_name">
                    <input value="" id="最大起飞全重" name="data['mtow']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			
			<li>
                <label class="label_name">业载：</label>
                <span class="add_name">
                    <input value="" id="业载" name="data['payload']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">最大座位数：</label>
                <span class="add_name">
                    <input value="" id="最大座位数" name="data['max_Seats']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">飞机类型：</label>
                <span class="add_name" name="data['flt_Type']">
                    <input name="radio2" type="radio" checked="checked" class="ace">
                    <span class="lbl">宽体</span>
	                    <input name="radio2" type="radio" class="ace">
                    <span class="lbl">普体</span></label>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">飞机属性：</label>
                <select name="" style=" width:110px" name="data['flt_Types']">
                    <option>国际飞机</option>
                    <option>国内飞机</option>
                </select>
            </li>
			<li>
                <label class="label_name">二字码：</label>
                <span class="add_name">
                    <input value="" name="data['aln_Iata']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">三字码：</label>
                <span class="add_name">
                    <input value="" name="data['aln_Icao']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">内部代码：</label>
                <span class="add_name">
                    <input value="" id="内部代码" name="data['aln_Internal']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">航空(分)公司：</label>
                <span class="add_name">
                    <input value="" id="航空(分)公司" name="data['aln_Internal_Chn']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">开始时间：</label>
                <span class="add_name">
                    <input value="" id="开始时间" name="data['start_Date']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">结束时间：</label>
                <span class="add_name">
                    <input value="" id="结束时间" name="data['end_Date']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">变动标记：</label>
                <input name="change2" type="radio" checked="checked" class="ace" name="data['change_Flag']">
                <span class="lbl">已变动</span>
	                <input name="change2" type="radio" class="ace">
                <span class="lbl">未变动</span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>


<form id="form3">
    <div class="add_menber" id="add_menber_style3" style="display:none">
        <ul class=" page-content">
            <li>
                <label class="label_name">三字码：</label>
                <span class="add_name">
                    <input value="" name="三字码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">四字码：</label>
                <span class="add_name">
                    <input value="" name="四字码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">机场属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>国际机场</option>
                    <option>国内机场</option>
                </select>
            </li>
			<li>
                <label class="label_name">航线距离：</label>
                <span class="add_name">
                    <input value="" name="航线距离" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			
			<li>
                <label class="label_name">中文简称：</label>
                <span class="add_name">
                    <input value="" name="中文简称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">航线简称：</label>
                <span class="add_name">
                    <input value="" name="航线简称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">英文简称：</label>
                <span class="add_name">
                    <input value="" name="英文简称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">中文全称：</label>
                <span class="add_name">
                    <input value="" name="中文全称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">英文全称：</label>
                <span class="add_name">
                    <input value="" name="英文全称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">机场等级：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                </select>
            </li>
            <li>
                <label class="label_name">候机楼面积：</label>
                <span class="add_name">
                    <input value="" name="候机楼面积" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">所在省市：</label>
                <span class="add_name">
                    <input value="" name="所在省市" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">机场总机：</label>
                <span class="add_name">
                    <input value="" name="机场总机" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">机场站调：</label>
                <span class="add_name">
                    <input value="" name="机场站调" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">指挥中心：</label>
                <span class="add_name">
                    <input value="" name="指挥中心" type="text"  class="text_add"/>
            </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">机场海拔：</label>
                <span class="add_name">
                    <input value="" name="机场海拔" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">机场传真：</label>
                <span class="add_name">
                    <input value="" name="机场传真" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">邮政地址：</label>
                <span class="add_name">
                    <input value="" name="邮政地址" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">邮政编码：</label>
                <span class="add_name">
                    <input value="" name="邮政编码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">电子邮箱：</label>
                <span class="add_name">
                    <input value="" name="电子邮箱" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">主页地址：</label>
                <span class="add_name">
                    <input value="" name="主页地址" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">通航标志：</label>
                <span class="add_name">
                    <input value="" name="通航标志" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">机场描述：</label>
                <span class="add_name">
                    <input value="" name="机场描述" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>


<form id="form4">
    <div class="add_menber" id="add_menber_style4" style="display:none">
        <ul class=" page-content">
            <li>
                <label class="label_name">安检通道编号：</label>
                <span class="add_name">
                    <input value="" name="安检通道编号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			
			<li>
                <label class="l_f">安检通道属性：</label>
                    <select name="" style=" width:110px">
                        <option>--选择--</option>
                        <option>国际通道</option>
                        <option>国内通道</option>
                    </select>
            </li>
		    <li>
                <label class="l_f">对应区域：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>A</option>
                    <option>B</option>
                    <option>C</option>
                    <option>D</option>
                </select>
            </li>
			<li>
                <label class="label_name">安检口状态：</label>
                <input name="change2" type="radio" checked="checked" class="ace">
                <span class="lbl">启用</span>
	                <input name="change2" type="radio" class="ace">
                <span class="lbl">停用</span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
 </form>


<form id="form5">
    <div class="add_menber" id="add_menber_style5" style="display:none">
        <ul class=" page-content">
            <li>
                <label class="label_name">值机柜台编号：</label>
                <span class="add_name">
                    <input value="" name="值机柜台编号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			
			<li>
                <label class="l_f">所属航空公司：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>南航</option>
                    <option>东航</option>
                </select>
            </li>
            <li>
                <label class="l_f">对应区域：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>A</option>
			        <option>B</option>
			        <option>C</option>
			        <option>D</option>
                </select>
            </li>
		    <li>
                <label class="l_f">所属航站楼：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>T1</option>
                    <option>T2</option>
                    <option>T3</option>
                    <option>T4</option>
                </select>
            </li>
		    <li>
                <label class="l_f">属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>国内</option>
                    <option>国际</option>
                </select>
            </li>
		    <li>
                <label class="l_f">类别：</label>
                    <select name="" style=" width:110px">
                        <option>--选择--</option>
                        <option>A</option>
                        <option>B</option>
                        <option>C</option>
                        <option>D</option>
                    </select>
            </li>

			<li>
                <label class="label_name">状态：</label>
                <input name="change2" type="radio" checked="checked" class="ace">
                <span class="lbl">启用</span>
                    <input name="change2" type="radio" class="ace">
                <span class="lbl">停用</span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>


<form id="form6">
    <div class="add_menber" id="add_menber_style6" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">登机口编号：</label>
                <span class="add_name">
                    <input value="" name="登机口编号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">名称</label>
                <span class="add_name">
                    <input value="" name="名称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="l_f">属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>远</option>
			        <option>近</option>
                </select>
            </li>
		    <li>
                <label class="l_f">类型：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>A</option>
                    <option>B</option>
                    <option>C</option>
                    <option>D</option>
                </select>
            </li>
		    <li>
                <label class="l_f">对应机位：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>S1</option>
                    <option>S2</option>
                    <option>S3</option>
                    <option>S4</option>
                </select>
            </li>
		    <li>
                <label class="l_f">所属航站楼：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>T1</option>
                    <option>T2</option>
                    <option>T3</option>
                    <option>T4</option>
                </select>
            </li>
		    <li>
                <label class="label_name">条屏显示</label>
                <span class="add_name">
                    <input value="" name="条屏显示" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>

			<li>
                <label class="label_name">状态：</label>
                <input name="change2" type="radio" checked="checked" class="ace">
                <span class="lbl">启用</span>
	                <input name="change2" type="radio" class="ace">
                <span class="lbl">停用</span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
 </form>

<form id="form7">
    <div class="add_menber" id="add_menber_style7" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">姓名：</label>
                <span class="add_name">
                    <input value="" name="姓名" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">身份证号</label>
                <span class="add_name">
                    <input value="" name="身份证号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">电话</label>
                <span class="add_name">
                    <input value="" name="电话" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">性别：</label>
                <input name="sex1" type="radio" checked="checked" class="ace">
                <span class="lbl">男</span>
	                <input name="sex1" type="radio" class="ace">
                <span class="lbl">女</span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">邮箱</label>
                <span class="add_name">
                    <input value="" name="邮箱" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="l_f">是否是贵宾：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>是</option>
                    <option>否</option>
                </select>
            </li>
		  
		    <li>
                <label class="label_name">最后一次起飞时间</label>
                <span class="add_name">
                    <input value="" name="最后一次起飞时间" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">最后一次起飞航班号</label>
                <span class="add_name">
                    <input value="" name="最后一次起飞航班号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>


<form id="form8">
    <div class="add_menber" id="add_menber_style8" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">关联ID：</label>
                <span class="add_name">
                    <input value="" name="关联ID" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">航班号</label>
                <span class="add_name">
                    <input value="" name="航班号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">姓名</label>
                <span class="add_name">
                    <input value="" name="姓名" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">座位号</label>
                <span class="add_name">
                    <input value="" name="座位号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">舱位</label>
                <span class="add_name">
                    <input value="" name="舱位" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">航程</label>
                <span class="add_name">
                    <input value="" name="航程" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">值机时间</label>
                <span class="add_name">
                    <input value="" name="值机时间" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
		    <li>
                <label class="label_name">值机柜台</label>
                <span class="add_name">
                    <input value="" name="值机柜台" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">安检时间</label>
                <span class="add_name">
                    <input value="" name="安检时间" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">安检通道</label>
                <span class="add_name">
                    <input value="" name="安检通道" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">登机时间</label>
                <span class="add_name">
                    <input value="" name="登机时间" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">同行旅客</label>
                <span class="add_name">
                    <input value="" name="同行旅客" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">目的地</label>
                <span class="add_name">
                    <input value="" name="目的地" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>


<form id="form9">
    <div class="add_menber" id="add_menber_style9" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">原因代码：</label>
                <span class="add_name">
                    <input value="" id="原因代码" name="data['code']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">中文描述</label>
                <span class="add_name">
                    <input value="" id="中文描述" name="data['zwms']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">英文描述</label>
                <span class="add_name">
                    <input value="" id="英文描述" name="data['ywms']" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
        </ul>
    </div>
</form>


<form id="form10">
    <div class="add_menber" id="add_menber_style10" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">廊桥编码：</label>
                <span class="add_name">
                    <input value="" name="廊桥编码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">对应机位：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>S1</option>
			        <option>S2</option>
			        <option>S3</option>
			        <option>S4</option>
                </select>
            </li>
		    <li>
                <label class="l_f">所属航站楼：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>T1</option>
			        <option>T2</option>
			        <option>T3</option>
			        <option>T4</option>
                </select>
            </li>
        </ul>
    </div>
 </form>


<form id="form11">
    <div class="add_menber" id="add_menber_style11" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">跑道编号：</label>
                <span class="add_name">
                    <input value="" name="跑道编号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">跑道长度</label>
                <span class="add_name">
                    <input value="" name="跑道长度" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">跑道方向</label>
                <span class="add_name">
                    <input value="" name="跑道方向" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">跑道属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>国际</option>
			        <option>国内</option>
                </select>
            </li>
        </ul>
    </div>
</form>


<form id="form12">
    <div class="add_menber" id="add_menber_style12" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">机位号：</label>
                <span class="add_name">
                    <input value="" name="机位号" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">机位属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>国际</option>
			        <option>国内</option>
                </select>
            </li>
		    <li>
                <label class="l_f">停靠属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>靠廊桥</option>
			        <option>不靠廊桥</option>
                </select>
            </li>
			<li>
                <label class="label_name">机位长</label>
                <span class="add_name">
                    <input value="" name="机位长" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">机位宽</label>
                <span class="add_name">
                    <input value="" name="机位宽" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">机位类型：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>类型1</option>
			        <option>类型2</option>
                </select>
            </li>
		    <li>
                <label class="label_name">左机位编码</label>
                <span class="add_name">
                    <input value="" name="左机位编码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">右机位编码</label>
                <span class="add_name">
                    <input value="" name="右机位编码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">机位状态：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>启用</option>
			        <option>停用</option>
                </select>
          </li>
        </ul>
    </div>
</form>


<form id="form13">
    <div class="add_menber" id="add_menber_style13" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">任务代码：</label>
                <span class="add_name">
                    <input value="" name="任务代码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">任务简称：</label>
                <span class="add_name">
                    <input value="" name="任务简称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">任务排序</label>
                <span class="add_name">
                    <input value="" name="任务排序" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>	
			<li>
                <label class="label_name">中文名称</label>
                <span class="add_name">
                    <input value="" name="中文名称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="label_name">英文名称</label>
                <span class="add_name">
                    <input value="" name="英文名称" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>



<form id="form14">
    <div class="add_menber" id="add_menber_style14" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">航站楼编码：</label>
                <span class="add_name">
                    <input value="" name="航站楼编码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">航站楼属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>国际</option>
			        <option>国内</option>
                </select>
            </li>
		    <li>
                <label class="l_f">航站楼状态：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>启用</option>
			        <option>停用</option>
                </select>
            </li>
		    <li>
                <label class="l_f">所属航空公司：</label>
                <select name="" style=" width:110px">
                <option>--选择--</option>
                <option>东航</option>
			    <option>南航</option>
                </select>
            </li>
        </ul>
    </div>
</form>


<form id="form15">
    <div class="add_menber" id="add_menber_style15" style="display:none">
        <ul class=" page-content">
			<li>
                <label class="label_name">行李装盘编码：</label>
                <span class="add_name">
                    <input value="" name="行李装盘编码" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
			<li>
                <label class="l_f">属性：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>国际</option>
			        <option>国内</option>
                </select>
            </li>
		    <li>
                <label class="l_f">状态：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>启用</option>
			        <option>停用</option>
                </select>
            </li>
		    <li>
                <label class="l_f">所属航空公司：</label>
                <select name="" style=" width:110px">
                    <option>--选择--</option>
                    <option>东航</option>
			        <option>南航</option>
                </select>
            </li>
		    <li>
                <label class="l_f">所属航站楼：</label>
                <select name="list[0]." style=" width:110px">
                    <option>--选择--</option>
                    <option>T1</option>
			        <option>T2</option>
                </select>
            </li>
		    <li>
                <label class="label_name">条屏显示：</label>
                <span class="add_name">
                    <input value="" name="条屏显示" type="text"  class="text_add"/>
                </span>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>


		<div style=" float:right; margin-right:20px;">
		    <nav aria-label="Page navigation">
			    <ul class="pagination">
			        <li> <a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a> </li>
			        <li class="active" ><a href="#">1</a></li>
			        <li><a href="#">2</a></li>
			        <li><a href="#">3</a></li>
			        <li><a href="#">4</a></li>
			        <li><a href="#">5</a></li>
                    <li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
			    </ul>
		    </nav>
		</div>

</body>
</html>

<script>
    window.onload = function(){
        $.ajax({
           type:"post",
            url:"/aircompanyt_basic_data",
            success:function(data){
                var a = $.parseJSON(data);
                var html="";  //声明一个字符串，作拼接
                for(var i = 0 ; i <a.length ; i++){
                    html+="<tr>";
                    html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                    html+="<td>"+a[i].aln_short_eng+"</td>";
                    html+="<td>"+a[i].aln_iata+"</td>";
                    html+="<td>"+a[i].aln_iod+"</td>";
                    html+="<td>"+a[i].aln_short_chn+"</td>";
                    html+="<td>"+a[i].aln_firsttime+"</td>";
                    html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_aircompanyt_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                    html+="</tr>";
                }
                $('#tab1').html(html);
            }
        });
    }


$("select[name='queryType']").change(function(){
    $div = $("#div"+$(this).val());//选择的div
    $div.parent().children("table").hide(); //让其他所有div隐藏
    $div.show();
});


/*-添加*/
 $('#member_add').on('click', function(){
    layer.open({
        type: 1,
        title: '添加基础数据',
		maxmin: true, 
		shadeClose: true, //点击遮罩关闭层
        area : ['800px' , '400px'],
        content:$('#add_menber_style'+$("[name='queryType']").val()),
		btn:['提交','取消'],
        yes:function(index,layero){
		    var num=0;
		    var str="";
            $('#add_menber_style'+$("[name='queryType']").val()).find("[type='text']").each(function(n){
                if($(this).val()==""){
                    layer.alert(str+=""+$(this).attr("id")+"不能为空！\r\n",{
                    title: '提示框',
				    icon:0,
                    });
			        num++;
                    return false;
                }
            });
		    if(num>0){
		        return false;
		    }else{
			    // $("#form"+$("select[name='queryType']").val()).submit();
                $.ajax({
                    type:"post",
                    url:"/add",
                    data: $("#form"+$("select[name='queryType']").val()).serialize()+"&table="+$('#sel option:selected').attr('class'),
                    success:function(data){
                        if(data > 0){
                            layer.alert('添加成功！',{
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
});



/*-编辑*/
function member_edit(id){
	  layer.open({
        type: 1,
        title: '修改基础数据',
		maxmin: true, 
		shadeClose:false, //点击遮罩关闭层
        area : ['800px' , '400px'],
        content:$('#add_menber_style'+$("select[name='queryType']").val()),
		btn:['提交','取消'],
		yes:function(index,layero){	
		 var num=0;
		 var str="";
     $(".add_menber input[type$='text']").each(function(n){
          if($(this).val()=="") {
			   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                title: '提示框',				
				icon:0,								
          }); 
		    num++;
            return false;            
          } 
		 });
		  if(num>0){  return false;}	 	
          else{
			  $("#form"+$("select[name='queryType']").val()).submit();
			  layer.alert('编辑成功！',{
               title: '提示框',				
			icon:1,		
			  });
			   layer.close(index);	
		  }		  		     				
		}
    });
}



    /*-删除*/
    function member_del(obj,id,table){
        layer.confirm('确认要删除吗？',function(index){
            $.ajax({
                type:"post",
                url:"/del",
                data:{
                    id:id,
                    table:table
                },
                success : function(data){
                    if(data > 0){
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!',{icon:1,time:1000});
                    }
                }
            });
        });
    }



    function selectInfo(){
       if($("#sel").val() == 1){
           $.ajax({
               type:"post",
               url:"/aircompanyt_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].aln_short_eng+"</td>";
                       html+="<td>"+a[i].aln_iata+"</td>";
                       html+="<td>"+a[i].aln_iod+"</td>";
                       html+="<td>"+a[i].aln_short_chn+"</td>";
                       html+="<td>"+a[i].aln_firsttime+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_aircompanyt_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab1').html(html);
               }
           });
       }else if($("#sel").val() ==2){
           $.ajax({
               type:"post",
               url:"/aircraft_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].flt_Reg+"</td>";
                       html+="<td>"+a[i].flt_Type+"</td>";
                       html+="<td>"+a[i].flt_Types+"</td>";
                       html+="<td>"+a[i].aln_Iata+"</td>";
                       html+="<td>"+a[i].aln_Internal_Chn+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_aircraft_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab2').html(html);
               }
           });
       }else if($("#sel").val() ==3){
           $.ajax({
               type:"post",
               url:"/airport_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].apt_Iata+"</td>";
                       html+="<td>"+a[i].apt_Doi+"</td>";
                       html+="<td>"+a[i].apt_Short_Chn+"</td>";
                       html+="<td>"+a[i].apt_Min_Chn+"</td>";
                       html+="<td>"+a[i].apt_Short_Eng+"</td>";
                       html+="<td>"+a[i].apt_Province+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del("+a[i].id+",'f_airport_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab3').html(html);
               }
           });
       }else if($("#sel").val() ==4){
           $.ajax({
               type:"post",
               url:"/channel_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].number+"</td>";
                       html+="<td>"+a[i].attribute+"</td>";
                       html+="<td>"+a[i].region+"</td>";
                       if(a[i].state == 1){
                           html+="<td>正在使用</td>";
                       }else{
                           html+="<td>已停用</td>";
                       }
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_channel_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab4').html(html);
               }
           });
       }else if($("#sel").val() ==5){
           $.ajax({
               type:"post",
               url:"/checkin_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].number+"</td>";
                       html+="<td>"+a[i].company+"</td>";
                       html+="<td>"+a[i].region+"</td>";
                       html+="<td>"+a[i].terminal+"</td>";
                       html+="<td>"+a[i].attribute+"</td>";
                       html+="<td>"+a[i].type+"</td>";
                       if(a[i].state == 1){
                           html+="<td>正在使用</td>";
                       }else{
                           html+="<td>已停用</td>";
                       }
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_checkin_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab5').html(html);
               }
           });
       }else if($("#sel").val() ==6){
           $.ajax({
               type:"post",
               url:"/gate_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].code+"</td>";
                       html+="<td>"+a[i].name+"</td>";
                       html+="<td>"+a[i].attribute+"</td>";
                       html+="<td>"+a[i].type+"</td>";
                       html+="<td>"+a[i].bay+"</td>";
                       html+="<td>"+a[i].terminal+"</td>";
                       if(a[i].State == 1){
                           html+="<td>正在登机</td>";
                       }else{
                           html+="<td>已起飞</td>";
                       }
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_gate_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab6').html(html);
               }
           });
       }else if($("#sel").val() ==7){
           $.ajax({
               type:"post",
               url:"/passenger",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].name+"</td>";
                       html+="<td>"+a[i].id_Number+"</td>";
                       html+="<td>"+a[i].tel+"</td>";
                       if(a[i].sex == 1){
                           html+="<td>男</td>";
                       }else{
                           html+="<td>女</td>";
                       }
                       if(a[i].is_Vip == 1){
                           html+="<td>是</td>";
                       }else{
                           html+="<td>否</td>";
                       }
                       html+="<td>"+a[i].last_Land_Time+"</td>";
                       html+="<td>"+a[i].last_Land_Flight+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_passenger')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab7').html(html);
               }
           });
       }else if($("#sel").val() ==8){
           $.ajax({
               type:"post",
               url:"/passenger_info",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].name+"</td>";
                       html+="<td>"+a[i].flight_No+"</td>";
                       html+="<td>"+a[i].seat+"</td>";
                       html+="<td>"+a[i].cabin+"</td>";
                       html+="<td>"+a[i].voyage+"</td>";
                       html+="<td>"+a[i].check_Time+"</td>";
                       html+="<td>"+a[i].check_Counter+"</td>";
                       html+="<td>"+a[i].security_Time+"</td>";
                       html+="<td>"+a[i].security_Channel+"</td>";
                       html+="<td>"+a[i].boarding_Time+"</td>";
                       html+="<td>"+a[i].peer+"</td>";
                       html+="<td>"+a[i].arrive+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_passenger_info')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab8').html(html);
               }
           });
       }else if($("#sel").val() ==9){
           $.ajax({
               type:"post",
               url:"/reason_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].code+"</td>";
                       html+="<td>"+a[i].zwms+"</td>";
                       html+="<td>"+a[i].ywms+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_reason_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab9').html(html);
               }
           });
       }else if($("#sel").val() ==10){
           $.ajax({
               type:"post",
               url:"/rec_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].number+"</td>";
                       html+="<td>"+a[i].bay+"</td>";
                       html+="<td>"+a[i].terminal+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_rec_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab10').html(html);
               }
           });
       }else if($("#sel").val() ==11){
           $.ajax({
               type:"post",
               url:"/runway_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].number+"</td>";
                       html+="<td>"+a[i].length+"</td>";
                       html+="<td>"+a[i].direction+"</td>";
                       html+="<td>"+a[i].attribute+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_runway_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab11').html(html);
               }
           });
       }else if($("#sel").val() ==12){
           $.ajax({
               type:"post",
               url:"/seat_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].bay_no+"</td>";
                       html+="<td>"+a[i].bay_sx+"</td>";
                       html+="<td>"+a[i].bay_tksx+"</td>";
                       html+="<td>"+a[i].bay_jwc+"</td>";
                       html+="<td>"+a[i].bay_jwk+"</td>";
                       html+="<td>"+a[i].bay_lx+"</td>";
                       html+="<td>"+a[i].bay_zt+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_seat_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab12').html(html);
               }
           });
       }else if($("#sel").val() ==13){
           $.ajax({
               type:"post",
               url:"/task_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].task_code+"</td>";
                       html+="<td>"+a[i].task_zh_short+"</td>";
                       html+="<td>"+a[i].task_sort+"</td>";
                       html+="<td>"+a[i].task_zh+"</td>";
                       html+="<td>"+a[i].task_en+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_task_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab13').html(html);
               }
           });
       }else if($("#sel").val() ==14){
           $.ajax({
               type:"post",
               url:"/terminal_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].code+"</td>";
                       html+="<td>"+a[i].attribute+"</td>";
                       if(a[i].state == 1){
                           html+="<td>正在使用</td>";
                       }else{
                           html+="<td>已停用</td>";
                       }
                       html+="<td>"+a[i].company+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_terminal_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab14').html(html);
               }
           });
       }else if($("#sel").val() ==15){
           $.ajax({
               type:"post",
               url:"/turntable_basic_data",
               success:function(data){
                   var a = $.parseJSON(data);
                   var html="";  //声明一个字符串，作拼接
                   for(var i = 0 ; i <a.length ; i++){
                       html+="<tr>";
                       html+="<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
                       html+="<td>"+a[i].xl_zpbm+"</td>";
                       html+="<td>"+a[i].xl_zpsx+"</td>";
                       if(a[i].xl_zpzt == 1){
                           html+="<td>正在使用</td>";
                       }else{
                           html+="<td>已停用</td>";
                       }
                       html+="<td>"+a[i].lb_bm_ss+"</td>";
                       html+="<td>"+a[i].xl_hjl+"</td>";
                       html+="<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit("+a[i].id+")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+a[i].id+",'f_turntable_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
                       html+="</tr>";
                   }
                   $('#tab15').html(html);
               }
           });
       }
    }





    // function selectInfo(){
    //         $.ajax({
    //             type: "post",
    //             url: "/select",
    //             data:"&table="+$('#sel option:selected').attr('class'),
    //             success: function (data) {
    //                 alert(data);
    //                 var a = $.parseJSON(data);
    //                 var html = "";  //声明一个字符串，作拼接
    //                 if ($("#sel").val() == 1) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].aln_Short_Eng + "</td>";
    //                         html += "<td>" + a[i].aln_Iata + "</td>";
    //                         html += "<td>" + a[i].aln_Iod + "</td>";
    //                         html += "<td>" + a[i].aln_Short_Chn + "</td>";
    //                         html += "<td>" + (a[i].aln_Firsttime).substring(0, 10) + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_aircompanyt_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab1').html(html);
    //                 } else if ($("#sel").val() == 2) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].flt_Reg + "</td>";
    //                         html += "<td>" + a[i].flt_Type + "</td>";
    //                         html += "<td>" + a[i].flt_Types + "</td>";
    //                         html += "<td>" + a[i].aln_Iata + "</td>";
    //                         html += "<td>" + a[i].aln_Internal_Chn + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_aircraft_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab2').html(html);
    //                 } else if ($("#sel").val() == 3) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].apt_Iata + "</td>";
    //                         html += "<td>" + a[i].apt_Doi + "</td>";
    //                         html += "<td>" + a[i].apt_Short_Chn + "</td>";
    //                         html += "<td>" + a[i].apt_Min_Chn + "</td>";
    //                         html += "<td>" + a[i].apt_Short_Eng + "</td>";
    //                         html += "<td>" + a[i].apt_Province + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(" + a[i].id + ",'f_airport_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab3').html(html);
    //                 } else if ($("#sel").val() == 4) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].number + "</td>";
    //                         html += "<td>" + a[i].attribute + "</td>";
    //                         html += "<td>" + a[i].region + "</td>";
    //                         if (a[i].state == 1) {
    //                             html += "<td>正在使用</td>";
    //                         } else {
    //                             html += "<td>已停用</td>";
    //                         }
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_channel_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab4').html(html);
    //                 } else if ($("#sel").val() == 5) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].number + "</td>";
    //                         html += "<td>" + a[i].company + "</td>";
    //                         html += "<td>" + a[i].region + "</td>";
    //                         html += "<td>" + a[i].terminal + "</td>";
    //                         html += "<td>" + a[i].attribute + "</td>";
    //                         html += "<td>" + a[i].type + "</td>";
    //                         if (a[i].state == 1) {
    //                             html += "<td>正在使用</td>";
    //                         } else {
    //                             html += "<td>已停用</td>";
    //                         }
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_checkin_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab5').html(html);
    //
    //                 } else if ($("#sel").val() == 6) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].code + "</td>";
    //                         html += "<td>" + a[i].name + "</td>";
    //                         html += "<td>" + a[i].attribute + "</td>";
    //                         html += "<td>" + a[i].type + "</td>";
    //                         html += "<td>" + a[i].bay + "</td>";
    //                         html += "<td>" + a[i].terminal + "</td>";
    //                         if (a[i].State == 1) {
    //                             html += "<td>正在登机</td>";
    //                         } else {
    //                             html += "<td>已起飞</td>";
    //                         }
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_gate_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab6').html(html);
    //                 } else if ($("#sel").val() == 7) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].name + "</td>";
    //                         html += "<td>" + a[i].id_Number + "</td>";
    //                         html += "<td>" + a[i].tel + "</td>";
    //                         if (a[i].sex == 1) {
    //                             html += "<td>男</td>";
    //                         } else {
    //                             html += "<td>女</td>";
    //                         }
    //                         if (a[i].is_Vip == 1) {
    //                             html += "<td>是</td>";
    //                         } else {
    //                             html += "<td>否</td>";
    //                         }
    //                         html += "<td>" + a[i].last_Land_Time + "</td>";
    //                         html += "<td>" + a[i].last_Land_Flight + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_passenger')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab7').html(html);
    //                 } else if ($("#sel").val() == 8) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].name + "</td>";
    //                         html += "<td>" + a[i].flight_No + "</td>";
    //                         html += "<td>" + a[i].seat + "</td>";
    //                         html += "<td>" + a[i].cabin + "</td>";
    //                         html += "<td>" + a[i].voyage + "</td>";
    //                         html += "<td>" + a[i].check_Time + "</td>";
    //                         html += "<td>" + a[i].check_Counter + "</td>";
    //                         html += "<td>" + a[i].security_Time + "</td>";
    //                         html += "<td>" + a[i].security_Channel + "</td>";
    //                         html += "<td>" + a[i].boarding_Time + "</td>";
    //                         html += "<td>" + a[i].peer + "</td>";
    //                         html += "<td>" + a[i].arrive + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_passenger_info')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab8').html(html);
    //                 } else if ($("#sel").val() == 9) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].code + "</td>";
    //                         html += "<td>" + a[i].zwms + "</td>";
    //                         html += "<td>" + a[i].ywms + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_reason_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab9').html(html);
    //                 } else if ($("#sel").val() == 10) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].number + "</td>";
    //                         html += "<td>" + a[i].bay + "</td>";
    //                         html += "<td>" + a[i].terminal + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_rec_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab10').html(html);
    //                 } else if ($("#sel").val() == 11) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].number + "</td>";
    //                         html += "<td>" + a[i].length + "</td>";
    //                         html += "<td>" + a[i].direction + "</td>";
    //                         html += "<td>" + a[i].attribute + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_runway_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab11').html(html);
    //                 } else if ($("#sel").val() == 12) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].bay_No + "</td>";
    //                         html += "<td>" + a[i].bay_Sx + "</td>";
    //                         html += "<td>" + a[i].bay_Tksx + "</td>";
    //                         html += "<td>" + a[i].bay_Jwc + "</td>";
    //                         html += "<td>" + a[i].bay_Jwk + "</td>";
    //                         html += "<td>" + a[i].bay_Lx + "</td>";
    //                         html += "<td>" + a[i].bay_Zt + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_seat_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab12').html(html);
    //                 } else if ($("#sel").val() == 13) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].task_Code + "</td>";
    //                         html += "<td>" + a[i].task_Zh_Short + "</td>";
    //                         html += "<td>" + a[i].task_Sort + "</td>";
    //                         html += "<td>" + a[i].task_Zh + "</td>";
    //                         html += "<td>" + a[i].task_En + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_task_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab13').html(html);
    //                 } else if ($("#sel").val() == 14) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].code + "</td>";
    //                         html += "<td>" + a[i].attribute + "</td>";
    //                         if (a[i].state == 1) {
    //                             html += "<td>正在使用</td>";
    //                         } else {
    //                             html += "<td>已停用</td>";
    //                         }
    //                         html += "<td>" + a[i].company + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_terminal_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab14').html(html);
    //                 } else if ($("#sel").val() == 15) {
    //                     for (var i = 0; i < a.length; i++) {
    //                         html += "<tr>";
    //                         html += "<td><label><input type=\"checkbox\" class=\"ace\"><span class=\"lbl\"></span></label></td>";
    //                         html += "<td>" + a[i].xl_Zpbm + "</td>";
    //                         html += "<td>" + a[i].xl_Zpsx + "</td>";
    //                         if (a[i].xl_Zpzt == 1) {
    //                             html += "<td>正在使用</td>";
    //                         } else {
    //                             html += "<td>已停用</td>";
    //                         }
    //                         html += "<td>" + a[i].lb_Bm_Ss + "</td>";
    //                         html += "<td>" + a[i].xl_Hjl + "</td>";
    //                         html += "<td class=\"td-manage\"><a title=\"编辑\" onclick=\"member_edit(" + a[i].id + ")\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this," + a[i].id + ",'f_turntable_basic_data')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>";
    //                         html += "</tr>";
    //                     }
    //                     $('#tab15').html(html);
    //                 }
    //             }
    //         });
    //     }


</script>