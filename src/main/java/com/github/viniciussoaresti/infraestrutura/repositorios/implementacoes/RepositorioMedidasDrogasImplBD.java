/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.MedidasDrogas;
import java.util.List;

/**
 *
 * @author barro
 */
public class RepositorioMedidasDrogasImplBD implements RepositorioGenerico<MedidasDrogas, Integer>{
     @Override
    public void inserir(MedidasDrogas t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(MedidasDrogas t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public MedidasDrogas recuperar(Integer codigo) {
       try{
           return (MedidasDrogas)PersistenceDao.getInstance().read("select a from MedidasDrogas a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(MedidasDrogas t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<MedidasDrogas> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from MedidasDrogas a");

    }
    
}
