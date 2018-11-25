/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.negocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Sb Grafica
 */
@Entity
public class Endereco implements Serializable{
    @Id
    @GeneratedValue
    private int codigo;
    @ManyToOne
    private Municipio municipio;
    @Column(length = 20)
    private String rua;
    @Column(length = 20)
    private String cep;
    @Column(length = 20)
    private int numero;
    @Column(length = 20)
    private String bairro;
    
    public Endereco(){
    }

    public Endereco(Municipio municipio) {
        this.municipio = municipio;
    }
    
    public Endereco(int codigo, Municipio municipio, String rua, String cep, int numero, String bairro) {
        this.codigo = codigo;
        this.municipio = municipio;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
      public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((Endereco)obj).getCodigo();
    }
    
}
