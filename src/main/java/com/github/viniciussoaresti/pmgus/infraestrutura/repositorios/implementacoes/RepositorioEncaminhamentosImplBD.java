/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.Encaminhamentos;
import java.util.List;

/**
 *
 * @author Sb Grafica
 */
public class RepositorioEncaminhamentosImplBD implements RepositorioGenerico<Encaminhamentos, Integer> {
     @Override
    public void inserir(Encaminhamentos t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Encaminhamentos t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Encaminhamentos recuperar(Integer codigo) {
       try{
           return (Encaminhamentos)PersistenceDao.getInstance().read("select a from Encaminhamentos a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Encaminhamentos t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Encaminhamentos> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Encaminhamentos a");

    }
}