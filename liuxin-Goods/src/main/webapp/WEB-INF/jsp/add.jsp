<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.1.min.js">
</script>
</head>
<body>
<form action="add.do" method="post">
	商品名称:<input type="text" name="gname"><br>
	英文名称:<input type="text" name="gEname"><br>
	商品品牌:<select name="tid" id="tname"></select><br>
	商品种类:<select name="zid" id="zname"></select><br>
	尺寸:<input type="text" name="chicun"><br>
	单价:<input type="text" name="price"><br>
	数量:<input type="text" name="kcl"><br>
	标签:<input type="text" name="biaoqian"><br>
	<input type="submit" value="添加">
</form>
</body>
<script type="text/javascript">
$.ajax({
	url:'getType.do',
	Type:'post',
	dataType:'json',
	success:function(data){
			console.log(data);
			var content="";
			for(var i in data){
				content+="<option value="+data[i].tid+">"+data[i].tname+"</option>";
				}
			$("#tname").html(content);
		}
})
$.ajax({
	url:'getZhongLei.do',
	Type:'post',
	dataType:'json',
	success:function(data){
			console.log(data);
			var content1="";
			for(var i in data){
				content1+="<option value="+data[i].zid+">"+data[i].zname+"</option>";
				}
			$("#zname").html(content1);
		}
})
</script>
</html>