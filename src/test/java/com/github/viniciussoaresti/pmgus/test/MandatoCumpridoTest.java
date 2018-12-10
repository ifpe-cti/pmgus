package com.github.viniciussoaresti.pmgus.test;


import com.github.viniciussoaresti.pmgus.negocio.MandatoCumprido;
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
public class MandatoCumpridoTest {
    MandatoCumprido mandatoCumprido;

    public MandatoCumpridoTest() {
    }

    @Before
    public void setUp() {
        mandatoCumprido = new MandatoCumprido();
        mandatoCumprido.setCodigo(1);
        mandatoCumprido.setQtdeMandatos(0);
    }

    @Test
    public void testValidaQtdeMandatoCumprido() {
        Assert.assertEquals(mandatoCumprido.validaQtdeMandatos(), true);
    }

    //falta @test validaDate
}
