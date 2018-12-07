/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.negocio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Sb Grafica
 */
@Entity
public class MandatoCumprido {
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 10)
    private int qtdeMandatos;
    @Column(name = "DATA_ENCAMINHAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataMandato;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdeMandatos() {
        return qtdeMandatos;
    }

    public void setQtdeMandatos(int qtdeMandatos) {
        this.qtdeMandatos = qtdeMandatos;
    }

    public Date getDataMandato() {
        return dataMandato;
    }

    public void setDataMandato(Date dataMandato) {
        this.dataMandato = dataMandato;
    }

    public MandatoCumprido() {
    }

    public MandatoCumprido(int codigo, int qtdeMandatos, Date dataMandato) {
        this.codigo = codigo;
        this.qtdeMandatos = qtdeMandatos;
        this.dataMandato = dataMandato;
    }
    
     public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((MandatoCumprido)obj).getCodigo();
    }
}
