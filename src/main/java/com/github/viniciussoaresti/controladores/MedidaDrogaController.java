/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.controladores;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes.RepositorioMedidaDrogaImplBD;
import com.github.viniciussoaresti.negocio.MedidaDroga;
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
public class MedidaDrogaController {
     private RepositorioGenerico<MedidaDroga,Integer> repositorioMedidaDroga = null;
    private MedidaDroga medidaDrogaCadastro;
    private MedidaDroga selectedMedidaDroga;
   
    MedidaDroga medidaDroga = new MedidaDroga();
    
    public MedidaDrogaController(){
        this.repositorioMedidaDroga = new RepositorioMedidaDrogaImplBD();
        this.medidaDrogaCadastro = new MedidaDroga();
    }
    
    public void inserir(){
        
        this.repositorioMedidaDroga.inserir(this.medidaDrogaCadastro);
        this.medidaDrogaCadastro = new MedidaDroga();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A medidaDroga foi cadastrada com sucesso!"));
    }
    
    public void alterar(MedidaDroga c){
        this.repositorioMedidaDroga.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A medidaDroga foi alterada com sucesso!"));
    }
    
    public MedidaDroga recuperarMedidaDroga(int codigo){
        return this.repositorioMedidaDroga.recuperar(codigo);
    }
    
    public void deletar(MedidaDroga c){
        this.repositorioMedidaDroga.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A medidaDroga foi deletada com sucesso!"));
    }
    
    public List<MedidaDroga> recuperarTodosMedidaDrogas(){
        return this.repositorioMedidaDroga.recuperarTodos();
    }

    public MedidaDroga getMedidaDrogaCadastro() {
        return medidaDrogaCadastro;
    }

    public void setMedidaDrogaCadastro(MedidaDroga medidaDrogaCadastro) {
        this.medidaDrogaCadastro = medidaDrogaCadastro;
    }

    public MedidaDroga getSelectedMedidaDroga() {
        return selectedMedidaDroga;
    }

    public void setSelectedMedidaDroga(MedidaDroga selectedMedidaDroga) {
        this.selectedMedidaDroga = selectedMedidaDroga;
    }

    public RepositorioGenerico<MedidaDroga,Integer> getRepositorioMedidaDroga() {
        return repositorioMedidaDroga;
    }

    public void setRepositorioMedidaDroga(RepositorioGenerico<MedidaDroga, Integer> repositorioMedidaDroga) {
        this.repositorioMedidaDroga= repositorioMedidaDroga;
    }

    public MedidaDroga getMedidaDroga() {
        return medidaDroga;
    }

    public void setMedidaDroga(MedidaDroga medidaDroga) {
        this.medidaDroga = medidaDroga;
    }
}
