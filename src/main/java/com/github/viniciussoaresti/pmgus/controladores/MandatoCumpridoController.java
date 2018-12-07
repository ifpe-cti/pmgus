/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;


import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioMandatoCumpridoImplBD;
import com.github.viniciussoaresti.pmgus.negocio.MandatoCumprido;
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
public class MandatoCumpridoController{
    private RepositorioGenerico<MandatoCumprido,Integer> repositorioMandatoCumprido = null;
    private MandatoCumprido mandatoCumpridoCadastro;
    private MandatoCumprido selectedMandatoCumprido;
   
    MandatoCumprido mandatoCumprido = new MandatoCumprido();
    
    public MandatoCumpridoController(){
        this.repositorioMandatoCumprido = new RepositorioMandatoCumpridoImplBD();
        this.mandatoCumpridoCadastro = new MandatoCumprido();
    }
    public void inserir(){
        this.repositorioMandatoCumprido.inserir(this.mandatoCumpridoCadastro);
        this.mandatoCumpridoCadastro = new MandatoCumprido();
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O mandato foi cadastrado com sucesso!"));
    }
    public void alterar(MandatoCumprido c){
        this.repositorioMandatoCumprido.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O mandato foi alterado com sucesso!"));
    }
    
    public MandatoCumprido recuperarMandatoCumprido(int codigo){
        return this.repositorioMandatoCumprido.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioMandatoCumprido.deletar(selectedMandatoCumprido);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O mandato foi deletado com sucesso!"));
    }
    
    public List<MandatoCumprido> recuperarTodosMandatoCumprido(){
        return this.repositorioMandatoCumprido.recuperarTodos();
    }

    public MandatoCumprido getMandatoCumpridoCadastro() {
        return mandatoCumpridoCadastro;
    }

    public void setMandatoCumpridoCadastro(MandatoCumprido mandatoCumpridoCadastro) {
        this.mandatoCumpridoCadastro = mandatoCumpridoCadastro;
    }

    public MandatoCumprido getSelectedMandatoCumprido() {
        return selectedMandatoCumprido;
    }

    public void setSelectedMandatoCumprido(MandatoCumprido selectedMandatoCumprido) {
        this.selectedMandatoCumprido = selectedMandatoCumprido;
    }

    public RepositorioGenerico<MandatoCumprido,Integer> getRepositorioMandatoCumprido() {
        return repositorioMandatoCumprido;
    }

    public void setRepositorioMandatoCumprido(RepositorioGenerico<MandatoCumprido, Integer> repositorioMandatoCumprido) {
        this.repositorioMandatoCumprido= repositorioMandatoCumprido;
    }

    public MandatoCumprido getMandatoCumprido() {
        return mandatoCumprido;
    }

    public void setMandatoCumprido(MandatoCumprido mandatoCumprido) {
        this.mandatoCumprido = mandatoCumprido;
    }
}
