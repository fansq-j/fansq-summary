<#-- Created by IntelliJ IDEA.
 User: Administrator
 Date: 2017/12/6
 Time: 14:00
 To change this template use File | Settings | File Templates.
 用户管理-->
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>子类服务管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport"
        content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
  <link rel="stylesheet" href="${re.contextPath}/plugin/layui/css/layui.css">
  <link rel="stylesheet" href="${re.contextPath}/plugin/lenos/main.css">
  <script type="text/javascript" src="${re.contextPath}/plugin/jquery/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/layui/layui.all.js"
          charset="utf-8"></script>
    <script type="text/javascript" src="${re.contextPath}/plugin/tools/tool.js"></script>

</head>

<body>
<div class="lenos-search">
  <div class="select">
    子类服务名称：
    <div class="layui-inline">
      <input class="layui-input" height="20px" id="subclassName" autocomplete="off">
    </div>

    <button class="select-on layui-btn layui-btn-sm" data-type="select"><i class="layui-icon"></i>
    </button>
    <button class="layui-btn layui-btn-sm icon-position-button" id="refresh" style="float: right;"
            data-type="reload">
      <i class="layui-icon">ဂ</i>
    </button>
  </div>

</div>
<div class="layui-col-md12" style="height:40px;margin-top:3px;">
  <div class="layui-btn-group">
      <@shiro.hasPermission name="zserver:add">
      <button class="layui-btn layui-btn-normal" data-type="add">
      <i class="layui-icon">&#xe608;</i>新增
    </button>
      </@shiro.hasPermission>
    <@shiro.hasPermission name="zserver:update">
    <button class="layui-btn layui-btn-normal" data-type="update">
      <i class="layui-icon">&#xe642;</i>编辑
    </button>
    </@shiro.hasPermission>


</div>
<table id="zserverList" class="layui-hide" lay-filter="user"></table>
<script type="text/html" id="barDemo">

<@shiro.hasPermission name="zserver:update">
  <a class="layui-btn layui-btn-xs  layui-btn-normal" lay-event="edit">编辑</a>
</@shiro.hasPermission>
<@shiro.hasPermission name="zserver:del">
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</@shiro.hasPermission>
</script>

<script>
  document.onkeydown = function (e) { // 回车提交表单
    var theEvent = window.event || e;
    var code = theEvent.keyCode || theEvent.which;
    if (code == 13) {
      $(".select .select-on").click();
    }
  }
  layui.use('table', function () {
    var table = layui.table;
    //方法级渲染
    table.render({
      id: 'zserverList',
      elem: '#zserverList'
      , url: 'showZserverList'
      , cols: [[
        {checkbox: true, fixed: true, width: '5%'}
        , {
          field: 'subclassName',
          title: '子类服务名称',
          width: '10%',
          sort: true,
          style: 'background-color: #009688; color: #fff;'
        },
        {
          field: 'serverName',
          title: '父类服务名称',
          width: '10%',
          sort: true,
          style: 'background-color: #009688; color: #fff;'
        },
        {
          field: 'priority',
          title: '优先级',
          width: '10%',
          sort: true,
          style: 'background-color: #009688; color: #fff;'
        }
        , {field: 'right', title: '操作', width: '20%', toolbar: "#barDemo"}
      ]]
      , page: true,
      height: 'full-83'
    });

    var $ = layui.$, active = {
      select: function () {
        var subclassName = $('#subclassName').val();
        console.info(subclassName);
        table.reload('zserverList', {
          where: {
            subclassName: subclassName,

          }
        });
      },
      reload:function(){
        $('#subclassName').val('');

        table.reload('zserverList', {
          where: {
            subclassName: null

          }
        });
      },
      add: function () {
        add('添加用户', 'showAddZserver', 700, 450);
      },
      update: function () {
        var checkStatus = table.checkStatus('zserverList')
            , data = checkStatus.data;
        if (data.length != 1) {
          layer.msg('请选择一行编辑,已选['+data.length+']行', {icon: 5});
          return false;
        }
        update('编辑用户', 'showUpdateZserver?id=' + data[0].id, 700, 450);
      }


    };


    //监听工具条
    table.on('tool(user)', function (obj) {
      var data = obj.data;
      if (obj.event === 'del') {
        var index = layer.confirm('确定删除服务类型[<label style="color: #00AA91;">' + data.subclassName + '</label>]?', function () {
          toolDel(data.id,'zserverList');
          layer.close(index);
        });
      } else if (obj.event === 'edit') {
        update('编辑服务类型', 'showUpdateZserver?id=' + data.id, 700, 450);
      }
    });

    $('.layui-col-md12 .layui-btn').on('click', function () {
      var type = $(this).data('type');
      active[type] ? active[type].call(this) : '';
    });
    $('.select .layui-btn').on('click', function () {
      var type = $(this).data('type');
      active[type] ? active[type].call(this) : '';
    });

  });
  function rePwd(title,url,w,h){
    if (title == null || title == '') {
      title = false;
    };
    if (url == null || url == '') {
      url = "404.html";
    };
    if (w == null || w == '') {
      w = ($(window).width() * 0.9);
    };
    if (h == null || h == '') {
      h = ($(window).height() - 50);
    };
    layer.open({
      id: 'zserver-rePwd',
      type: 2,
      area: [w + 'px', h + 'px'],
      fix: false,
      maxmin: true,
      shadeClose: true,
      shade: 0.4,
      title: title,
      content: url,
    });
  }
  function detail(title, url, w, h) {
    if (title == null || title == '') {
      title = false;
    };
    if (url == null || url == '') {
      url = "error/404";
    };
    if (w == null || w == '') {
      w = ($(window).width() * 0.9);
    };
    if (h == null || h == '') {
      h = ($(window).height() - 50);
    };
    layer.open({
      id: 'user-detail',
      type: 2,
      area: [w + 'px', h + 'px'],
      fix: false,
      maxmin: true,
      shadeClose: true,
      shade: 0.4,
      title: title,
      content: url + '&detail=true',
      // btn:['关闭']
    });
  }
  /**
   * 更新用户
   */
  function update(title, url, w, h) {
    if (title == null || title == '') {
      title = false;
    }
    if (url == null || url == '') {
      url = "404.html";
    }
    if (w == null || w == '') {
      w = ($(window).width() * 0.9);
    }
    if (h == null || h == '') {
      h = ($(window).height() - 50);
    }
    layer.open({
      id: 'fserver-update',
      type: 2,
      area: [w + 'px', h + 'px'],
      fix: false,
      maxmin: true,
      shadeClose: false,
      shade: 0.4,
      title: title,
      content: url + '&detail=false'
    });
  }

  /*弹出层*/
  /*
   参数解释：
   title   标题
   url     请求的url
   id      需要操作的数据id
   w       弹出层宽度（缺省调默认值）
   h       弹出层高度（缺省调默认值）
   */
  function add(title, url, w, h) {
    if (title == null || title == '') {
      title = false;
    }
    ;
    if (url == null || url == '') {
      url = "404.html";
    }
    ;
    if (w == null || w == '') {
      w = ($(window).width() * 0.9);
    }
    ;
    if (h == null || h == '') {
      h = ($(window).height() - 50);
    }
    ;
    layer.open({
      id: 'fserver-add',
      type: 2,
      area: [w + 'px', h + 'px'],
      fix: false,
      maxmin: true,
      shadeClose: false,
      shade: 0.4,
      title: title,
      content: url
    });
  }
</script>
</body>

</html>
