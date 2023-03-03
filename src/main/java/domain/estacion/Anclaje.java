package domain.estacion;

import domain.bicicleta.Movil;

public class Anclaje
{
    private boolean ocupado;
    private Movil bici = null;
    //Constructor
    public Anclaje(){}

    public boolean isOcupado(){
        return this.ocupado;
    }

    public Movil getBici(){
        return this.bici;
    }

    public void anclarBici(Movil bicicleta){
        this.bici = bicicleta;
        this.ocupado = true;
    }

    public void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int idBici = this.bici.getId();
        sb.append(idBici);
        return sb.toString();
    }

}
