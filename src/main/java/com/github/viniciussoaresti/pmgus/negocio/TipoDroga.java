/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author viniciussoaresti
 */
@Entity
public class TipoDroga {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 20)
    private String nome;

    public TipoDroga() {
    }

    public TipoDroga(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((TipoDroga)obj).getCodigo();
    }

    public boolean validaNomeTipoDroga() {
        if (this.nome.length() > 20 || this.nome == null || this.nome.trim().isEmpty()) {
            return false;
        }
        return true;
    }

}
