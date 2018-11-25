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
 * @author Sb Grafica
 */
@Entity
public class Vitima {
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 20)
    private String nome;
    @Column(length = 20)
    private String naturalidade;
    @Column(length = 20)
    private String nomePai;
    @Column(length = 20)
    private String nomeMae;
    @Column(length = 20)
    private int idade; 
    
    public Vitima(){
    }

    public Vitima(int codigo, String nome, String naturalidade, String nomePai, String nomeMae, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.naturalidade = naturalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.idade = idade;
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

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((Vitima)obj).getCodigo();
    }
    
}
