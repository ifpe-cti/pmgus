package com.github.viniciussoaresti.pmgus.conversores;
import com.github.viniciussoaresti.pmgus.controladores.OcorrenciaController;
import com.github.viniciussoaresti.pmgus.controladores.OcorrenciaController;
import com.github.viniciussoaresti.pmgus.negocio.Ocorrencia;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
/**
 *
 * @author viniciussoaresti
 */
   @FacesConverter("OcorrenciaConverter")
public class OcorrenciaConverter implements Converter {
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                OcorrenciaController service = (OcorrenciaController) fc.getExternalContext().getSessionMap().get("ocorrenciaController");
                return service.recuperarOcorrencia(Integer.parseInt(value));
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
            return String.valueOf(((Ocorrencia) object).getCodigo());
        }
        else {
            return null;
        }
    }   
    }