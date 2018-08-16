/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author barro
 */
@Entity
public class MedidasDrogas {
     @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 20)
    private String unidadeDroga;
    @Column(length = 20)
    private String observação;

    public MedidasDrogas() {
    }

    public MedidasDrogas(int codigo, String unidadeDroga, String observação) {
        this.codigo = codigo;
        this.unidadeDroga = unidadeDroga;
        this.observação = observação;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUnidadeDroga() {
        return unidadeDroga;
    }

    public void setUnidadeDroga(String unidadeDroga) {
        this.unidadeDroga = unidadeDroga;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }
      public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((MedidasDrogas)obj).getCodigo();
    }
    
}
