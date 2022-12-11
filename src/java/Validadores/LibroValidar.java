/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validadores;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import servicios.Libro;

/** 
 * @author martin
 */


public class LibroValidar implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return Libro.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "Asignatura", "required.Asignatura","El campo 'Asignatura' es obligatorio");
        
    }
    
    
}
