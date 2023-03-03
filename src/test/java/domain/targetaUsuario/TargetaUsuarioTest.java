package domain.targetaUsuario;

import domain.tarjetaUsuario.Autenticacion;
import domain.tarjetaUsuario.TargetaUsuario;
import org.junit.Assert;
import org.junit.Test;

public class TargetaUsuarioTest
{
    @Test
    public void isActivadaTest(){
        Autenticacion tarjeta = new TargetaUsuario("5",true);
        tarjeta.isActivada();
        Assert.assertTrue(tarjeta.isActivada());
    }
    @Test
    public void setActivadaTest(){
        TargetaUsuario tarjeta = new TargetaUsuario("2", false);
        tarjeta.setActivada(true);
        Assert.assertTrue(tarjeta.isActivada());
    }
    @Test
    public void toStringTest(){
        TargetaUsuario tarjeta = new TargetaUsuario("2", false);
        String actual = tarjeta.toString();
        Assert.assertEquals("2", actual);

    }
}
