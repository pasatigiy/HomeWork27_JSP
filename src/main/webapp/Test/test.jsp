<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 18.07.2021
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>


</head>
<body>
<jsp:include page="_header.jsp"/>
<form action="/test" method="post">
    <input type="text" name="num1" placeholder="Num1">
    <input type="text" name="num2" placeholder="Num2">
    <button>Calc</button>

</form>
<p>${requestScope.result}</p>


<%--<p>My name<%=request.getAttribute("name")%></p>--%>
<%--<p> My name ${requestScope.name}</p>--%>
<%--<%! int age; %>--%>
<%--<%--%>

<%--    for (int i = 0; i<10; i++){--%>
<%--        out.println(i);--%>
<%--    }--%>

<%--    class Calc {--%>
<%--        double sum(double a, double b){--%>
<%--            return a+b;--%>
<%--        }--%>
<%--    }--%>

<%--%>--%>
<%--<%--%>
<%--Calc calc = new Calc();--%>
<%--Double result = calc.sum(Double.parseDouble(request.getParameter("num1")), Double.parseDouble(request.getParameter("num2")));--%>
<%--out.print("Result " + result);--%>


<%--%>--%>

</body>
</html>
