/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.negocio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
        

/**
 *
 * @author Sb Grafica
 */
@Entity
public class Encaminhamentos {
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 10)
    private int qtdeEncaminhamentos;
    @Column(name = "DATA_ENCAMINHAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEncaminhamento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdeEncaminhamentos() {
        return qtdeEncaminhamentos;
    }

    public void setQtdeEncaminhamentos(int qtdeEncaminhamentos) {
        this.qtdeEncaminhamentos = qtdeEncaminhamentos;
    }

    public Date getDataEncaminhamento() {
        return dataEncaminhamento;
    }

    public void setDataEncaminhamento(Date dataEncaminhamento) {
        this.dataEncaminhamento = dataEncaminhamento;
    }

    public Encaminhamentos() {
    }

    public Encaminhamentos(int codigo, int qtdeEncaminhamentos, Date dataEncaminhamento) {
        this.codigo = codigo;
        this.qtdeEncaminhamentos = qtdeEncaminhamentos;
        this.dataEncaminhamento = dataEncaminhamento;
    }
    
    public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((Encaminhamentos)obj).getCodigo();
    }
}
