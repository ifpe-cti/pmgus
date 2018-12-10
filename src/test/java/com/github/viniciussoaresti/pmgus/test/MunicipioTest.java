package com.github.viniciussoaresti.pmgus.test;


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
public class MunicipioTest {
    Municipio municipio;

    public MunicipioTest() {
    }

    @Before
    public void setUp() {
        municipio = new Municipio();
        municipio.setCodigo(1);
        municipio.setNome("a");
    }

    @Test
    public void testValidaNomeMunicipio() {
        Assert.assertEquals(municipio.validaNomeMunicipio(), true);
    }

}
