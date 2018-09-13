/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;


import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.Arma;
import java.util.List;
/**
 *
 * @author pronatec
 */
public class RepositorioArmaImplBD implements RepositorioGenerico<Arma, Integer> {
     @Override
    public void inserir(Arma t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Arma t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Arma recuperar(Integer codigo) {
       try{
           return (Arma)PersistenceDao.getInstance().read("select a from Arma a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Arma t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Arma> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Arma a");

    }
}
