package domain.estacion;
import domain.bicicleta.Bicicleta;
import domain.tarjetaUsuario.TargetaUsuario;
import org.junit.*;
import domain.estacion.Estacion;
public class EstacionTest
{
    @Test
    public void toStringTest(){
        Estacion estacion = new Estacion(20, "Manacor", 6);
        String consulta = estacion.toString();
        Assert.assertEquals("id: 20, Dirección: Manacor, Numero de anclajes: 6",consulta);
    }

    @Test
    public void anclajesLibresTest(){
        Estacion estacion = new Estacion(20, "Manacor", 6);
        int anclajesLibres = estacion.anclajesLibres();
        Assert.assertEquals(6, anclajesLibres);
    }

    @Test
    public void anclarBicicletaTest(){
        Estacion estacion = new Estacion(20, "Manacor", 6);
        Bicicleta bicicleta = new Bicicleta(229);
        estacion.anclarBicicleta(bicicleta);
        Assert.assertEquals(229,bicicleta.getId());
    }

    @Test
    public void leerTarjetaUsuario(){
        Estacion estacion = new Estacion(20, "Manacor", 6);
        TargetaUsuario tu = new TargetaUsuario("20",true);
        Assert.assertTrue(estacion.leerTarjetaUsuario(tu));
    }

    @Test
    public void retirarBicicletaTest(){
        TargetaUsuario tarjeta = new TargetaUsuario("20", true);
        Estacion estacion = new Estacion(4, "Palma", 9);
        Bicicleta bic1 = new Bicicleta(333);
        estacion.anclarBicicleta(bic1);
        Assert.assertEquals(8, estacion.anclajesLibres());
        estacion.retirarBicicleta(tarjeta);
        Assert.assertEquals(9, estacion.anclajesLibres()); 
    }

}
