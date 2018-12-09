
import com.github.viniciussoaresti.pmgus.negocio.TipoDroga;
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
public class TipoDrogaTest {
    TipoDroga tipoDroga;
    public TipoDrogaTest() {
    }

    @Before
    public void setUp() {
        tipoDroga = new TipoDroga();
        tipoDroga.setCodigo(1);
        tipoDroga.setNome("");
    }

    @Test
    public void testValidaNomeTipoDroga() {
        Assert.assertEquals(tipoDroga.validaNomeTipoDroga(), true);
    }
}
