<#--Created by IntelliJ IDEA.
User: zhuxiaomeng
Date: 2017/12/18
Time: 10:05
To change this template use File | Settings | File Templates.-->

<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>父类服务管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
  <link rel="stylesheet" href="${re.contextPath}/plugin/layui/css/layui.css">
  <script type="text/javascript" src="${re.contextPath}/plugin/jquery/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/layui/layui.all.js" charset="utf-8"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/tools/tool.js"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/tools/update-setting.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      var flag='${detail}';
      if(flag){
        $("form").disable();
      }
    });
  </script>

</head>

<body>
<div class="x-body">
  <form class="layui-form layui-form-pane" style="margin-left: 20px;">
    <div style="width:100%;height:400px;overflow: auto;">
    <div class="layui-form-item">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
      <legend style="font-size:16px;">父类服务管理</legend>
    </fieldset>
      </div>
      <input type="hidden" value="${fserver.id}" name="id">
      <div class="layui-form-item">
        <label for="serverName" class="layui-form-label">
          <span class="x-red">*</span>服务名称
        </label>
        <div class="layui-input-inline">
          <input type="text"  id="serverName" name="serverName" value="${fserver.serverName}" lay-verify="serverName"
                 autocomplete="off" class="layui-input">
        </div>
        <div id="ms" class="layui-form-mid layui-word-aux">
          <span class="x-red">*</span><span id="ums">不可为空</span>
        </div>
      </div>
      <div class="layui-form-item">
        <label for="priority" class="layui-form-label">
          <span class="x-red">*</span>优先级
        </label>
        <div class="layui-input-inline">
          <input type="text"  id="priority" name="priority" value="${fserver.priority}" lay-verify="priority"
                 autocomplete="off" class="layui-input">
        </div>
        <div id="ms" class="layui-form-mid layui-word-aux">
          <span class="x-red">*</span><span id="ums">数值越小，优先级越高</span>
        </div>
      </div>
    </div>

      <div style="height: 60px"></div>

  <#if !detail>
  <div style="width: 100%;height: 55px;background-color: white;border-top:1px solid #e6e6e6;
      position: fixed;bottom: 1px;margin-left:-20px;">
  <div class="layui-form-item" style=" float: right;margin-right: 30px;margin-top: 8px">
      <button  class="layui-btn layui-btn-normal" lay-filter="add" lay-submit>
      确定
      </button>
      <button  class="layui-btn layui-btn-primary" id="close">
        取消
      </button>

    </div>
  </div>
  </#if>
  </form>
</div>
<script>
 /* var flag,msg;
  $(function(){
    var name='${user.username}';
    if($('#uname').val()==name)
      flag=true;
      $('#uname').on("blur",function(){
        var uname=$('#uname').val();
        if(uname.match(/[\u4e00-\u9fa5]/)){
          return;
        }
        if(!/(.+){3,12}$/.test(uname)){
          return;
        }
        if(uname!=''&&uname!=name) {
          $.ajax({
            url: 'checkUser?uname=' + uname, async: false, type: 'get', success: function (data) {
              console.info(!data.flag);
              flag = data.flag;
              $('#ms').find('span').remove();
              if (!data.flag) {
                msg = data.msg;
                $('#ms').append("<span style='color: red;'>"+data.msg+"</span>");
               // layer.msg(msg,{icon: 5,anim: 6});
              }else{
                flag=true;
                $('#ms').append("<span style='color: green;'>用户名可用</span>");
              }
            },beforeSend:function(){
              $('#ms').find('span').remove();
              $('#ms').append("<span>验证ing</span>");
            }
          });
        }else{
          flag=true;
        }
      });

  });*/
  layui.use(['form','layer','upload'], function(){
    $ = layui.jquery;
    var form = layui.form
        ,layer = layui.layer,
        upload = layui.upload;
    upload.render({
      elem: '#test10'
      ,url: 'upload'
      ,before: function(obj){
        //预读，不支持ie8
        obj.preview(function(index, file, result){
          $('#demo2').find('img').remove();
          $('#demo2').append('<img src="'+ result +'" alt="'+ file.name +'" width="100px" height="100px" class="layui-upload-img layui-circle">');
        });
      },done: function(res){
       if(!res.flag){
         layer.msg(res.msg,{icon: 5,anim: 6});
       }else{
           console.log(res);
         $("#photo").val(res.msg);
         console.info($('#photo').val());
       }
      }
    });

    //自定义验证规则
    form.verify({
      serverName: function(value){
        if(value.trim()==""){
          return "用户名不能为空";
        }

      }
    });

   $('#close').click(function(){
     var index = parent.layer.getFrameIndex(window.name);
     parent.layer.close(index);
   });
    //监听提交
    form.on('submit(add)', function(data){
      var r=document.getElementsByName("role");
      var role=[];
      for(var i=0;i<r.length;i++){
        if(r[i].checked){
          console.info(r[i].value);
          role.push(r[i].value);
        }
      }
      data.field.role=role;
      layerAjax('updateFserver', data.field, 'fserverList');
      return false;
    });
    form.render();
  });
</script>
</body>

</html>
