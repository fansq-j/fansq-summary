<!Doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta content="WangID黄页" http-equiv="keywords">
    <meta name="description" content="WangID黄页">
    <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
    <title>本地生活服务分类信息黄页触屏版自适应手机wap门户网站模板下载【http://www.lanrenmb.com/shenghuofuwu/menhu/】</title>
    <link rel="stylesheet" href="${re.contextPath}/ftl/client_ftl/css/index.css" type="text/css">
    <link rel="stylesheet" href="${re.contextPath}/ftl/client_ftl/css/swiper.min.css" type="text/css">
    <script type="text/javascript" src="${re.contextPath}/ftl/client_ftl/js/swiper.min.js"></script>
    <script type="text/javascript" src="${re.contextPath}/ftl/client_ftl/js/jquery.min.js"></script>
    <style type="text/css">
        .addGS{
            font-size: 16px;
        }
        #addD input{
            border: 1px solid;
            height: 26px;
            width: 203px;
        }
        #addD p{
            margin-bottom: 15px;
        }
        #addD{
            text-align: center;
            height: 100%;
            width: 100%;
            padding-top: 14px;
        }
    </style>
</head>
<body>
<div id="zhuye">
    <!-- 头部 -->
    <div class="toub_beij ">
        <div class="logo_k">
            <a href="${re.contextPath}/IndexLista"><img src="${re.contextPath}/ftl/client_ftl/images/logo.jpg" style="height: 43px;width: 100px;position: absolute;top: -9px;left: -5px;"></a>
        </div>
        <div class="sous" style="margin-left: 20px;width: 160px;height: 25px">
            <i></i>
            <p>点击搜索</p>
        </div>
        <a href="${re.contextPath}/addCompanyTz" class="wod_gerzx">发布</a>
    </div>
    <script type="text/javascript">
        //滑动头部透明（针对首页头部用）
        window.onscroll=function(){

            var autoheight=document.body.scrollTop||document.documentElement.scrollTop;
            if(autoheight>10){
                $(".toub_beij").css("position" ,"fixed")
            }else{
                $(".toub_beij").css("position" ,"relative")
            }
        }
    </script>


    <!-- banner -->


    <div class="swiper-container_banner">
        <div class="swiper-wrapper">
            <div class="swiper-slide"><a href="#"><img src="${re.contextPath}/ftl/client_ftl/images/banner1.jpg"></a></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>

   <form id="form-add">
    <div id="addD">
        <p><span style="color: red">*</span><span class="addGS">公司名称:</span><input type="text" id="companyName"></p>
        <p id="keyWord">
            <span style="color: red">*</span><span class="addGS">&nbsp;&nbsp;&nbsp;关键字:</span><input type="text" name="keyWord">
            <input class="button_add" style="margin-left: 68px;" type="button" value="添加" id="bt-add" onclick="ready()"/>
        </p>
        <p><span style="color: red">*</span><span class="addGS">公司地址:</span><input type="text" id="companyAddress"></p>
        <p><span style="color: red">*</span><span class="addGS">公司电话:</span><input type="text" id="companyTel"></p>
        <p><span style="color: red">*</span><span class="addGS">公司简介:</span><input type="text" id="intro"></p>
        <p><span style="color: red">*</span><span class="addGS">公司介绍:</span><input type="text" id="introduce"></p>
        <p>
            <span style="color: red">*</span><span class="addGS">上传执照:</span><input type="file" class="form-control" id="file" name="file" onchange="javascript:preview(this)">
            <!-- 这个是在上传之前回显图片图片展示 -->
            <div id="preview">
            　　<!--这个是为了将页面返回的图片展示出来的.默认隐藏-->
            　　<img style="width: 100px; height: 100px;display:none" id="imgHidden" />
            </div>
        </p>
    </div>
   </form>
    <p style="text-align: center;"><button onclick="add()" style="height: 35px;width: 72px;font-size: 16px;">提交</button></p>
    <div class="dibu_k"></div>
    <!-- 导航 -->
    <div class="dibu_daoh">
        <ul>
            <li><a href="index.html" class="no"><img src="${re.contextPath}/ftl/client_ftl/images/dh_1.png"><p>首页</p></a></li>
            <li><a href="#"><img src="${re.contextPath}/ftl/client_ftl/images/dh_2.png"><p>联系我们</p></a></li>
            <li><a href="dengl.html"><img src="${re.contextPath}/ftl/client_ftl/images/dh_3.png"><p>我的黄页</p></a></li>
        </ul>
    </div>
    <!-- 结束div -->
</div>

<!-- 返回顶部 -->
<div id="tbox">
    <div class="scrollItem" id="toTop"></div>
