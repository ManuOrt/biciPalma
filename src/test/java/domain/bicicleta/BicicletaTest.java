package domain.bicicleta;
import org.junit.*;
import org.junit.Assert.*;

public class BicicletaTest
{
    @Test
    public void BicicletaIdTest(){
        // Crear bicicleta
        Movil bic = new Bicicleta(111);
        Assert.assertEquals(111, bic.getId());
    }
    @Test
    public void BicicletaToStringTest(){
        Movil bic = new Bicicleta(211);
        String actual = bic.toString();
        Assert.assertEquals("211", actual);
    }
}
