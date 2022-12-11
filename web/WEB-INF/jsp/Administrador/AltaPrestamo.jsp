<%-- 
    Document   : Principal
    Created on : 4 dic. 2022, 22:45:01
    Author     : martin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>        
        <%@include file="../recursos/header_refs" %> 
        <title>Alta Prestamo</title>
    </head>
    <body>                    
        <div id="main">             
            <%@include file="Header.jspf" %>  
            <div class="col-md-7 col-lg-8 col-xl-8">                
               ALTA PRESTAMO!!!
            </div>            
        </div>
    </div>
</div>
</div>
</div>   
<%
    String Clase = "";String Msje = "";
    if(request.getAttribute("msje_error")!=null){
        Clase = "alert-danger";        
        Msje = request.getAttribute("msje_error").toString();
    }else if(request.getAttribute("msje")!=null){
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
