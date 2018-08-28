/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import java.util.ArrayList;
import java.util.List;
import com.github.viniciussoaresti.negocio.Municipio;
import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;

/**
 *
 * @author pronatec
 */
public class RepositorioMunicipio implements RepositorioGenerico <Municipio, Integer>{
     private List<Municipio> municipio = null;

    public RepositorioMunicipio() {
        this.municipio = new ArrayList<>();
    }
    @Override
    public void inserir(Municipio t){
        this.municipio.add(t);
    }
    
    @Override
    public void alterar (Municipio t){
        for (Municipio e : this.municipio){
            if (e.getCodigo()==( t.getCodigo())){
                e.setNome(t.getNome());
                return;
             }
        }
    }
    
    @Override
    public Municipio recuperar(Integer codigo){
        for (Municipio e : this.municipio){
            if(e.getCodigo() == (codigo)){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void deletar(Municipio t){
        this.municipio.remove(t);
    }
    
    @Override
    public List<Municipio> recuperarTodos(){
        return this.municipio;
    }   
    
    
}
