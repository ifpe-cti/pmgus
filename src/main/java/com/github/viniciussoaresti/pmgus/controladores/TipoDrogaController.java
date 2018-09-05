/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;

import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioTipoDrogaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.TipoDroga;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author 1860915
 */

@ManagedBean
@SessionScoped
public class TipoDrogaController {
    
    private RepositorioGenerico<TipoDroga,Integer> repositorioTipoDroga = null;
    private TipoDroga tipoDrogaCadastro;
    private TipoDroga selectedTipoDroga;

    public void setRepositorioTipoDroga(RepositorioGenerico<TipoDroga, Integer> repositorioTipoDroga) {
        this.repositorioTipoDroga = repositorioTipoDroga;
    }

    public RepositorioGenerico<TipoDroga, Integer> getRepositorioTipoDroga() {
        return repositorioTipoDroga;
    }    
    
    public TipoDrogaController(){
        this.repositorioTipoDroga = new RepositorioTipoDrogaImplBD();
        this.tipoDrogaCadastro = new TipoDroga();
        
    }
    
     public void inserir(){
        //String nome =((String)((HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("tipo de drogaController"));        
        this.repositorioTipoDroga.inserir(this.tipoDrogaCadastro);
        this.tipoDrogaCadastro = new TipoDroga();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","o tipo de droga foi cadastrado com sucesso!"));
    }

   public void alterar(TipoDroga c){
        this.repositorioTipoDroga.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","o tipo de droga foi alterado com sucesso!"));
    }
    
    public TipoDroga recuperarTipoDroga(Integer codigo){
        return this.repositorioTipoDroga.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioTipoDroga.deletar(selectedTipoDroga);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","o tipo de droga foi deletado com sucesso!"));
    }
    
    public List<TipoDroga> recuperarTodosTipoDroga(){
        return this.repositorioTipoDroga.recuperarTodos();
    }

    public TipoDroga getTipoDrogaCadastro() {
        return tipoDrogaCadastro;
    }

    public void setTipoDrogaCadastro(TipoDroga clienteCadastro) {
        this.tipoDrogaCadastro = clienteCadastro;
    }

    public TipoDroga getSelectedTipoDroga() {
        return selectedTipoDroga;
    }

    public void setSelectedTipoDroga(TipoDroga selectedCliente) {
        this.selectedTipoDroga = selectedCliente;
    }
}