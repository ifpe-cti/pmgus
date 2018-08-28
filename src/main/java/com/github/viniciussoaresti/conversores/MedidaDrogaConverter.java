package com.github.viniciussoaresti.conversores;


import com.github.viniciussoaresti.controladores.MedidaDrogaController;
import com.github.viniciussoaresti.negocio.MedidaDroga;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
 

 
@FacesConverter("medidaDrogaConverter")
public class MedidaDrogaConverter implements Converter {
 
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                MedidaDrogaController service = (MedidaDrogaController) fc.getExternalContext().getSessionMap().get("medidaDrogaController");
                return service.recuperarMedidaDroga(Integer.parseInt(value));
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
            return String.valueOf(((MedidaDroga) object).getCodigo());
        }
        else {
            return null;
        }
    }   
}