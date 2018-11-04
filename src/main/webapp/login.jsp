<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN"> 
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <link href="css/login1.css" rel="stylesheet">
    <title>登录</title>
<style>  
        * { margin: 0; padding: 0; }
        html { height: 100%; }
        body { height: 100%; background: #fff url(images/fly6.jpg) 50% 50% no-repeat; background-size: cover;}
        .dowebok { position: absolute; left: 50%; top: 60%; width: 430px; height: 500px; margin: -300px 0 0 -215px; border: 1px solid #fff; border-radius: 20px; overflow: hidden;}
        .logo { width: 104px; height: 104px; margin: 50px auto 80px; background: url(images/login.png) 0 0 no-repeat; }
        .form-item { position: relative; width: 360px; margin: 0 auto; padding-bottom: 30px;}
        .form-item input { width: 288px; height: 48px; padding-left: 70px; border: 1px solid #fff; border-radius: 25px; font-size: 18px; color: #fff; background-color: transparent; outline: none;}
        .form-item button { width: 360px; height: 50px; border: 0; border-radius: 25px; font-size: 18px; color: #1f6f4a; outline: none; cursor: pointer; background-color: #fff; }
        #username { background: url(images/emil.png) 20px 14px no-repeat; }
        #password { background: url(images/password.png) 23px 11px no-repeat; }
        .tip { display: none; position: absolute; left: 20px; top: 52px; font-size: 14px; color: #f50; }
        .reg-bar { width: 360px; margin: 20px auto 0; font-size: 14px; overflow: hidden;}
        .reg-bar a { color: #fff; text-decoration: none; }
        .reg-bar a:hover { text-decoration: underline; }
        .reg-bar .reg { float: left; }
        .reg-bar .forget { float: right; }
        .dowebok ::-webkit-input-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}
        .dowebok :-moz-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}
        .dowebok ::-moz-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}
        .dowebok :-ms-input-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}

        @media screen and (max-width: 500px) {
            * { box-sizing: border-box; }
            .dowebok { position: static; width: auto; height: auto; margin: 0 30px; border: 0; border-radius: 0; }
            .logo { margin: 50px auto; }
            .form-item { width: auto; }
            .form-item input, .form-item button, .reg-bar { width: 100%; }
        }
    </style>
</head>
<body>

    <div class="dowebok">
        <br/><br/><br/><br/>
        <h1 align="center">航班统计系统</h1>
        <br/><br/><br/><br/>
    <form action="userLogin" name="login" method="post">
        <div class="form-item">
            <input name="username" type="text" autocomplete="off" placeholder="账号">
            <p class="tip" name="uname">请输入账号</p>
        </div>
        <div class="form-item">
            <input name="password" type="password" autocomplete="off" placeholder="登录密码">
            <p class="tip" name="upwd">请输入密码</p>
        </div>
    </form>
        <div class="form-item"><button id="submit">登 录</button></div>

    </div>
    <script>
            $('#submit').on('click', function () {
                var name = $("[name='username']").val();
                if(name==""){
                    $("[name='uname']").show();
                }else {
                    $("[name='uname']").hide();
                }
                var pwd = $("[name='password']").val();
                if(pwd==""){
                    $("[name='upwd']").show();
                }else {
                    $("[name='upwd']").hide()
                }

                if(name!=""&&pwd!==""){
                    var from = $("[name='login']");
                    $.ajax({
                        type:"post",
                        url:"login",
                        data:from.serialize(),
                        success:function(result){
                           if(result=="null"){
                               alert("没有此账户！\n请输入正确的账号或者密码！")
                           }else{
                               from.submit();
                           }
                        }
                    })
                }
            })

    </script>

<div style="text-align:center;">
</div>

</body>
</html>