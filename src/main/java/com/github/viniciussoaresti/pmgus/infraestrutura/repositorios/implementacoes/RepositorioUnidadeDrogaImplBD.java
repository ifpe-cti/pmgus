/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;
import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.UnidadeDroga;
import java.util.List;

/**
 *
 * @author 1860915
 */
public class RepositorioUnidadeDrogaImplBD implements RepositorioGenerico<UnidadeDroga, Integer>{

    @Override
    public void inserir(UnidadeDroga t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(UnidadeDroga t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public UnidadeDroga recuperar(Integer codigo) {
        try{
            return (UnidadeDroga)PersistenceDao.getInstance().read("select a from UnidadeDroga a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }
    }

    @Override
    public void deletar(UnidadeDroga t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<UnidadeDroga> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from UnidadeDroga a");
    }    
}
