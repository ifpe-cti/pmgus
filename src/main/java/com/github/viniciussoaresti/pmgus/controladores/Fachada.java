package com.github.viniciussoaresti.pmgus.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author vinic
 */
@ManagedBean
@SessionScoped
public class Fachada {

    static ArmaController armacontroller = new ArmaController();
    static EnderecoController enderecocontroller = new EnderecoController();
    static LoginController logincontroller = new LoginController();
    static MunicipioController municipiocontroller = new MunicipioController();
    static OcorrenciaController ocorrenciacontroller = new OcorrenciaController();
    static TipoDrogaController tipodrogacontroller = new TipoDrogaController();
    static UnidadeDrogaController unidadedrogacontroller = new UnidadeDrogaController();
    static VitimaController vitimacontroller = new VitimaController();
    static ExcelController excelcontroller = new ExcelController();
    static EncaminhamentosController encaminhamentoscontroller = new EncaminhamentosController();

    public ArmaController getArmacontroller() {
        return armacontroller;
    }

    public EnderecoController getEnderecocontroller() {
        return enderecocontroller;
    }

    public LoginController getLogincontroller() {
        return logincontroller;
    }

    public MunicipioController getMunicipiocontroller() {
        return municipiocontroller;
    }

    public OcorrenciaController getOcorrenciacontroller() {
        return ocorrenciacontroller;
    }

    public TipoDrogaController getTipodrogacontroller() {
        return tipodrogacontroller;
    }

    public UnidadeDrogaController getUnidadedrogacontroller() {
        return unidadedrogacontroller;
    }

    public VitimaController getVitimacontroller() {
        return vitimacontroller;
    }

    public ExcelController getExcelcontroller() {
        return excelcontroller;
    }

    public void cadastrarArmaExcel(){
        excelcontroller.cadastrarArmas(armacontroller);
    }

    public static EncaminhamentosController getEncaminhamentoscontroller() {
        return encaminhamentoscontroller;
    }

    public static void setEncaminhamentoscontroller(EncaminhamentosController encaminhamentoscontroller) {
        Fachada.encaminhamentoscontroller = encaminhamentoscontroller;
    }
    
    
}
