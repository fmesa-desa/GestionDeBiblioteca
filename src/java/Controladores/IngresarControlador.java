/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Entidades.Admin;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author martin
 */

@Controller
public class IngresarControlador {
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView Ingresar(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Ingresar/Ingresar");
        return mav;
    }        
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView RecuperarClave(){        
        ModelAndView mav = new  ModelAndView();  
        mav.setViewName("Ingresar/RecuperarClave");
        
        return mav;
    }     
    
    
}
