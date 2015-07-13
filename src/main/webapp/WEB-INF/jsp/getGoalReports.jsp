<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Goals Report</title>
</head>
<body>
	<table>
		<tr>
			<th>Minutes</th>
			<th>Exercise Minutes</th>
			<th>Activity</th>
		</tr>
		
		<c:forEach items="${goalReports}" var="goalReport">
			<tr>
				<td>${goalReport.minutes}</td>
				<td>${goalReport.exerciseMinutes}</td>
				<td>${goalReport.exerciseActivity}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>