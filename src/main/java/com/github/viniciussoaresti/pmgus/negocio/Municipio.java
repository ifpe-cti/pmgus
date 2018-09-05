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
 * @author pronatec
 */
@Entity
public class Municipio {

    @Id
    @GeneratedValue
    private int codigo;
    @Column (length=20)
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Municipio() {
    }

    public Municipio(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    

}
