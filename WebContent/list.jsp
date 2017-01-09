	<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	<%@taglib prefix="s" uri="/struts-tags" %>
	
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
	   function del(){
		   if(confirm("Are you sure?")){
			   return true;
		   }
		       return false;
	
	   }
	
	
	
	</script>
	</head>
	<body>
	     <h1><font color="red">Users List</font></h1>
	     <s:a href="index.jsp">index</s:a>
	     <table border="1" width="80%" align="center">
	       <tr>
	            <th>序号</th>  
	            <th>姓</th>  
	            <th>名</th>  
	            <th>年龄</th>  
	            <th>删除</th>  
	            <th>更新</th>       
	       </tr>
	       <s:iterator value="#request.list" id="us">
	         <tr>
	            <td>
	               <s:property value="#us.id"></s:property>
	            </td>
	           
	           <td>
	               <s:property value="#us.firstName"></s:property>
	            </td>
	            
	            <td>
	               <s:property value="#us.lastName"></s:property>
	            </td>
	            
	            <td>
	               <s:property value="#us.age"></s:property>
	            </td>
	            <td align="center">
	            	<s:a href="hss_delete.action?user.id=%{#us.id}" onclick="return del()">DELETE</s:a>
	            </td>
	            <td align="center">
	                <s:a href="hss_findUserById.action?user.id=%{#us.id}" onclick="return update()">UPDATE</s:a>
	            
	            </td>
	            
	         </tr>
	       </s:iterator>
	     </table>
	</body>
	</html>