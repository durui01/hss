<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1><font color="red">Update User</font></h1>  
      
    <s:form action="hss_update" method="post">  
    <s:hidden name="user.id"></s:hidden>
    <table> 
    
	   <tr><td><s:textfield name="user.firstName" label="姓" /></td></tr>  
	   <tr><td><s:textfield name="user.lastName" label="名" /></td></tr> 
	   <tr><td><s:textfield name="user.age" label="年龄" /></td></tr>  
	     
        <s:submit></s:submit>  
          
    </table>    
    </s:form>  
      
</body>
</html>