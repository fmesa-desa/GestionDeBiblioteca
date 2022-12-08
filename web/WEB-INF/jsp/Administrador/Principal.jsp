<%-- 
    Document   : Principal
    Created on : 4 dic. 2022, 22:45:01
    Author     : martin
--%>

<%@page import="servicios.Administrador"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>        
        <%@include file="../recursos/header_refs" %> 
        <title>Administrador | Principal</title>
    </head>
    <body>       
        <div id="main">         
            <%@include file="Header.jspf" %>
            <%@include file="../recursos/EnConstruccion.jspf"%>  
            <div class="jumbotron">
               INGRESO OK!               
            </div>
            <%@include file="Footer.jspf" %>
        </div>  

    </body>
</html>
