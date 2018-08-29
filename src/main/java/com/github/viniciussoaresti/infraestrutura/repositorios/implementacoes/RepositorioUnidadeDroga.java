/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.UnidadeDroga;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BarrosPedro
 */
public class RepositorioUnidadeDroga implements RepositorioGenerico<UnidadeDroga, Integer> {
    private List<UnidadeDroga> unidadesDroga = null;

    public RepositorioUnidadeDroga() {
        this.unidadesDroga = new ArrayList<>();
    }
    @Override
    public void inserir(UnidadeDroga t){
        this.unidadesDroga.add(t);
    }
    
    @Override
    public void alterar (UnidadeDroga t){
        for (UnidadeDroga e : this.unidadesDroga){
            if (e.getCodigo()==( t.getCodigo())){
               e.setCodigo(t.getCodigo());
               e.setNome(t.getNome());
                return;
             }
        }
    }
    
    @Override
    public UnidadeDroga recuperar(Integer codigo){
        for (UnidadeDroga e : this.unidadesDroga){
            if(e.getCodigo()== (codigo) ){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void deletar(UnidadeDroga t){
        this.unidadesDroga.remove(t);
    }
    
    @Override
    public List<UnidadeDroga> recuperarTodos(){
        return this.unidadesDroga;
    }   
}
