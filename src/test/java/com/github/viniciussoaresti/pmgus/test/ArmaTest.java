package com.github.viniciussoaresti.pmgus.test;


import com.github.viniciussoaresti.pmgus.controladores.ArmaController;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioArmaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Arma;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sb Grafica
 */
public class ArmaTest {
    Arma arma;
    Arma arma2;
    ArmaController armaController;
    RepositorioArmaImplBD repositorio;
    public ArmaTest() {
    }
    
    @Before
    public void setUp(){
     arma = new Arma();
     arma.setCodigo(982);
     arma.setTipoDeArma("a"); 
     arma.setModelo("a"); 
     arma.setMarca("a"); 
     arma.setCalibre("a"); 
     repositorio = new RepositorioArmaImplBD();
     
     arma2 = new Arma();
     arma2.setCodigo(111);
     arma2.setTipoDeArma("a"); 
     arma2.setModelo("a"); 
     arma2.setMarca("a"); 
     arma2.setCalibre("a"); 
     
    }
    
    @Test
    public void testValidaTipoDeArma() {
        Assert.assertEquals(arma.validaTipoDeArma(), true);
    }
    @Test
    public void testValidaModelo() {
        Assert.assertEquals(arma.validaModelo(), true);
    }
    @Test
    public void testValidaMarca() {
        Assert.assertEquals(arma.validaMarca(), true);
    }
    @Test
    public void testValidaCalibre() {
        Assert.assertEquals(arma.validaCalibre(), true);
    }
    @Test
    public void inserirArma(){
     repositorio.inserir(arma);
     Assert.assertEquals(arma , repositorio.recuperar(arma.getCodigo()));
     
    }
    @Test
    public void deletarArma(){
        repositorio.inserir(arma2);
        repositorio.deletar(arma2);
        Assert.assertEquals(null, repositorio.recuperar(arma2.getCodigo()));
    }     
}
