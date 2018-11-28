/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;


import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioEnderecoImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Endereco;
import java.io.Serializable;
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
public class EnderecoController{
    private RepositorioGenerico<Endereco,Integer> repositorioEndereco = null;
    private Endereco enderecoCadastro;
    private Endereco selectedEndereco;
   
    Endereco endereco = new Endereco();
    
    public EnderecoController(){
        this.repositorioEndereco = new RepositorioEnderecoImplBD();
        this.enderecoCadastro = new Endereco();
    }
    
    public void inserir(){
        
        this.repositorioEndereco.inserir(this.enderecoCadastro);
        this.enderecoCadastro = new Endereco();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O endereco foi cadastrado com sucesso!"));
    }
    
    public void alterar(Endereco c){
        this.repositorioEndereco.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O endereco foi alterado com sucesso!"));
    }
    
    public Endereco recuperarEndereco(int codigo){
        return this.repositorioEndereco.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioEndereco.deletar(selectedEndereco);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O endereco foi deletado com sucesso!"));
    }
    
    public List<Endereco> recuperarTodosEnderecos(){
        return this.repositorioEndereco.recuperarTodos();
    }

    public Endereco getEnderecoCadastro() {
        return enderecoCadastro;
    }

    public void setEnderecoCadastro(Endereco enderecoCadastro) {
        this.enderecoCadastro = enderecoCadastro;
    }

    public Endereco getSelectedEndereco() {
        return selectedEndereco;
    }

    public void setSelectedEndereco(Endereco selectedEndereco) {
        this.selectedEndereco = selectedEndereco;
    }

    public RepositorioGenerico<Endereco,Integer> getRepositorioEndereco() {
        return repositorioEndereco;
    }

    public void setRepositorioEndereco(RepositorioGenerico<Endereco, Integer> repositorioEndereco) {
        this.repositorioEndereco= repositorioEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
