<%--01 Drirectives--%>
<%@page contentType="text/html; ISO-8859-1"%>

<%--02 Page is Same creation as HTML --%>
<html>
<body>
<h1>Hello</h1>
</body>
</html>

<%--03 Scriplets(Java code inside jsp) --%>
<%
    int a=20;
    int b=50;
    int sum=a+b;
%>

<%--04 Expression(value)--%>
<%=20+30%>
<%=sum%>
<%=func(50)%>

<%--05 Declaration--%>
<%!
    int func(int n){
        return n*n;
    }
%>
<html>
<h1> <%=func(5)%>  </h1>
</html>


