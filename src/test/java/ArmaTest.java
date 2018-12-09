
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
  
    public ArmaTest() {
    }
    
    @Before
    public void setUp(){
     arma = new Arma();
     arma.setCodigo(1);
     arma.setTipoDeArma("Fuzil"); 
     arma.setModelo("AR15"); 
     arma.setMarca("Bolsonaro"); 
     arma.setCalibre(".50"); 
   
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

}
