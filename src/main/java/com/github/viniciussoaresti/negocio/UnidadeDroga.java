package com.github.viniciussoaresti.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author viniciussoaresti
 */
@Entity
public class UnidadeDroga {
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 20)
    private String nome;
    
    public UnidadeDroga(){}
    public UnidadeDroga(int codigo, String nome) {
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
}
