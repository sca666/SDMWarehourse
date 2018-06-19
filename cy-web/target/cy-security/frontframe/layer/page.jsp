<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/8
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>弹出窗口</title>
    <%@ include file="/common/jsp/resource.jsp" %>
</head>
<body>
<div class="layui-input-inline">
    <button class="layui-btn" onclick="submitCode()">提交代码</button>
</div>
<div class="layui-tab" style="height:350px;">
    <ul class="layui-tab-title">
        <li class="layui-this">编写代码</li>
        <li id="showResult">查看效果</li>
        <li>参数详解</li>

    </ul>
    <div class="layui-tab-content" >
        <div class="layui-tab-item layui-show">
            <textarea class="layui-textarea" rows="12" class="layui-code">


             <button class="layui-btn" onclick="Page.open('打开新窗口','/frontframe/layer/jsp/main.jsp','test1')">打开窗口</button> </br></br>

             <button class="layui-btn" onclick="Page.max('窗口最大化','/frontframe/layer/jsp/main.jsp')">打开窗口最大化</button> </br></br>

             <button class="layui-btn" onclick="Page.open({ id:'test2',type: 1, area: ['1000px', '700px'], content: $('#id') })">打开页面层</button> </br></br>

           </textarea>

        </div>

        <div class="layui-tab-item" id="result">

            <button class="layui-btn" onclick="Page.open('打开新窗口','/frontframe/layer/jsp/main.jsp','test1')">打开窗口</button> </br></br>

            <button class="layui-btn" onclick="Page.max('窗口最大化','/frontframe/layer/jsp/main.jsp')">打开窗口最大化</button> </br></br>

            <button class="layui-btn" onclick="Page.open({ id:'test2',type: 1, area: ['1000px', '700px'], content: $('#id') })">打开页面层</button> </br></br>

        </div>

        <div class="layui-tab-item">
            <table class="layui-table">
                <thead>
                <tr>
                    <th>方法</th>
                    <th>功能</th>
                    <th>参数</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Page.open(title,url,id)</td>
                    <td>打开窗口</td>
                    <td>title：标题    url：请求地址  id:窗口id</td>
                </tr>
                <tr>
                    <td>Page.max(title,url,id)</td>
                    <td>打开窗口后立即最大化显示</td>
                    <td>title：标题    url：请求地址  id:窗口id</td>
                </tr>
                <tr>
                    <td>Page.getElement(id,element)</td>
                    <td>获取某个弹窗页面中的某个元素</td>
                    <td>id:窗口id   element:元素节点 如#id</td>
                </tr>
                <tr>
                    <td>closeWindow()</td>
                    <td>关闭当前窗口并刷新父页面表格数据</td>
                    <td></td>
                </tr>
                </tbody>
            </table>

        </div>
    </div>
</div>
<a class="click-span ft-20" href="http://layer.layui.com/" target="_blank"> &gt;&gt;&gt; layer官网入口</a>
<pre class="layui-code" id="id" >
      //layer打开窗口方式
      //打开iframe
      parent.layer.open({
            type: 2,                   //类型 1页面 2iframe
            title: title,              //标题
            shadeClose: false,         //是否关闭遮罩
            shade: [0.3, '#000'],      //遮罩
            maxmin: true,              //开启最大化最小化按钮
            area: ['1000px', '700px'],
            content: url
      });

      //打开页面
       parent.layer.open({
             type: 1,
             content: $('#id') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
        });

</pre>

</body>
<script>
    layui.use('element', function () {
    });

    function submitCode() {
        var code = $("textarea").val();
        $("#result").html(code);
        Msg.success("代码提交成功,请查看效果!");
        Tips.info("点此查看效果",$("#showResult"));
    }

    layui.use('code', function(){ //加载code模块
        layui.code({encode: true}); //引用code方法
    });

</script>
</html>
