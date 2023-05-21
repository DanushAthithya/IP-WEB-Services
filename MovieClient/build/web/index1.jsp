<%-- 
    Document   : index1
    Created on : 14 May, 2023, 6:18:37 AM
    Author     : danus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Compare</title>
    </head>
    <body>
        <h1>Best Movie</h1>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	moviedb.MovieDB_Service service = new moviedb.MovieDB_Service();
	moviedb.MovieDB port = service.getMovieDBPort();
	 // TODO initialize WS operation arguments here
	java.lang.String movie1 = request.getParameter("a");
	java.lang.String movie2 = request.getParameter("b");
	// TODO process result here
	java.lang.String result = port.movComp(movie1, movie2);
    %>
    <h4><%=result%></h4>
    <%
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
