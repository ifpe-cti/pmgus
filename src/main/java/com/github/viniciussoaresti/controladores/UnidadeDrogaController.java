/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.controladores;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes.RepositorioUnidadeDrogaImplBD;
import com.github.viniciussoaresti.negocio.UnidadeDroga;
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
public class UnidadeDrogaController {
     private RepositorioGenerico<UnidadeDroga,Integer> repositorioUnidadeDroga = null;
    private UnidadeDroga unidadeDrogaCadastro;
    private UnidadeDroga selectedUnidadeDroga;
   
    UnidadeDroga unidadeDroga = new UnidadeDroga();
    
    public UnidadeDrogaController(){
        this.repositorioUnidadeDroga = new RepositorioUnidadeDrogaImplBD();
        this.unidadeDrogaCadastro = new UnidadeDroga();
    }
    
    public void inserir(){
        
        this.repositorioUnidadeDroga.inserir(this.unidadeDrogaCadastro);
        this.unidadeDrogaCadastro = new UnidadeDroga();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A Unidade de Droga foi cadastrada com sucesso!"));
    }
    
    public void alterar(UnidadeDroga c){
        this.repositorioUnidadeDroga.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A Unidade de Droga foi alterada com sucesso!"));
    }
    
    public UnidadeDroga recuperarMedidaDroga(int codigo){
        return this.repositorioUnidadeDroga.recuperar(codigo);
    }
    
    public void deletar(UnidadeDroga c){
        this.repositorioUnidadeDroga.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A Unidade de Droga foi deletada com sucesso!"));
    }
    
    public List<UnidadeDroga> recuperarTodosMedidaDrogas(){
        return this.repositorioUnidadeDroga.recuperarTodos();
    }

    public UnidadeDroga getMedidaDrogaCadastro() {
        return unidadeDrogaCadastro;
    }

    public void setMedidaDrogaCadastro(UnidadeDroga medidaDrogaCadastro) {
        this.unidadeDrogaCadastro = medidaDrogaCadastro;
    }

    public UnidadeDroga getSelectedMedidaDroga() {
        return selectedUnidadeDroga;
    }

    public void setSelectedMedidaDroga(UnidadeDroga selectedMedidaDroga) {
        this.selectedUnidadeDroga = selectedMedidaDroga;
    }

    public RepositorioGenerico<UnidadeDroga,Integer> getRepositorioMedidaDroga() {
        return repositorioUnidadeDroga;
    }

    public void setRepositorioMedidaDroga(RepositorioGenerico<UnidadeDroga, Integer> repositorioMedidaDroga) {
        this.repositorioUnidadeDroga= repositorioMedidaDroga;
    }

    public UnidadeDroga getMedidaDroga() {
        return unidadeDroga;
    }

    public void setMedidaDroga(UnidadeDroga medidaDroga) {
        this.unidadeDroga = medidaDroga;
    }
}