</div>
<script type="text/javascript">
    $(function () {
        var speed = 800;//滚动速度
        var h=document.body.clientHeight;
        //回到顶部
        $("#toTop").click(function () {
            $('html,body').animate({
                    scrollTop: '0px'
                },
                speed);
        });
    });
</script>
<!-- 搜索 -->
<div class="sous_tanc_k" id="sou">
    <div class="shang">
        <input class="in_1" type="button" value="取消" name="" id="quxiao">
        <input class="in_2" type="text" id="gjz" placeholder="输入关键字" name="">
        <a href="javascript:;" onclick="seek()" class="in_3">搜索</a>
    </div>
    <div class="rimsous" id="xin">
        <#list findKeyWordRes as itemSun>
                <#if  itemSun_index  lt 5>
                    <a href="${re.contextPath}/IndexListRes?keyword=${itemSun.name!}&id=''&num=0">${itemSun.name!}</a>
                </#if>
        </#list>
    </div>
</div>
</body>
</html>



<script type="text/javascript">
    window.onload=function()
    {
        var zhu=document.getElementById('zhuye');
        var dianj=zhu.getElementsByClassName('sous')[0];
        var sou=document.getElementById('sou');
        var qvx=sou.getElementsByTagName('input')[0];
        dianj.onclick=function()
        {
            zhu.style.display = 'none';
            sou.style.display = 'block';
        }
        qvx.onclick=function()
        {
            zhu.style.display = 'block';
            sou.style.display = 'none';
        }

    }
</script>

<script>
     seek = function() {
        var gjz = $('#gjz').val();
         var gsxx_id = '';
         $.ajax({
            type:"GET",
             dataType:"json",
             url:"${re.contextPath}/IndexListRess?keyword="+gjz+"&num=0&gsxx_id="+gsxx_id,
            success:function(data){
                $("#addD").html("");
                $.each(data,function(index,obj){
                    $("#addD").append("<div class=\"lieb\"><ul><li><a href=\"${re.contextPath}/CompanyDetails?keyword="+obj.gsxx_name+"&gsxx_id="+obj.gsxx_id+"&num=0\"><h1><img src=\"${re.contextPath}/ftl/client_ftl/images/lieb_img_1.jpg\"></h1><dl><dt><h2>"+obj.gsxx_name+"</h2><p>通城<em>3</em>年</p></dt><dd>"+obj.gsxx_intro+"</dd><span>"+obj.gsxx_create_time+"</span><span>"+obj.gsxx_id+"</span></dl></a></li></ul></div>")
                });
                if (gjz != null && gjz!=""){
                    if (data != null && data != ""){
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                    }else {
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                        $("#addD").append("<div class=\"lieb\"><ul><li>未查到相关公司</li></ul></div>");
                    }

                }
            },
        });
    }

    $("#quxiao").click(function () {
        window.location.reload();
    })

     add = function() {
         var formData = new FormData($("#form-add")[0]);
        var zswb = $("#file").val();    //获取file中的内容,看是否有值

         var companyName = $('#companyName').val();
         var companyAddress = $('#companyAddress').val();
         var companyTel = $('#companyTel').val();
         var intro = $('#intro').val();
         var introduce = $('#introduce').val();
         var r=document.getElementsByName("keyWord");
         var keywords=[];
         for(var i=0;i<r.length;i++){
             console.info(r[i].value);
             keywords.push(r[i].value);
         }
         $.ajax({
             type:"POST",
             data : formData,
             async: false,
             cache: false,
             processData : false,
             contentType : false,
             url:"${re.contextPath}/addEnterprise?companyName="+companyName+"&companyAddress="+companyAddress+"&companyTel="+companyTel+"&intro="+intro+"&introduce="+introduce+"&keywords="+keywords,
             success:function(data){
                 alert(data)
             },
         });
     }
     ready = function () {
         $("#keyWord").append("<div style='width: 100%;margin-left: 34px;'><input type='text' name='keyWord' lay-verify='keyWord'  autocomplete='off' class='layui-input'>" +
             "<input class=\"button_del\"  type=\"button\" value=\"删除\" id=\"bt-del\" onclick=\"del(this)\"/></div>");

     }
     del = function (obj) {
         obj.parentNode.parentNode.removeChild(obj.parentNode);
     }

     //图片回显:
     function preview(file) {
         $("#imgHidden").css("display", "none");
         var prevDiv = document.getElementById('preview');
         if (file.files && file.files[0]) {
             var reader = new FileReader();
             reader.onload = function(evt) {
                 prevDiv.innerHTML = '<img style="width: 100px;height: 100px;" src="' + evt.target.result + '" />';
             }
             reader.readAsDataURL(file.files[0]);
         } else {
             prevDiv.innerHTML = '<div class="img" style="width: 100px;height:100px;filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' +
                 file.value + '\'"></div>';
         }
     }
</script>
