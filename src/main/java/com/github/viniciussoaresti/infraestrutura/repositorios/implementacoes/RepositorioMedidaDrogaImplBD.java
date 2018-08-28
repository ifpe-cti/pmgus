/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.MedidaDroga;
import java.util.List;

/**
 *
 * @author barro
 */
public class RepositorioMedidaDrogaImplBD implements RepositorioGenerico<MedidaDroga, Integer>{
     @Override
    public void inserir(MedidaDroga t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(MedidaDroga t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public MedidaDroga recuperar(Integer codigo) {
       try{
           return (MedidaDroga)PersistenceDao.getInstance().read("select a from MedidaDroga a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(MedidaDroga t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<MedidaDroga> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from MedidaDroga a");

    }
    
}
