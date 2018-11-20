/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.Endereco;
import java.util.List;

/**
 *
 * @author Sb Grafica
 */
public class RepositorioEnderecoImplBD implements RepositorioGenerico<Endereco, Integer> {
     @Override
    public void inserir(Endereco t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Endereco t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Endereco recuperar(Integer codigo) {
       try{
           return (Endereco)PersistenceDao.getInstance().read("select a from Endereco a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Endereco t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Endereco> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Endereco a");

    }
}