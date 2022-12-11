<%-- 
    Document   : AdministradorAltaLibro
    Created on : 10 dic. 2022, 16:04:11
    Author     : martin
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>        
        <%@include file="../recursos/header_refs" %> 
        <title>Administrador | Alta Libro</title>
    </head>
    <body>                    
        <div id="main">   
            <%@include file="Header.jspf" %>
            <div class="col-md-7 col-lg-8 col-xl-8">   
                <div class="page-header bordered">
                    <h5>Ingresar Libro</h5>
                </div>
                <form:form method="post" commandName="Libro">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <form:label path="Titulo"><strong>Titulo:</strong></form:label>
                                <form:input type="text" path="Titulo" class="form-control form-control-lg" />
                                <form:errors path="Titulo" element="div" class="alert alert-danger" />
                            </div> 
                        </div>
                        <div class="col-sm-6">
                            <div class="form-group">
                                <form:label path="Asignatura"><strong>Asignatura:</strong></form:label>
                                <form:input type="text" path="Asignatura" class="form-control form-control-lg" />
                                <form:errors path="Asignatura" element="div" class="alert alert-danger" />
                            </div> 
                        </div>
                    </div>
                </form:form>                
            </div>            
        </div>
    </div>
</div>
</div>
</div>
<%    String Clase = "";
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
<button class="btn btn-primary btn-circle" id="to-top"><i class="fa fa-angle-up"></i></button>
    <%@include file="Footer.jspf" %>
</div>  
</body>
</html>
