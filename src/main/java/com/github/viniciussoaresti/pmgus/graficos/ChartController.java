/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.graficos;

import com.github.viniciussoaresti.pmgus.controladores.OcorrenciaController;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioOcorrenciaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Municipio;
import com.github.viniciussoaresti.pmgus.negocio.Ocorrencia;
import static com.github.viniciussoaresti.pmgus.negocio.Ocorrencia_.ocorrencia;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author veneceo
 */
@ManagedBean
public class ChartController {
    private List <Ocorrencia> ocorrencias = new ArrayList();
        private List <Municipio> municipios = new ArrayList();
    private OcorrenciaController ocorrenciaController;
    
    public ChartController(){
        carregaDadosOcorrencia();
      
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public OcorrenciaController getOcorrenciaController() {
        return ocorrenciaController;
    }

    public void setOcorrenciaController(OcorrenciaController ocorrenciaController) {
        this.ocorrenciaController = ocorrenciaController;
    }
    
    public List<Ocorrencia> getOcorrencia() {
 return ocorrencias;
 }
    
    
 public void setOncorrencia(List<Ocorrencia> ocorrencias) {
 this.ocorrencias = ocorrencias;
 }
 
 public void carregaDadosOcorrencia() {
   ocorrencias = ocorrenciaController.recuperarTodosOcorrencia();
   
  for(Ocorrencia ocorrencia: ocorrencias){
      municipios.add(ocorrencia.getEndereco().getMunicipio());   
  }
 }
}
