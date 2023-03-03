package domain.estacion;

import domain.bicicleta.Movil;

import java.beans.Transient;
import java.util.Random;

public class Anclajes
{
    private final Anclaje[] anclajes;

    public Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    public void crearAnclajes(){
        for(int i = 0; i < this.anclajes.length; i++){
            this.anclajes[i] = new Anclaje();
        }
    }
    public int numAnclajes(){
        return this.anclajes.length;
    }

    public void ocuparAnclaje(int posicionAnclaje, Movil bicicleta){
        this.anclajes[posicionAnclaje].anclarBici(bicicleta);
    }

    public boolean isAnclajeOcupado(int anclajeOcupado){
        return this.anclajes[anclajeOcupado].isOcupado();
    }

    public void liberarAnclaje(int anclajeLibre){
        this.anclajes[anclajeLibre].liberarBici();
    }

    public Movil getBiciAt(int posicion){
        return this.anclajes[posicion].getBici();
    }

    public int seleccionarAnclaje(){
        Random r = new Random();
        return r.nextInt(anclajes.length-1);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Número de anclajes: ").append(numAnclajes());
        return sb.toString();
    }

    public Anclaje[] anclajes()
    {
        return this.anclajes;
    }
}
