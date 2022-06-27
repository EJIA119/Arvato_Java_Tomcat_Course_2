<!-- Demonstrates the use of JSP with Java beans -->

<%@ page import="main.java.javawebapps.HelloHelper" %>
<HTML>
    <BODY>
        <H1>
            <jsp:useBean id="helper" class="main.java.javawebapps.HelloHelper" scope= "application"/>

            <%= helper.getGreeting(request.getLocale())%> ${param.name}

        </H1>
    </BODY>
</HTML>