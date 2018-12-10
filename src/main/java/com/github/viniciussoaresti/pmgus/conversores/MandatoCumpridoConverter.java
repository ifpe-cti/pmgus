/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.conversores;

import com.github.viniciussoaresti.pmgus.controladores.MandatoCumpridoController;
import com.github.viniciussoaresti.pmgus.negocio.MandatoCumprido;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author pronatec
 */
@FacesConverter("mandatoCumpridoConverter")
public class MandatoCumpridoConverter implements Converter {
 
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                MandatoCumpridoController service = (MandatoCumpridoController) fc.getExternalContext().getSessionMap().get("mandatoCumpridoController");
                return service.recuperarMandatoCumprido(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        }
        else {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((MandatoCumprido) object).getCodigo());
        }
        else {
            return null;
        }
    }   
}