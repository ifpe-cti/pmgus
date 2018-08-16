/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.MedidasDrogas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BarrosPedro
 */
public class RepositorioMedidasDrogas implements RepositorioGenerico<MedidasDrogas, Integer> {
    private List<MedidasDrogas> clientes = null;

    public RepositorioMedidasDrogas() {
        this.clientes = new ArrayList<>();
    }
    @Override
    public void inserir(MedidasDrogas t){
        this.clientes.add(t);
    }
    
    @Override
    public void alterar (MedidasDrogas t){
        for (MedidasDrogas e : this.clientes){
            if (e.getCodigo()==( t.getCodigo())){
                e.setUnidadeDroga(t.getUnidadeDroga());
                e.setObservação(t.getObservação());
               
                return;
             }
        }
    }
    
    @Override
    public MedidasDrogas recuperar(Integer codigo){
        for (MedidasDrogas e : this.clientes){
            if(e.getCodigo()== (codigo) ){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void deletar(MedidasDrogas t){
        this.clientes.remove(t);
    }
    
    @Override
    public List<MedidasDrogas> recuperarTodos(){
        return this.clientes;
    }   
}
