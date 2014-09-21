<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- altlag 2013 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Otsikko</title>
</head>
<body>
<form method="post" action="Eka.jsp">
<input type="hidden" name="sessionid" value="12345">
Kirjoita jotain: 
<input type="text" name="muuttuja" size="30" value="${tunnus}" >
<input type=submit value="Anna mennä">


</form>
</body>
</html>