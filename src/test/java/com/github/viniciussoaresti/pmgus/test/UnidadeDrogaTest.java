package com.github.viniciussoaresti.pmgus.test;


import com.github.viniciussoaresti.pmgus.negocio.UnidadeDroga;
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
public class UnidadeDrogaTest {
    UnidadeDroga unidadeDroga;
    
    public UnidadeDrogaTest() {
    }

    @Before
    public void setUp() {
        unidadeDroga = new UnidadeDroga();
        unidadeDroga.setCodigo(1);
        unidadeDroga.setUnidadeDroga("a");
    }

    @Test
    public void testValidaNomeUnidadeDroga() {
        Assert.assertEquals(unidadeDroga.validaNomeUnidadeDroga(), true);
    }     
}
