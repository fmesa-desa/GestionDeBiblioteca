<%-- 
    Document   : Error
    Created on : 6 dic. 2022, 18:35:55
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
    <%@include file="../recursos/header_refs" %> 
        <title>Página de Error</title>
    </head>
    <body>
        <div id="content">
            <div class="container">
                <div class="row justify-content-md-center">
                    <div class="col col-lg-8">
                        <div class="error-template text-center"> <i class="fa fa-exclamation-triangle fa-5x text-danger animated zoomIn mb50"></i>
                            <h3 class="main-title"><span>Ocurrio un error!!!</span></h3>
                            <div class="main-title-description">Ocurrio algún error con la aplicación</div>
                            <div class="alert alert-danger">
                                <c:out value="Detalles del error: ${msje_error}"></c:out>
                            </div>
                            <div class="error-actions"> <a href="Principal.htm" class="btn btn-primary btn-lg ml-2 mr-2 mb-3">Llévame a la página principal!</a> <a href="Principal.htm" class="btn btn-light btn-lg ml-2 mr-2 mb-3">Contactar a soporte</a> </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <%@include file="../Principal/Footer.jspf" %>
</html>
