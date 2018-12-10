package com.github.viniciussoaresti.pmgus.test;


import com.github.viniciussoaresti.pmgus.negocio.Encaminhamentos;
import java.time.Instant;
import java.util.Date;
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
public class EncaminhamentosTest {

    Encaminhamentos encaminhamentos;

    public EncaminhamentosTest() {
    }

    @Before
    public void setUp() {
        encaminhamentos = new Encaminhamentos();
        encaminhamentos.setCodigo(1);
        encaminhamentos.setQtdeEncaminhamentos(0);
    }

    @Test
    public void testValidaQtdeEncaminhamentos() {
        Assert.assertEquals(encaminhamentos.validaQtdeEncaminhamentos(), true);
    }

    //falta @test validaDate
    
}
