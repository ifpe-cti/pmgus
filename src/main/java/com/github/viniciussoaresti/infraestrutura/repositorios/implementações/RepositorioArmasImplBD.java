/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementações;

import com.github.viniciussoaresti.dao.PersistenceDao;
import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.Armas;
import java.util.List;

/**
 *
 * @author barro
 */
public class RepositorioArmasImplBD implements RepositorioGenerico<Armas, Integer>{
     @Override
    public void inserir(Armas t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Armas t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Armas recuperar(Integer codigo) {
       try{
           return (Armas)PersistenceDao.getInstance().read("select a from Armas a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Armas t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Armas> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Armas a");

    }
    
}
