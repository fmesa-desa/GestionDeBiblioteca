/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author martin
 */

@Controller
public class PrincipalControlador {
    
    @RequestMapping
    ModelAndView Principal(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Principal/Principal");
        return mav;
    }
    
    
    
    
}
