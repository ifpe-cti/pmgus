/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.Vitima;
import java.util.List;

/**
 *
 * @author Sb Grafica
 */
public class RepositorioVitimaImplBD implements RepositorioGenerico<Vitima, Integer> {
     @Override
    public void inserir(Vitima t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Vitima t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Vitima recuperar(Integer codigo) {
       try{
           return (Vitima)PersistenceDao.getInstance().read("select a from Vitima a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Vitima t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Vitima> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Vitima a");

    }
    
}
