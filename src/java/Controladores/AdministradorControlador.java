/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author martin
 */


@Controller
public class AdministradorControlador {
    
    @RequestMapping(method = RequestMethod.GET)
    ModelAndView AdministradorPrincipal(HttpServletRequest req, HttpServletResponse resp) throws IOException{                        
        if(req.getSession().getAttribute("Admin") == null)                
            resp.sendRedirect("Principal.htm");
        
        return new ModelAndView("Administrador/Principal");
    }
    
    @RequestMapping(method = RequestMethod.GET)
    ModelAndView AdministradorSalir(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        req.getSession().removeAttribute("Admin");
        resp.sendRedirect("Principal.htm");
        return null;
    }
    
    
}
