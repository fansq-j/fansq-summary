<#--Created by IntelliJ IDEA.
User: zxm
Date: 2017/12/20
Time: 10:00
To change this template use File | Settings | File Templates.-->

<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>添加公司</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
  <link rel="stylesheet" href="${re.contextPath}/plugin/layui/css/layui.css">
  <link rel="stylesheet" href="${re.contextPath}/plugin/ztree/css/metroStyle/metroStyle.css">
  <script type="text/javascript" src="${re.contextPath}/plugin/jquery/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/layui/layui.all.js" charset="utf-8"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/ztree/js/jquery.ztree.core.js"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/ztree/js/jquery.ztree.excheck.js" charset="utf-8"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/tools/tool.js"></script>
    <script  type="text/javascript">
        var setting = {
            check: {
                enable: true
            },
            data: {
                simpleData: {
                    enable: true
                }
            }
        };
        var zNodes =${menus};
        $(document).ready(function(){
            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        });
    </script>
</head>

<body>
<div class="x-body">
  <form class="layui-form layui-form-pane" style="margin-left: 20px;">
    <div style="width:100%;height:400px;overflow: auto;">
    <div class="layui-form-item">
      <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
        <legend style="font-size:16px;">公司信息</legend>
      </fieldset>
    </div>
    <div class="layui-form-item">
      <label for="companyName" class="layui-form-label">
        <span class="x-red">*</span>公司名称
      </label>
      <div class="layui-input-inline">
        <input type="text"  id="companyName" name="companyName"  lay-verify="companyname"
               autocomplete="off" class="layui-input">
      </div>

    </div>
    <div class="layui-form-item">
    <div class="layui-inline">
      <label for="remark" class="layui-form-label">
        <span class="x-red">*</span>关键字
      </label>
      <div class="layui-input-inline" id="keyWord">
        <input  type="text" id="keyWord" name="keyWord" lay-verify="keyWord"  autocomplete="off" class="layui-input">
          <div style="position: absolute; left: 200px; top: 7px;"><input class="button_add"  type="button" value="添加" id="bt-add" onclick="ready()"/></div>

      </div>
    </div>
    </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label for="companyAddress" class="layui-form-label">
                    <span class="x-red">*</span>公司地址
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="companyAddress" name="companyAddress" lay-verify="companyAddress"  autocomplete="off" class="layui-input">
                </div>
            </div>

        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label for="companyTel" class="layui-form-label">
                    <span class="x-red">*</span>公司电话
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="companyTel" name="companyTel" lay-verify="companyTel"  autocomplete="off" class="layui-input">
                </div>
            </div>

        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label for="intro" class="layui-form-label">
                    <span class="x-red">*</span>公司简介
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="intro" name="intro" lay-verify="intro"  autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label for="introduce" class="layui-form-label">
                    <span class="x-red">*</span>公司介绍
                </label>
                <div class="layui-input-inline">
                    <textarea  id="introduce" rows="5" cols="40" name="introduce" lay-verify="introduce"  autocomplete="off" ></textarea>
                </div>
            </div>
        </div>
      <div style="height: 60px"></div>
    </div>

  <div style="width: 100%;height: 55px;background-color: white;border-top:1px solid #e6e6e6;
  position: fixed;bottom: 1px;margin-left:-20px;">
    <div class="layui-form-item" style=" float: right;margin-right: 30px;margin-top: 8px">

      <button  class="layui-btn layui-btn-normal" lay-filter="add" lay-submit>
        增加
      </button>
      <button  class="layui-btn layui-btn-primary" id="close">
        取消
      </button>
    </div>
  </div>
  </form>
</div>
<script>

  layui.use(['form','layer'], function(){
    $ = layui.jquery;
    var form = layui.form
        ,layer = layui.layer;

    //自定义验证规则
    form.verify({
        companyName: function(value){
        if(value.trim()==""){
          return "角色名不能为空";
        }
      },

        companyAddress: function(value){
            if(value.trim()==""){
                return "公司地址不能为空";
            }
        },
        companyTel: function(value){
            if(value.trim()==""){
                return "公司电话不能为空";
            }
        },
        keyWord: function(value){
            if(value.trim()==""){
                return "关键字不能为空";
            }
        }
    });

   $('#close').click(function(){
     var index = parent.layer.getFrameIndex(window.name);
     parent.layer.close(index);
   });
    //监听提交
    form.on('submit(add)', function(data){
        var r=document.getElementsByName("keyWord");
        var keywords=[];
        for(var i=0;i<r.length;i++){
            console.info(r[i].value);
            keywords.push(r[i].value);

        }
        console.info(keywords);

        data.field.keywords=keywords;
      layerAjax('addEnterprise',data.field,'enterpriseList');
      return false;
    });
  });
  function ready() {
      $("#keyWord").append("<div><input type='text' name='keyWord' lay-verify='keyWord'  autocomplete='off' class='layui-input'>" +
          "<input class=\"button_del\"  type=\"button\" value=\"删除\" id=\"bt-del\" onclick=\"del(this)\"/></div>");

  }
function del(obj) {

    obj.parentNode.parentNode.removeChild(obj.parentNode);

}
</script>
</body>

</html>
