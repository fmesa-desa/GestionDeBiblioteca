<%-- 
    Document   : Ingresar
    Created on : 24 nov. 2022, 19:27:54
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="../recursos/header_refs" %>        
        <title>GestionDeBiblioteca | Ingresar</title>
    </head>
    <body>
        <%@include file="../Principal/Header.jspf" %>
        <div id="content">
            <div class="container">
                <div class="row justify-content-md-center align-items-center">
                    <div class="col col-md-6  col-lg-5 col-xl-4">
                        <ul class="nav nav-tabs tab-lg" role="tablist">
                            <li role="presentation" class="nav-item"><a class="nav-link active" href="#">Ingresar al sistema</a></li>                            
                        </ul>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="login">
                                <form action="RecuperarClave.htm" method="post">
                                    <div class="form-group">
                                        <label for="correo">Correo Electronico</label>
                                        <input type="email" id="correo" class="form-control form-control-lg" placeholder="Correo...">
                                    </div>
                                    <div class="form-group">
                                        <label for="clave">Clave</label>
                                        <input type="password" id="clave" class="form-control form-control-lg" placeholder="Clave...">
                                    </div>
                                    <p class="text-lg-right"><a href="#">Me olvide la contraseña???</a></p>
                                    <div class="checkbox">
                                        <input type="checkbox" id="remember_me">
                                        <label for="remember_me">Recordarme por favor!</label>
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-lg">Ingresar!</button>
                                </form>                                                                    
                            </div>
                        </div>
                        <div> </div>
                    </div>                   
                </div>
            </div>
        </div>

        <%@include file="../Principal/Footer.jspf" %>        
        <%@include file="../recursos/scripts_refs" %>
    </body>
</html>
