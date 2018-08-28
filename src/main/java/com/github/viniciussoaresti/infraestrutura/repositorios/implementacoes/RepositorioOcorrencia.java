/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.Municipio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.github.viniciussoaresti.negocio.Ocorrencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pronatec
 */

public class RepositorioOcorrencia implements RepositorioGenerico<Ocorrencia, Integer>{
    
    private List<Ocorrencia> ocorrencia = null;

    public RepositorioOcorrencia() {
        this.ocorrencia = new ArrayList<>();
    }
    @Override
    public void inserir(Ocorrencia t){
        this.ocorrencia.add(t);
    }
    
    @Override
    public void alterar (Ocorrencia t){
        for (Ocorrencia e : this.ocorrencia){
            if (e.getCodigo()==( t.getCodigo())){
                
                return;
             }
        }
    }
    
    @Override
    public Ocorrencia recuperar(Integer codigo){
        for (Ocorrencia e : this.ocorrencia){
            if(e.getCodigo() == (codigo)){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void deletar(Ocorrencia t){
        this.ocorrencia.remove(t);
    }
    
    @Override
    public List<Ocorrencia> recuperarTodos(){
        return this.ocorrencia;
    }   
    
   
    
    
    
    
    
}
