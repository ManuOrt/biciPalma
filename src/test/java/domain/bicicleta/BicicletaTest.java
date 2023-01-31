package domain.bicicleta;
import org.junit.*;
import org.junit.Assert.*;

public class BicicletaTest
{
    @Test
    public void BicicletaIdTest(){
        // Crear bicicleta
        Bicicleta bic = new Bicicleta(111);
        Assert.assertEquals(111, bic.getId());
        String actual = bic.toString();
        Assert.assertEquals("111", actual);
    }
}
