<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/index_like2.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery-1.11.1.min.js">
</script>
</head>
<body>
<table>
	<tr>
		<td colspan="15">
			商品名称:<input type="text" name="gname">
			<input type="submit" value="查询">
		</td>
	</tr>
	<tr>
		<td>编号</td>
		<td>名称</td>
		<td>英文名称</td>
		<td>品牌</td>
		<td>种类</td>
		<td>尺寸</td>
		<td>单价</td>
		<td>数量</td>
		<td>标签</td>
		<td><button onclick="toadd()">商品添加</button>
		</td>
	</tr>
<c:forEach items="${getList }" var="goods">
	<tr>
		<td>${goods.gid }</td>
		<td>${goods.gname }</td>
		<td>${goods.gEname }</td>
		<td>${goods.tname }</td>
		<td>${goods.zname }</td>
		<td>${goods.chicun }</td>
		<td>${goods.price }</td>
		<td>${goods.kcl }</td>
		<td>${goods.biaoqian }</td>
		<td>
			<button onclick="del(${goods.gid })">删除</button>
			<button>修改</button>
			<button onclick="tochakan(${goods.gid })">查看</button>
		</td>
	</tr>
</c:forEach>
	<tr>
		<td colspan="15">${pageMap.page }</td>
	</tr>
</table>
</body>
<script type="text/javascript">
function toadd() {
	location="toadd.do";
}
function tochakan(gid) {
	location="tochakan.do?gid="+gid;
}
function del(gid) {
	$.ajax({
		url:'del.do',
		data:{gid:gid},
		Type:'post',
		dataType:'json',
		success:function(data){
			if(data){
				alert("删除成功");
				location="getList.do";
				}else{
					alert("删除失败");
					location="getList.do";
					}
			
			}
		
	})
}
</script>
</html>