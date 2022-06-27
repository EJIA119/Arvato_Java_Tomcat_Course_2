<%-- 
    Document   : JspSimple
    Created on : Jun 22, 2022, 10:41:34 AM
    Author     : CHEW017
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Demonstrates JSP Expression -->

<HTML>
    <BODY>
        <H1>Hello <%= request.getParameter("name")%></H1>
    </BODY>
</HTML>

