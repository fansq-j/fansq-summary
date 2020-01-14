<!Doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta content="WangID黄页" http-equiv="keywords">
    <meta name="description" content="WangID黄页">
    <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
    <title>本地生活服务分类信息黄页触屏版自适应手机wap门户网站模板下载【http://www.lanrenmb.com/shenghuofuwu/menhu/】</title>
    <link rel="stylesheet" href="${re.contextPath}/ftl/client_ftl/css/index.css" type="text/css">
    <link rel="stylesheet" href="${re.contextPath}/ftl/client_ftl/css/zy.css" type="text/css">
    <link rel="stylesheet" href="${re.contextPath}/ftl/client_ftl/css/swiper.min.css" type="text/css">
    <script type="text/javascript" src="${re.contextPath}/ftl/client_ftl/js/swiper.min.js"></script>
    <script type="text/javascript" src="${re.contextPath}/ftl/client_ftl/js/jquery-1.4.4.min.js"></script>
</head>
<body>
<div id="zhuye">
    <!-- 头部 -->
    <div class="toub_beij ">
        <div class="logo_k">
            <a href="${re.contextPath}/IndexLista"><img src="${re.contextPath}/ftl/client_ftl/images/logo.jpg"></a>
        </div>
        <div class="sous" style="margin-left: 20px;width: 181px;height: 25px">
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
    <div class="lieb" id="Huan">
        <ul>
            <#list serverClientRes as itemRes>
            <li>
                <a href="${re.contextPath}/CompanyDetails?keyword=${itemRes.subclass_name!}&gsxx_id=${itemRes.gsxx_id!}&num=0">
                    <h1><img src="${re.contextPath}/ftl/client_ftl/images/lieb_img_1.jpg"></h1>
                    <dl>
                        <dt><h2>${itemRes.gsxx_name!}</h2></dt>
                        <dd>${itemRes.gsxx_intro!}</dd>
                        <span>${itemRes.gsxx_create_time?substring(0,10)!}</span>
                    </dl>
                </a>
            </li>
            </#list>
        </ul>
    </div>
    <!--加载更多 -->
    <div class="jiazgd">
        <a href="javascript:;" onclick="YeNum()">加载更多</a>
    </div>
    <!--底部-->
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
        <input class="in_1" type="button" value="取消" name="">
        <input class="in_2" type="text" id="gjz" placeholder="输入关键字" name="">
        <input type="hidden" id="fy" value="${keyword}">
        <a href="javascript:;" onclick="seek()" class="in_3">搜索</a>
    </div>
    <div class="rimsous">
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

        var oDiv=document.getElementById('div1');
        var GenD=oDiv.getElementsByClassName('anniu')[0];
        var HuiS=document.getElementById('wodc');
        var TanC=document.getElementById('tanc');
        var aH1=TanC.getElementsByTagName('h1')[0];
        var aLi=TanC.getElementsByTagName('li');
        GenD.onclick=function()
        {
            TanC.className+=' gengd_fenl_1';
            HuiS.className+=' toumd_1';
        }
        for(var i=0;i<aLi.length;i++)
        {
            aLi[i].onclick=function()
            {
                TanC.className='';
                TanC.className='gengd_fenl';
                HuiS.className='';
                HuiS.className='toumd';
            }
        }
        aH1.onclick=function()
        {
            TanC.className='';
            TanC.className='gengd_fenl';
            HuiS.className='';
            HuiS.className='toumd';
        }
        HuiS.onclick=function()
        {
            TanC.className='';
            TanC.className='gengd_fenl';
            HuiS.className='';
            HuiS.className='toumd';
        }

    }
</script>
<script>
    var num = 0;
    seek = function() {
        var gjz = $('#gjz').val();
        var gsxx_id = '';
        $.ajax({
            type:"GET",
            dataType:"json",
            url:"${re.contextPath}/IndexListRess?keyword="+gjz+"&num="+num+"&gsxx_id="+gsxx_id,
            success:function(data){
                $("#Huan").html("");
                $.each(data,function(index,obj){
                    $("#Huan").append("<ul><li><a href=\"${re.contextPath}/CompanyDetails?keyword="+obj.gsxx_name+"&gsxx_id="+obj.gsxx_id+"&num=0\"><h1><img src=\"${re.contextPath}/ftl/client_ftl/images/lieb_img_1.jpg\"></h1><dl><dt><h2>"+obj.gsxx_name+"</h2></dt><dd>"+obj.gsxx_intro+"</dd><span>"+obj.gsxx_create_time+"</span></dl></a></li></ul>")
                });
                if (gjz != null && gjz!=""){
                    if (data != null && data != ""){
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                    }else {
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                        $("#Huan").append("<ul><li>未查到相关公司</li></ul>");
                    }

                }
            },
        });
    }
    YeNum = function() {
        num = num+1;
        var gjz = $('#fy').val();
        var gsxx_id = '';
        $.ajax({
            type:"GET",
            dataType:"json",
            url:"${re.contextPath}/IndexListRess?keyword="+gjz+"&num="+num+"&gsxx_id="+gsxx_id,
            success:function(data){
                $.each(data,function(index,obj){
                    if (obj.gsxx_name != null){
                        $("#Huan").append("<ul><li><a href=\"${re.contextPath}/CompanyDetails?keyword="+obj.gsxx_name+"&gsxx_id="+obj.gsxx_id+"&num=0\"><h1><img src=\"${re.contextPath}/ftl/client_ftl/images/lieb_img_1.jpg\"></h1><dl><dt><h2>"+obj.gsxx_name+"</h2><p>通城<em>3</em>年</p></dt><dd>"+obj.gsxx_intro+"</dd><span>"+obj.gsxx_create_time+"</span></dl></a></li></ul>")
                    }
                });
                if (gjz != null && gjz!=""){
                    if (data != null && data != ""){
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                    }else {
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                        alert("无相关公司")
                    }

                }
            },
        });
    }
</script>