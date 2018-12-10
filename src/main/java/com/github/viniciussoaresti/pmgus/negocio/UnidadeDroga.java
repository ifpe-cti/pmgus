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
public class UnidadeDroga {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 20)
    private String unidadeDroga;

    public UnidadeDroga() {
    }

    public UnidadeDroga(int codigo, String unidadeDroga) {
        this.codigo = codigo;
        this.unidadeDroga = unidadeDroga;

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

    public boolean equals(UnidadeDroga u) {
        if (u == null) {
            return false;
        }
        return this.getUnidadeDroga().equals(u.getUnidadeDroga());
    }

    public boolean validaNomeUnidadeDroga() {
        if (this.unidadeDroga.length() > 20 || this.unidadeDroga == null || this.unidadeDroga.trim().isEmpty()) {
            return false;
        }
        return true;
    }

}
