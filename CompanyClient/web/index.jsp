<%-- 
    Document   : index
    Created on : 14 May, 2023, 7:40:22 AM
    Author     : danus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                background-color: blue;
            }
            img{
                max-width:20vw;
                min-width:20vh;
            }
        </style>
        <title>Details</title>
    </head>
    <body>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	companydb.Company_Service service = new companydb.Company_Service();
	companydb.Company port = service.getCompanyPort();
	 // TODO initialize WS operation arguments here
	java.lang.String companyName = request.getParameter("a");
	// TODO process result here
	java.util.List<java.lang.String> result = port.compsear(companyName);
        %>
        <img src=<%=result.get(1)%>>
        <p><%=result.get(0)%></p>
        <%
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
