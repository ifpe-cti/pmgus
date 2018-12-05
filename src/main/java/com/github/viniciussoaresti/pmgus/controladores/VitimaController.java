/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;


import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioVitimaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Vitima;
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
public class VitimaController{
     private RepositorioGenerico<Vitima,Integer> repositorioVitima = null;
    private Vitima vitimaCadastro;
    private Vitima selectedVitima;
   
    Vitima vitima = new Vitima();
    
    public VitimaController(){
        this.repositorioVitima = new RepositorioVitimaImplBD();
        this.vitimaCadastro = new Vitima();
    }
    
    public void inserir(){
        
        this.repositorioVitima.inserir(this.vitimaCadastro);
        this.vitimaCadastro = new Vitima();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A vítima foi cadastrada com sucesso!"));
    }
    
    public void alterar(Vitima c){
        this.repositorioVitima.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A vítima foi alterada com sucesso!"));
    }
    
    public Vitima recuperarVitima(int codigo){
        return this.repositorioVitima.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioVitima.deletar(selectedVitima);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A vítima foi deletada com sucesso!"));
    }
    
    public List<Vitima> recuperarTodosVitimas(){
        return this.repositorioVitima.recuperarTodos();
    }

    public Vitima getVitimaCadastro() {
        return vitimaCadastro;
    }

    public void setVitimaCadastro(Vitima vitimaCadastro) {
        this.vitimaCadastro = vitimaCadastro;
    }

    public Vitima getSelectedVitima() {
        return selectedVitima;
    }

    public void setSelectedVitima(Vitima selectedVitima) {
        this.selectedVitima = selectedVitima;
    }

    public RepositorioGenerico<Vitima,Integer> getRepositorioVitima() {
        return repositorioVitima;
    }

    public void setRepositorioVitima(RepositorioGenerico<Vitima, Integer> repositorioVitima) {
        this.repositorioVitima= repositorioVitima;
    }

    public Vitima getVitima() {
        return vitima;
    }

    public void setVitima(Vitima vitima) {
        this.vitima = vitima;
    }
}
