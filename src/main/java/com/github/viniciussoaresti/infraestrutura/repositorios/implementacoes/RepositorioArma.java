/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.Arma;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BarrosPedro
 */
public class RepositorioArma implements RepositorioGenerico<Arma, Integer> {
    private List<Arma> armas = null;

    public RepositorioArma() {
        this.armas = new ArrayList<>();
    }
    @Override
    public void inserir(Arma t){
        this.armas.add(t);
    }
    
    @Override
    public void alterar (Arma t){
        for (Arma e : this.armas){
            if (e.getCodigo()==( t.getCodigo())){
                e.setModelo(t.getModelo());
                e.setMarca(t.getMarca());
                e.setTipoDeArma(t.getTipoDeArma());
                e.setCalibre(t.getCalibre());
                return;
             }
        }
    }
    
    @Override
    public Arma recuperar(Integer codigo){
        for (Arma e : this.armas){
            if(e.getCodigo()== (codigo) ){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void deletar(Arma t){
        this.armas.remove(t);
    }
    
    @Override
    public List<Arma> recuperarTodos(){
        return this.armas;
    }   
}
