<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">  
    <title>My JSP 'hello.jsp' starting page</title>
  </head>
  <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
  <script type="text/javascript">
  	$(function(){
              $("#btn").click(function(){
                  $.post("mvc/getPerson",{name:$("#name").val()},function(data){
                      alert(data);
                  });
              });
          });
  </script>
  <body>
    Hello World
    <a href="mvc/show">显示</a>
    ${person.name } ${person.age }
    <input id="name">
    <button id = "btn">按钮</button>
    <a href="mvc/user">json</a>
  </body>
</html>
