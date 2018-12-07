/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;


import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioEncaminhamentosImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Encaminhamentos;
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
public class EncaminhamentosController{
    private RepositorioGenerico<Encaminhamentos,Integer> repositorioEncaminhamentos = null;
    private Encaminhamentos encaminhamentosCadastro;
    private Encaminhamentos selectedEncaminhamentos;
   
    Encaminhamentos encaminhamentos = new Encaminhamentos();
    
    public EncaminhamentosController(){
        this.repositorioEncaminhamentos = new RepositorioEncaminhamentosImplBD();
        this.encaminhamentosCadastro = new Encaminhamentos();
    }
    public void inserir(){
        this.repositorioEncaminhamentos.inserir(this.encaminhamentosCadastro);
        this.encaminhamentosCadastro = new Encaminhamentos();
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O encaminhamento foi cadastrado com sucesso!"));
    }
    public void alterar(Encaminhamentos c){
        this.repositorioEncaminhamentos.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O encaminhamento foi alterado com sucesso!"));
    }
    
    public Encaminhamentos recuperarEncaminhamentos(int codigo){
        return this.repositorioEncaminhamentos.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioEncaminhamentos.deletar(selectedEncaminhamentos);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O encaminhamento foi deletado com sucesso!"));
    }
    
    public List<Encaminhamentos> recuperarTodosEncaminhamentos(){
        return this.repositorioEncaminhamentos.recuperarTodos();
    }

    public Encaminhamentos getEncaminhamentosCadastro() {
        return encaminhamentosCadastro;
    }

    public void setEncaminhamentosCadastro(Encaminhamentos encaminhamentosCadastro) {
        this.encaminhamentosCadastro = encaminhamentosCadastro;
    }

    public Encaminhamentos getSelectedEncaminhamentos() {
        return selectedEncaminhamentos;
    }

    public void setSelectedEncaminhamentos(Encaminhamentos selectedEncaminhamentos) {
        this.selectedEncaminhamentos = selectedEncaminhamentos;
    }

    public RepositorioGenerico<Encaminhamentos,Integer> getRepositorioEncaminhamentos() {
        return repositorioEncaminhamentos;
    }

    public void setRepositorioEncaminhamentos(RepositorioGenerico<Encaminhamentos, Integer> repositorioEncaminhamentos) {
        this.repositorioEncaminhamentos= repositorioEncaminhamentos;
    }

    public Encaminhamentos getEncaminhamentos() {
        return encaminhamentos;
    }

    public void setEncaminhamentos(Encaminhamentos encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
    }
}
