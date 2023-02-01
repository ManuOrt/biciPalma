package domain.estacion;
import domain.bicicleta.Bicicleta;
import org.junit.*;
import domain.bicicleta.Movil;
import domain.estacion.Anclaje;
public class AnclajeTest
{
    @Test
    public void insertarAnclajenclajeTest(){
        Anclaje anc = new Anclaje();
        Assert.assertFalse(anc.isOcupado());
    }
    @Test
    public void comprobarOcupado(){
        Anclaje anc = new Anclaje();
        Movil bic = new Bicicleta(121);
        anc.anclarBici(bic);
        Assert.assertTrue(anc.isOcupado());
        Assert.assertEquals(bic, anc.getBici());
    }
    @Test
    public void liberarBiciTest(){
        Anclaje anc = new Anclaje();
        Movil bic = new Bicicleta(121);
        anc.anclarBici(bic);
        Assert.assertTrue(anc.isOcupado());
        anc.liberarBici();
        Assert.assertFalse(anc.isOcupado());
    }

    @Test
    public void anclajeToStringTest(){
        Anclaje anc = new Anclaje();
        Movil bic = new Bicicleta(222);
        anc.anclarBici(bic);
        String actual = anc.toString();
        Assert.assertEquals("222", actual);
    }

}
