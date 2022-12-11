/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Validadores.LibroValidar;
import java.io.IOException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import servicios.Libro;

/**
 *
 * @author martin
 */
@Controller
public class AdministradorControlador {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView AdministradorAltaPrestamo(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mav = new ModelAndView("Administrador/AltaPrestamo");

        try {
            if (req.getSession().getAttribute("Admin") == null) 
                resp.sendRedirect("Principal.htm");            
                        
            return mav;
        } catch (Exception ex) {
            mav.addObject("msje_error", ex.getMessage());
            return mav;
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView AdministradorSalir(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.getSession().removeAttribute("Admin");
        resp.addCookie(new Cookie("_sesion","false"));
        resp.sendRedirect("Ingresar.htm");
        return null;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView AdministradorAltaLibro(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mav = new ModelAndView("Administrador/AltaLibro");

        try {
            if (req.getSession().getAttribute("Admin") == null)
                resp.sendRedirect("Principal.htm");
            
            mav.addObject("Libro", new Libro());
            return mav;
        } catch (Exception ex) {
            mav.addObject("msje_error", ex.getMessage());
            return mav;
        }
    }
      
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView AdministradorAltaLibro(@ModelAttribute("Libro") Libro _Libro,BindingResult result,
            HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mav = new ModelAndView("Administrador/AltaLibro");
        
        try {
            if (req.getSession().getAttribute("Admin") == null)
                resp.sendRedirect("Principal.htm");
            
            LibroValidar _LibroValidar = new LibroValidar();
            _LibroValidar.validate(_Libro, result);
            
            if (result.hasErrors()) {
                return new ModelAndView("Administrador/AltaLibro", "command", new Libro());
            }
            
            return new ModelAndView();
        } catch (Exception ex) {
            mav.addObject("msje_error", ex.getMessage());
            return mav;
        }
    }
    
    

}
