<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Hello World!</title>
</head>
    <body>

        <h1>INFO</h1>
        <table>
            <tbody>
                <%

                    for (Enumeration<String> headers = request.getHeaderNames(); headers.hasMoreElements(); ) {
                        String header = headers.nextElement();
                %>
                    <tr><td><%=header%></td><td><%=request.getHeader(header)%></td></tr>
                <%
                    }
                %>
                <tr><td>request.getRemoteAddr()</td><td><%= request.getRemoteAddr()%></td></tr>
                <tr><td>request.getRemotePort()</td><td><%= request.getRemotePort()%></td></tr>
                <tr><td>request.getRemoteHost()</td><td><%= request.getRemoteHost()%></td></tr>
            </tbody>
        </table>

        <h2>Hello World TRIAL!</h2>
        <iframe src="DemoServlet"></iframe>

        <h2>Hello World FREE!</h2>
        <a href="<%=request.getContextPath()%>/DemoServlet?nome=demoUser">Premi qui per la versione gratuita</a>
        <br/>
        <h2>Hello World PRO!</h2>
        <form action="<%=request.getContextPath()%>/DemoServlet" method="post" >
            <label for="nome">Nome:</label> <input id="nome" name="nome" type="text" value="Utente">
            <input id="submit" type="submit" value="Invia"/>
        </form>

        <!--<script type="application/javascript">alert("...Veramente?")</script>-->
    </body>
</html>
