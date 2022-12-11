<%-- 
    Document   : Principal
    Created on : 24 nov. 2022, 01:08:54
    Author     : martin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="../recursos/header_refs" %>  
    </head>
    <body>
        <div id="main">        
            <%@include file="Header.jspf" %>       
            <%@include file="../recursos/EnConstruccion.jspf"%> 
            <%
                String Clase = "";
                String Msje = "";
                if (request.getAttribute("msje_error") != null) {
                    Clase = "alert-danger";
                    Msje = request.getAttribute("msje_error").toString();
                } else if (request.getAttribute("msje") != null) {
                    Clase = "alert-success";
                    Msje = request.getAttribute("msje").toString();
                }
            %>
            <div class="alert <%=Clase%> text-center">
                <strong><%=Msje%></strong>
            </div>
            <%@include file="Footer.jspf" %>
        </div>        
    </body>      
</html>