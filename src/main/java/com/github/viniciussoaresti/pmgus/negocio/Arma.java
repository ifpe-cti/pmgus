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
public class Arma {
   @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 20)
    private String tipoDeArma;
    @Column(length = 20)
    private String modelo;
    @Column(length = 20)
    private String marca;
    @Column(length = 10)
    private int calibre;
   

    public Arma() {
    }

    public Arma(int codigo, String tipoDeArma, String modelo, String marca, int calibre) {
        this.codigo = codigo;
        this.tipoDeArma = tipoDeArma;
        this.modelo = modelo;
        this.marca = marca;
        this.calibre = calibre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoDeArma() {
        return tipoDeArma;
    }

    public void setTipoDeArma(String tipoDeArma) {
        this.tipoDeArma = tipoDeArma;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }
    
    public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((Arma)obj).getCodigo();
    }
    
}
