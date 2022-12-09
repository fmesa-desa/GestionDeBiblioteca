/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Validadores.AdministradorValidar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import servicios.Administrador;
import servicios.Exception_Exception;

/**
 * @author martin
 */
@Controller
public class IngresarControlador {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Ingresar() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Ingresar/Ingresar");
        mav.addObject("Administrador", new Administrador());
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView Ingresar(
            @ModelAttribute("Administrador") Administrador _admin, 
            BindingResult result, SessionStatus status,
            HttpServletRequest req, HttpServletResponse resp)
            throws Exception {
        ModelAndView mav = new ModelAndView();

        try {
            //validar los campos obligatorios!
            AdministradorValidar _AdminValidar = new AdministradorValidar();
            _AdminValidar.validate(_admin, result);

            if (result.hasErrors()) {
                return new ModelAndView("Ingresar/Ingresar", "command", new Administrador());
            } else {
                //test login!          
                servicios.AdministradorWebService_Service service = new servicios.AdministradorWebService_Service();
                servicios.AdministradorWebService cliente = service.getAdministradorWebServicePort();
                Administrador Admin = cliente.administradorLogin(_admin.getCorreo(), _admin.getClave());

                if (Admin != null) {                       
                    req.getSession().setAttribute("Admin", Admin);                    
                    resp.sendRedirect(resp.encodeRedirectURL("AdministradorPrincipal.htm"));
                    return null;
                } else {
                    throw new Exception("Se produjo un error en el ingreso! Consulte a soporte del sistema.");
                }
            }
        } catch (Exception ex) {
            mav.addObject("msje_error", ex.getMessage());
            mav.setViewName("Ingresar/Ingresar");
            return mav;
        }
    }
    
    

}
