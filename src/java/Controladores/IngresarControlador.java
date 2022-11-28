/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Validadores.AdminValidar;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import servicios.Admin;

/**
 *
 * @author martin
 */
@Controller
public class IngresarControlador {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Ingresar() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Ingresar/Ingresar");
        mav.addObject("Admin", new Admin());
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView Ingresar(@ModelAttribute("Admin") Admin _admin, BindingResult result, SessionStatus status) throws Exception {
        try {
            //validar los campos obligatorios!
            AdminValidar _AdminValidar = new AdminValidar();
            _AdminValidar.validate(_admin, result);
            if (result.hasErrors()) {
                return new ModelAndView("Ingresar/Ingresar", "command", new Admin());
            } else {
                //test!
                // consumir un WS para ver si se puede traer el 'admin' de prueba!?
                servicios.AdminWebServices_Service service = new servicios.AdminWebServices_Service();
                servicios.AdminWebServices _cliente = service.getAdminWebServicesPort();
                _admin = _cliente.buscarAdmin(_admin.getCorreo());
                if (_admin != null) {
                    return new ModelAndView("Ingresar/Ingresar", "command", _admin);
                } else {
                    return new ModelAndView();
                }
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

}
