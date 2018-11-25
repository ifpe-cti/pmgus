/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;


import com.github.viniciussoaresti.pmgus.criptografia.LoginCriptografia;
import com.github.viniciussoaresti.pmgus.negocio.Usuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
/**
 *
 * @author Pichau
 */
@ManagedBean
@RequestScoped
public class LoginController {
    private String login;
    private String senha;
    private String senhaCripto;
  
    private Usuario usuarioLogado;
    
    private boolean usrLogado = false;

    public LoginController(String login, String senha, Usuario usuarioLogado) {
        this.login = login;
        this.senha = senha;
        this.usuarioLogado = usuarioLogado;
       
    }

    public LoginController() {
    }

   public String cripSenha(String senha){
       senhaCripto=LoginCriptografia.criptografar(senha);
       return logar();
         }

    

    

    public boolean isUsrLogado() {
        return usrLogado;
    }

    public void setUsrLogado(boolean usrLogado) {
        this.usrLogado = usrLogado;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String logar(){
        if(login.equals("9bpm") && senhaCripto.equals("5cfc42d4c71557cd294522c6b66d91f1".toUpperCase())){
            usrLogado = true; 
             FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","Usuário logado com sucesso!"));
        return "menu.xhtml";    
    }else{
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Atenção!","Login ou senha, incorretos!"));
        return null; 
        }
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
   
    
    
    
}
