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
import javax.persistence.ManyToOne;
import org.primefaces.model.map.LatLng;

/**
 *
 * @author Sb Grafica
 */
@Entity
public class Endereco {

    @Id
    @GeneratedValue
    private int codigo;
    @ManyToOne
    private Municipio municipio;
    @Column(length = 30)
    private String bairro;

    public Endereco() {
    }

    public Endereco(Municipio municipio) {
        this.municipio = municipio;
    }

    public Endereco(int codigo, Municipio municipio, String bairro) {
        this.codigo = codigo;
        this.municipio = municipio;
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

    public boolean validaMunicipo() {
        if (this.municipio == null) {
            return false;
        }
        return true;
    }

    public boolean validaBairro() {
        if (this.bairro.length() > 30 || this.bairro == null || this.bairro.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
