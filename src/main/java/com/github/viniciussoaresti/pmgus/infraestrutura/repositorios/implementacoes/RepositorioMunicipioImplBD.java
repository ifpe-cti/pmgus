/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.Municipio;
import java.util.List;

/**
 *
 * @author Sb Grafica
 */
public class RepositorioMunicipioImplBD implements RepositorioGenerico<Municipio, Integer> {
     @Override
    public void inserir(Municipio t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Municipio t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Municipio recuperar(Integer codigo) {
       try{
           return (Municipio)PersistenceDao.getInstance().read("select a from Municipio a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Municipio t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Municipio> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Municipio a");

    }
}