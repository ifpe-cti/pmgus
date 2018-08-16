/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.controladores;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes.RepositorioMedidasDrogasImplBD;
import com.github.viniciussoaresti.negocio.MedidasDrogas;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author BarrosPedro
 */

@ManagedBean
@SessionScoped
public class MedidasDrogasController {
     private RepositorioGenerico<MedidasDrogas,Integer> repositorioMedidasDrogas = null;
    private MedidasDrogas medidasDrogasCadastro;
    private MedidasDrogas selectedMedidasDrogas;
   
    MedidasDrogas medidasDrogas = new MedidasDrogas();
    
    public MedidasDrogasController(){
        this.repositorioMedidasDrogas = new RepositorioMedidasDrogasImplBD();
        this.medidasDrogasCadastro = new MedidasDrogas();
    }
    
    public void inserir(){
        
        this.repositorioMedidasDrogas.inserir(this.medidasDrogasCadastro);
        this.medidasDrogasCadastro = new MedidasDrogas();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A medidasDrogas foi cadastrada com sucesso!"));
    }
    
    public void alterar(MedidasDrogas c){
        this.repositorioMedidasDrogas.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A medidasDrogas foi alterada com sucesso!"));
    }
    
    public MedidasDrogas recuperarMedidasDrogas(int codigo){
        return this.repositorioMedidasDrogas.recuperar(codigo);
    }
    
    public void deletar(MedidasDrogas c){
        this.repositorioMedidasDrogas.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A medidasDrogas foi deletada com sucesso!"));
    }
    
    public List<MedidasDrogas> recuperarTodosMedidasDrogass(){
        return this.repositorioMedidasDrogas.recuperarTodos();
    }

    public MedidasDrogas getMedidasDrogasCadastro() {
        return medidasDrogasCadastro;
    }

    public void setMedidasDrogasCadastro(MedidasDrogas medidasDrogasCadastro) {
        this.medidasDrogasCadastro = medidasDrogasCadastro;
    }

    public MedidasDrogas getSelectedMedidasDrogas() {
        return selectedMedidasDrogas;
    }

    public void setSelectedMedidasDrogas(MedidasDrogas selectedMedidasDrogas) {
        this.selectedMedidasDrogas = selectedMedidasDrogas;
    }

    public RepositorioGenerico<MedidasDrogas,Integer> getRepositorioMedidasDrogas() {
        return repositorioMedidasDrogas;
    }

    public void setRepositorioMedidasDrogas(RepositorioGenerico<MedidasDrogas, Integer> repositorioMedidasDrogas) {
        this.repositorioMedidasDrogas= repositorioMedidasDrogas;
    }

    public MedidasDrogas getMedidasDrogas() {
        return medidasDrogas;
    }

    public void setMedidasDrogas(MedidasDrogas medidasDrogas) {
        this.medidasDrogas = medidasDrogas;
    }
}
