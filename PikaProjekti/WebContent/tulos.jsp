<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isThreadSafe="true"%>
       <!-- altlag 2013 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tulos</title>
</head>
<body>
<h1>Tässä tulokset:</h1>
<p>
Annettu teksti parametrina: 
<c:out value="${param.muuttuja}"></c:out>
</p>
<p>
(ja sama jsp:llä)
<%=request.getParameter("muuttuja") %>
</p>

<p>
Srvletissä teksti attribuuttina: 
<c:out value="${sArttr}"></c:out>
</p>
<p>
Annettu teksit sessiosta:
<c:out value="${juttu}"></c:out>
</p>
</body>
</html>