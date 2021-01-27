<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>EMPNO</td>
			<td>ENAME</td>
			<td>JOB</td>
			<td>MGR</td>
			<td>HIREDATE</td>
			<td>SAL</td>
			<td>COMM</td>
			<td>DEPTNO</td>
		</tr>
		<c:forEach items="${list}" var="vo">
		<tr>
			<td>${vo.empno}</td>
			<td>${vo.ename}</td>
			<td>${vo.job}</td>
			<td>${vo.mgr}</td>
			<td>${vo.hiredate}</td>
			<td>${vo.sal}</td>
			<td>${vo.comm}</td>
			<td>${vo.deptno}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="11"> <a href="write_view">글작성</a> </td>
		</tr>
	</table>
</body>
</html>