/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;


import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioArmaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Arma;
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
public class ArmaController{
    private RepositorioGenerico<Arma,Integer> repositorioArma = null;
    private Arma armaCadastro;
    private Arma selectedArma;
   
    Arma arma = new Arma();
    
    public ArmaController(){
        this.repositorioArma = new RepositorioArmaImplBD();
        this.armaCadastro = new Arma();
    }
    public void inserir(){
        this.repositorioArma.inserir(this.armaCadastro);
        this.armaCadastro = new Arma();
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A arma foi cadastrada com sucesso!"));
    }
    public void alterar(Arma c){
        this.repositorioArma.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A arma foi alterada com sucesso!"));
    }
    
    public Arma recuperarArma(int codigo){
        return this.repositorioArma.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioArma.deletar(selectedArma);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A arma foi deletada com sucesso!"));
    }
    
    public List<Arma> recuperarTodosArmas(){
        return this.repositorioArma.recuperarTodos();
    }

    public Arma getArmaCadastro() {
        return armaCadastro;
    }

    public void setArmaCadastro(Arma armaCadastro) {
        this.armaCadastro = armaCadastro;
    }

    public Arma getSelectedArma() {
        return selectedArma;
    }

    public void setSelectedArma(Arma selectedArma) {
        this.selectedArma = selectedArma;
    }

    public RepositorioGenerico<Arma,Integer> getRepositorioArma() {
        return repositorioArma;
    }

    public void setRepositorioArma(RepositorioGenerico<Arma, Integer> repositorioArma) {
        this.repositorioArma= repositorioArma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
