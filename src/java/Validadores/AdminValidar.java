/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validadores;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import servicios.Admin;


/**
 *
 * @author martin
 */
public class AdminValidar implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Admin.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Admin _admin = (Admin)o;
        ValidationUtils.rejectIfEmpty(errors, "Correo", "required.Correo","El campo 'Correo' es obligatorio");
        ValidationUtils.rejectIfEmpty(errors, "Clave", "required.Correo","El campo 'Clave' es obligatorio");
        
    }
    
}
