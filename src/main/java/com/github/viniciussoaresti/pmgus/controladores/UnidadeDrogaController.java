/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;

import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioUnidadeDrogaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.UnidadeDroga;
import java.io.Serializable;
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
public class UnidadeDrogaController implements Serializable{
    
    private RepositorioGenerico<UnidadeDroga,Integer> repositorioUnidadeDroga = null;
    private UnidadeDroga unidadeDrogaCadastro;
    private UnidadeDroga selectedUnidadeDroga;

    public void setRepositorioUnidadeDroga(RepositorioGenerico<UnidadeDroga, Integer> repositorioUnidadeDroga) {
        this.repositorioUnidadeDroga = repositorioUnidadeDroga;
    }

    public RepositorioGenerico<UnidadeDroga, Integer> getRepositorioUnidadeDroga() {
        return repositorioUnidadeDroga;
    }    
    
    public UnidadeDrogaController(){
        this.repositorioUnidadeDroga = new RepositorioUnidadeDrogaImplBD();
        this.unidadeDrogaCadastro = new UnidadeDroga();
        
    }
    
     public void inserir(){
        //String nome =((String)((HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("unidade de drogaController"));        
        this.repositorioUnidadeDroga.inserir(this.unidadeDrogaCadastro);
        this.unidadeDrogaCadastro = new UnidadeDroga();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","A unidade de droga foi cadastrada com sucesso!"));
    }

   public void alterar(UnidadeDroga c){
        this.repositorioUnidadeDroga.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","A unidade de droga foi alterada com sucesso!"));
    }
    
    public UnidadeDroga recuperarUnidadeDroga(Integer codigo){
        return this.repositorioUnidadeDroga.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioUnidadeDroga.deletar(selectedUnidadeDroga);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","A unidade de droga foi deletada com sucesso!"));
    }
    
    public List<UnidadeDroga> recuperarTodosUnidadeDroga(){
        return this.repositorioUnidadeDroga.recuperarTodos();
    }

    public UnidadeDroga getUnidadeDrogaCadastro() {
        return unidadeDrogaCadastro;
    }

    public void setUnidadeDrogaCadastro(UnidadeDroga unidadeDrogaCadastro) {
        this.unidadeDrogaCadastro = unidadeDrogaCadastro;
    }

    public UnidadeDroga getSelectedUnidadeDroga() {
        return selectedUnidadeDroga;
    }

    public void setSelectedUnidadeDroga(UnidadeDroga selectedUnidadeDroga) {
        this.selectedUnidadeDroga = selectedUnidadeDroga;
    }

}