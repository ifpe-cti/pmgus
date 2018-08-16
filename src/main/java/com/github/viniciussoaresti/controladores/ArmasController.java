/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.controladores;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.infraestrutura.repositorios.implementações.RepositorioArmasImplBD;
import com.github.viniciussoaresti.negocio.Armas;
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
public class ArmasController {
     private RepositorioGenerico<Armas,Integer> repositorioArmas = null;
    private Armas armasCadastro;
    private Armas selectedArmas;
   
    Armas armas = new Armas();
    
    public ArmasController(){
        this.repositorioArmas = new RepositorioArmasImplBD();
        this.armasCadastro = new Armas();
    }
    
    public void inserir(){
        
        this.repositorioArmas.inserir(this.armasCadastro);
        this.armasCadastro = new Armas();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A armas foi cadastrada com sucesso!"));
    }
    
    public void alterar(Armas c){
        this.repositorioArmas.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A armas foi alterada com sucesso!"));
    }
    
    public Armas recuperarArmas(int codigo){
        return this.repositorioArmas.recuperar(codigo);
    }
    
    public void deletar(Armas c){
        this.repositorioArmas.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A armas foi deletada com sucesso!"));
    }
    
    public List<Armas> recuperarTodosArmass(){
        return this.repositorioArmas.recuperarTodos();
    }

    public Armas getArmasCadastro() {
        return armasCadastro;
    }

    public void setArmasCadastro(Armas armasCadastro) {
        this.armasCadastro = armasCadastro;
    }

    public Armas getSelectedArmas() {
        return selectedArmas;
    }

    public void setSelectedArmas(Armas selectedArmas) {
        this.selectedArmas = selectedArmas;
    }

    public RepositorioGenerico<Armas,Integer> getRepositorioArmas() {
        return repositorioArmas;
    }

    public void setRepositorioArmas(RepositorioGenerico<Armas, Integer> repositorioArmas) {
        this.repositorioArmas= repositorioArmas;
    }

    public Armas getArmas() {
        return armas;
    }

    public void setArmas(Armas armas) {
        this.armas = armas;
    }
}
