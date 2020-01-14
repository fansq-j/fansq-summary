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
            <a href="${re.contextPath}/IndexLista"><img src="${re.contextPath}/ftl/client_ftl/images/logo.jpg" style="height: 43px;width: 100px;position: absolute;top: -9px;left: -5px;"></a>
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


    <!-- banner -->


    <div class="swiper-container_banner">
        <div class="swiper-wrapper">
            <div class="swiper-slide"><a href="#"><img src="${re.contextPath}/ftl/client_ftl/images/banner1.jpg"></a></div>
            <div class="swiper-slide"><a href="#"><img src="${re.contextPath}/ftl/client_ftl/images/banner2.jpg"></a></div>
            <div class="swiper-slide"><a href="#"><img src="${re.contextPath}/ftl/client_ftl/images/banner3.jpg"></a></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
    <script>
        var swiper = new Swiper('.swiper-container_banner', {
            autoplay: {
                delay: 3000,
                stopOnLastSlide: false,
                disableOnInteraction: true,
            },
            pagination: {
                el: '.swiper-pagination',

            },
        });
    </script>

    <div id="Huan">
        <#list findfatherserverClient as itemFather>
            <!-- txt -->
            <div class="text_${itemFather.id}" id="sousuo">
                <div class="biaot">
                    <i><img src="${re.contextPath}/ftl/client_ftl/images/txt_img_${itemFather.id}.png"></i>
                    <h1 class="txt_color_${itemFather.id}">${itemFather.server_name!}</h1>
                </div>
                <ul class="text_wenz">
                    <#list sunserverClient as itemSun>
                        <#if itemSun.server_id == itemFather.id>
                            <li><a href="${re.contextPath}/IndexListRes?keyword=${itemSun.subclass_name!}&id=''&num=0">${itemSun.subclass_name!}</a></li>
                        </#if>
                    </#list>
                </ul>
            </div>
        </#list>
    </div>
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
                $("#Huan").html("");
                $.each(data,function(index,obj){
                    var datestr = (new Date(obj.gsxx_create_time)).toISOString();
                    $("#Huan").append("<div class=\"lieb\"><ul><li><a href=\"${re.contextPath}/CompanyDetails?keyword="+obj.gsxx_name+"&gsxx_id="+obj.gsxx_id+"&num=0\"><h1><img src=\"${re.contextPath}/ftl/client_ftl/images/lieb_img_1.jpg\"></h1><dl><dt><h2 style='font-size: 14px;'>"+obj.gsxx_name+"</h2></dt><dd>"+obj.gsxx_intro+"</dd><span>"+datestr.substring(0, 10)+"</span></dl></a></li></ul></div>")
                });
                if (gjz != null && gjz!=""){
                    if (data != null && data != ""){
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                    }else {
                        $('#sou').css("display","none");
                        $('#zhuye').css("display","block");
                        $("#Huan").append("<div class=\"lieb\"><ul><li>未查到相关公司</li></ul></div>");
                    }

                }
            },
        });
    }

    $("#quxiao").click(function () {
        window.location.reload();
    })

</script>
