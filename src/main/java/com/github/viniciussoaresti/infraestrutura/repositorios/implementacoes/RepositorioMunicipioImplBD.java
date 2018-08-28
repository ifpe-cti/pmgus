/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.dao.PersistenceDao;

import com.github.viniciussoaresti.negocio.Municipio;
import java.util.List;

/**
 *
 * @author pronatec
 */
public class RepositorioMunicipioImplBD {
    public void inserir(Municipio t) {
        PersistenceDao.getInstance().persist(t);
    }

    public void alterar(Municipio t) {
        PersistenceDao.getInstance().update(t);
    }

    public Municipio recuperar(Integer codigo) {
       try{
           return (Municipio)PersistenceDao.getInstance().read("select a from Municipio a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    public void deletar(Municipio t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    public List<Municipio> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Municipio a");

    }
    
}
