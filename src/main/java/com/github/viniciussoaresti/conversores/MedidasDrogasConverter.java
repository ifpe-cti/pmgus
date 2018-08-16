package com.github.viniciussoaresti.conversores;


import com.github.viniciussoaresti.controladores.MedidasDrogasController;
import com.github.viniciussoaresti.negocio.MedidasDrogas;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
 

 
@FacesConverter("medidasDrogasConverter")
public class MedidasDrogasConverter implements Converter {
 
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                MedidasDrogasController service = (MedidasDrogasController) fc.getExternalContext().getSessionMap().get("medidasDrogasController");
                return service.recuperarMedidasDrogas(Integer.parseInt(value));
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
            return String.valueOf(((MedidasDrogas) object).getCodigo());
        }
        else {
            return null;
        }
    }   
}