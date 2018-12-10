/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;

import com.github.viniciussoaresti.pmgus.negocio.Usuario;
import java.util.List;

/**
 *
 * @author veneceo
 */
public class repositorioUsuario implements RepositorioGenerico<Usuario, Integer>{
    String senha1;
    @Override
    public void inserir(Usuario t) {
        PersistenceDao.getInstance().persist(t);
    }

    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha1) {
        this.senha1 = senha1;
    }

    @Override
    public void alterar(Usuario t) {
        PersistenceDao.getInstance().update(t);
    }
    public String recuperarSenha(String senha){
        try{
            
           this.senha1=PersistenceDao.getInstance().read("select SENHA from USUARIO").get(0).toString();
           
           return senha1;
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public Usuario recuperar(Integer codigo) {
       try{
           return (Usuario)PersistenceDao.getInstance().read("select a from Arma a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Usuario t) {
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Usuario> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Arma a");

    }
}
