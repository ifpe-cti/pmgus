/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.MedidaDroga;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BarrosPedro
 */
public class RepositorioMedidaDroga implements RepositorioGenerico<MedidaDroga, Integer> {
    private List<MedidaDroga> medidasDrogas = null;

    public RepositorioMedidaDroga() {
        this.medidasDrogas = new ArrayList<>();
    }
    @Override
    public void inserir(MedidaDroga t){
        this.medidasDrogas.add(t);
    }
    
    @Override
    public void alterar (MedidaDroga t){
        for (MedidaDroga e : this.medidasDrogas){
            if (e.getCodigo()==( t.getCodigo())){
                e.setUnidadeDroga(t.getUnidadeDroga());
                e.setObservação(t.getObservação());
               
                return;
             }
        }
    }
    
    @Override
    public MedidaDroga recuperar(Integer codigo){
        for (MedidaDroga e : this.medidasDrogas){
            if(e.getCodigo()== (codigo) ){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void deletar(MedidaDroga t){
        this.medidasDrogas.remove(t);
    }
    
    @Override
    public List<MedidaDroga> recuperarTodos(){
        return this.medidasDrogas;
    }   
}
