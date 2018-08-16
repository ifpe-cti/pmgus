/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.Armas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BarrosPedro
 */
public class RepositorioArmas implements RepositorioGenerico<Armas, Integer> {
    private List<Armas> clientes = null;

    public RepositorioArmas() {
        this.clientes = new ArrayList<>();
    }
    @Override
    public void inserir(Armas t){
        this.clientes.add(t);
    }
    
    @Override
    public void alterar (Armas t){
        for (Armas e : this.clientes){
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
    public Armas recuperar(Integer codigo){
        for (Armas e : this.clientes){
            if(e.getCodigo()== (codigo) ){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void deletar(Armas t){
        this.clientes.remove(t);
    }
    
    @Override
    public List<Armas> recuperarTodos(){
        return this.clientes;
    }   
}
