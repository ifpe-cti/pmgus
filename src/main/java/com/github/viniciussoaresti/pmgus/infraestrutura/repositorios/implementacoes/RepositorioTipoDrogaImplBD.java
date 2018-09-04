/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;
import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.TipoDroga;
import java.util.List;

/**
 *
 * @author 1860915
 */
public class RepositorioTipoDrogaImplBD implements RepositorioGenerico<TipoDroga, Integer>{

    @Override
    public void inserir(TipoDroga t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(TipoDroga t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public TipoDroga recuperar(Integer codigo) {
        try{
            return (TipoDroga)PersistenceDao.getInstance().read("select a from TipoDroga a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }
    }

    @Override
    public void deletar(TipoDroga t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<TipoDroga> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from TipoDroga a");
    }    
}
