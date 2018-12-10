package com.github.viniciussoaresti.pmgus.test;


import com.github.viniciussoaresti.pmgus.negocio.Endereco;
import com.github.viniciussoaresti.pmgus.negocio.Municipio;
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
public class EnderecoTest {

    Endereco endereco;
    Municipio municipio;

    public EnderecoTest() {
    }

    @Before
    public void setUp() {
        endereco = new Endereco();
        municipio = new Municipio();
        endereco.setCodigo(1);
        endereco.setBairro("a"); 
        endereco.setMunicipio(municipio);
        
       
    }
  
  @Test
    public void testValidaMunicipio() {
        Assert.assertEquals(endereco.validaMunicipo(), true);
    }
    
    @Test
    public void testValidaBairro() {
        Assert.assertEquals(endereco.validaBairro(), true);
    }
}
