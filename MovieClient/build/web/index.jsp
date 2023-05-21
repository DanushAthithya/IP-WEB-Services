<%-- 
    Document   : index.jsp
    Created on : 14 May, 2023, 5:59:11 AM
    Author     : danus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Data</title>
    </head>
    <body>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	moviedb.MovieDB_Service service = new moviedb.MovieDB_Service();
	moviedb.MovieDB port = service.getMovieDBPort();
	 // TODO initialize WS operation arguments here
	java.lang.String movieName = request.getParameter("a");
	// TODO process result here
	java.util.List<java.lang.String> result = port.movSearch(movieName);
        %>
        <h4>Movie:<%=movieName%>
        <h4>Genre:<%=result.get(0)%>
        <h4>Language:<%=result.get(1)%>
        <h4>Year:<%=result.get(2)%>
        <h4>IMDB:<%=result.get(3)%>
        <h4>Director:<%=result.get(4)%>
        <% } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
