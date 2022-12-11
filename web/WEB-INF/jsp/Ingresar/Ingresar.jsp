<%-- 
    Document   : Ingresar
    Created on : 24 nov. 2022, 19:27:54
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="../recursos/header_refs" %>  
    </head>
    <body>
        <div id="main">        
            <div class="container">
                <div class="row justify-content-md-center">
                    <div class="col col-md-12 col-lg-10 col-xl-8">

                        <div class="page-header">
                        </div>
                    </div>
                </div>
            </div>
            <div id="content">
                <div class="container">
                    <div class="row justify-content-md-center align-items-center">

                        <div class="row">

                            <img src="img/logo.jpg" class="img-fluid" alt=""> 
                        </div>


                        <div class="col col-md-6  col-lg-5 col-xl-4">
                            <ul class="nav nav-tabs tab-lg" role="tablist">
                                <li role="presentation" class="nav-item"><a class="nav-link active" href="#">Ingresar</a></li>
                            </ul>
                            <div class="tab-content">
                                <form:form method="post" commandName="Administrador">
                                    <div class="form-group">
                                        <form:label path="Correo">Correo:</form:label>
                                        <form:input type="email" path="Correo" class="form-control form-control-lg" placeholder="" />
                                        <form:errors path="Correo" element="div" class="alert alert-danger" />
                                    </div>
                                    <div class="form-group">
                                        <form:label path="Clave">Clave:</form:label>
                                        <form:input type="password" path="Clave" class="form-control form-control-lg" placeholder="" />
                                        <form:errors path="Clave" element="div" class="alert alert-danger" />
                                    </div>
                                    <p class="text-lg-right"><a href="forgot-password.html">Olvide la clave</a>&nbsp;<span class="glyphicon glyphicon-question-sign"></span></p>
                                    <div class="checkbox">
                                        <input type="checkbox" id="remember_me">
                                        <label for="remember_me">Recordarme</label><span class="glyphicon glyphicon-info-sign"></span>
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-lg">Iniciar
                                    </button>
                                </form:form>      
                            </div>
                            <div> </div>
                        </div>







                    </div>
                </div>
            </div>
            <button class="btn btn-primary btn-circle" id="to-top"><i class="fa fa-angle-up"></i></button>









        </div>        
    </body>      
</html>
