/**
 * 客户的库存主表
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */

/**数据渲染对象*/
var Render = {
    /**
     * 上移
     * @param primary   主键id
     * @param number    上移条数
     */
    moveTop: function (primary,number) {
        Msg.msg("id:"+primary+" 上移: " + number);

    },
    /**
     * 下移
     * @param primary   主键id
     * @param number    下移条数
     */
    moveBottom: function (primary,number) {
        Msg.msg("id:"+primary+" 下移: " + number);
    },
    /**
     * 渲染状态列
     * @param rowdata    行数据
     * @param renderData 渲染后的列
     * @param index
     * @param value      当前对象值
     */
    customState: function (rowdata,renderData, index, value) {
        if(value == "启用"){
            return '<span style="color:green">'+value+'</span>';
        }
        if(value == "禁用"){
            return '<span style="color:red">'+value+'</span>';
        }
        return value;
    },
    /**
     * @param rowdata    行数据
     * @param renderData 渲染后的列
     * @description      详情按钮渲染
     */
    info:function(rowdata,renderData){
        var btn=' <button  onclick="detailOne(\''+"/companyinventorymain/info"+'\',\''+rowdata.cominvenmId+'\')" class="layui-btn layui-btn-mini">详情</button>';
        return btn;
    },
    /**
     * @param rowdata    行数据
     * @param renderData 渲染后的列
     * @description      修改按钮渲染
     */
    edit:function(rowdata,renderData){
        var btn=' <button  onclick="editOne(\''+"/companyinventorymain/edit"+'\',\''+rowdata.cominvenmId+'\')" class="layui-btn layui-btn-mini">修改</button>';
        return btn;
    },
    /**
     * @param rowdata    行数据
     * @param renderData 渲染后的列
     * @description      删除按钮渲染
     */
    delete:function(rowdata,renderData){
        var btn=' <button  onclick="deleteOne(\''+"删除"+'\',\''+"/companyinventorymain/delete"+'\',\''+rowdata.cominvenmId+'\')" class="layui-btn layui-btn-mini layui-btn-delete">删除</button>';
        return btn;
    },
    /**
     * @param rowdata    行数据
     * @param renderData 渲染后的列
     * @description      启用禁用按钮渲染
     */
    state:function(rowdata,renderData){
        if(rowdata.state=='0'){
            return' <button onclick="updateStateOne(\''+"启用"+'\',\''+"/companyinventorymain/enable"+'\',\''+rowdata.cominvenmId+'\')"' +
                '  class="layui-btn layui-btn-mini layui-btn-green">启用</button>';
        }
        if(rowdata.state=='1'){
            return' <button  onclick="updateStateOne(\''+"禁用"+'\',\''+"/companyinventorymain/limit"+'\',\''+rowdata.cominvenmId+'\')" ' +
                'class="layui-btn layui-btn-mini layui-btn-danger">禁用</button>';
        }
        return "";
    }
};
