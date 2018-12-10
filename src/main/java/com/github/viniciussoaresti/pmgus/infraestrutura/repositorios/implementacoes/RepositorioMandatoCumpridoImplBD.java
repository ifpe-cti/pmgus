/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.MandatoCumprido;
import java.util.List;

/**
 *
 * @author Sb Grafica
 */
public class RepositorioMandatoCumpridoImplBD implements RepositorioGenerico<MandatoCumprido, Integer> {
     @Override
    public void inserir(MandatoCumprido t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(MandatoCumprido t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public MandatoCumprido recuperar(Integer codigo) {
       try{
           return (MandatoCumprido)PersistenceDao.getInstance().read("select a from MandatoCumprido a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(MandatoCumprido t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<MandatoCumprido> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from MandatoCumprido a");

    }
}