package domain.estacion;
import domain.bicicleta.Bicicleta;
import domain.bicicleta.Movil;
import org.junit.*;
import org.junit.Assert.*;
import domain.estacion.Anclajes;

import java.util.Random;

public class AnclajesTest
{
    @Test
    public void crearAnclajesTest(){
        Anclajes anclajes = new Anclajes(6);
        int numeroAnclajes = anclajes.numAnclajes();
        Assert.assertEquals(6, numeroAnclajes);
    }

    @Test
    public void ocuparAnclajesTest(){
        Anclajes anclajes = new Anclajes(6);
        Movil bic1 = new Bicicleta(333);
        Movil bic2 = new Bicicleta(222);
        Movil bic3 = new Bicicleta(444);
        anclajes.ocuparAnclaje(0, bic1);
        anclajes.ocuparAnclaje(1, bic2);
        anclajes.ocuparAnclaje(2, bic3);
        Assert.assertTrue(anclajes.isAnclajeOcupado(0));
        Assert.assertTrue(anclajes.isAnclajeOcupado(1));
        Assert.assertTrue(anclajes.isAnclajeOcupado(2));
        Assert.assertFalse(anclajes.isAnclajeOcupado(4));
    }

    @Test
    public void isAnclajeOcupadoTest(){
        Anclajes anclajes = new Anclajes(6);
        Assert.assertFalse(anclajes.isAnclajeOcupado(0));
    }

    @Test
    public void liberarAnclajeTest(){
        Anclajes anclajes = new Anclajes(6);
        Movil bic1 = new Bicicleta(333);
        anclajes.ocuparAnclaje(0, bic1);
        anclajes.liberarAnclaje(0);
    }


    @Test
    public void getBiciAtTest(){
        Anclajes anclajes = new Anclajes(3);
        Movil bic1 = new Bicicleta(333);
        Movil bic2 = new Bicicleta(222);
        anclajes.ocuparAnclaje(0, bic1);
        anclajes.ocuparAnclaje(1, bic2);
        Assert.assertEquals(bic1, anclajes.getBiciAt(0));
        Assert.assertEquals(bic2, anclajes.getBiciAt(1));
    }

    @Test
    public void seleccionarAnclajeTest(){
        Anclajes anclajes = new Anclajes(3);
        Random r = new Random();
        r.nextInt(0, anclajes.numAnclajes());
    }

    @Test
    public void anclajesToStringTest(){
        Anclajes anclajes = new Anclajes(3);
        String result = anclajes.toString();
        Assert.assertEquals("Número de anclajes: " + anclajes.numAnclajes(), result);
    }
}
