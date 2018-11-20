/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;

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
   
    private boolean usrLogado = false;

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
        if(login.equals("9bpm") && senha.equals("3secao")){
            usrLogado = true; 
        return "tipoDroga.xhtml"; 
    }
        return null;
    }
    
    
}
