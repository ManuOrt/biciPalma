package domain.estacion;
import domain.estacion.Anclajes;
import domain.estacion.Anclaje;
import domain.bicicleta.*;
import domain.tarjetaUsuario.Autenticacion;

public class Estacion
{
    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numeroAnclajes)
    {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numeroAnclajes);
    }

    @Override
    public String toString(){
        StringBuilder sc = new StringBuilder();
        sc.append("id: ").append(id).append(", Dirección: ").append(direccion).append(", Numero de anclajes: ").append(anclajes.numAnclajes());
        return sc.toString();
    }

    public void consultarEstacion(){
        System.out.println(this);
    }

    private Anclaje[] anclajes(){
        return this.anclajes.anclajes();
    }

    private int numAnclajes()
    {
        return this.anclajes.numAnclajes();
    }

    public int anclajesLibres(){
        int anclajesLibres = 0;
        for (Anclaje anclaje : anclajes()) {
            anclajesLibres = anclaje.isOcupado()? anclajesLibres: ++anclajesLibres;
        }
        return anclajesLibres;
    }

    public void anclarBicicleta(Movil bicicleta){
        int posicion = 0;
        int numeroAnclaje = posicion + 1;
        for (Anclaje anclaje: anclajes()){
            if (!anclaje.isOcupado()){
                anclajes.ocuparAnclaje(posicion,bicicleta);
                mostrarAnclaje(bicicleta,numeroAnclaje);
                break;
            }else{
                posicion++;
            }
            numeroAnclaje++;
        }
    }

    public void mostrarAnclaje(Movil bicicleta, int numeroAnclaje){
        System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + numeroAnclaje);
    }

    public boolean leerTarjetaUsuario(Autenticacion tarjetaUsuario){
        return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjetaUsuario) {
        if (leerTarjetaUsuario(tarjetaUsuario)){
            boolean isRetirada = false;

            while(!isRetirada){
                int posicion = anclajes.seleccionarAnclaje();
                int calcularPosicion = posicion + 1;
                if (anclajes.isAnclajeOcupado(posicion)){
                    mostrarBicicleta(anclajes.getBiciAt(posicion), calcularPosicion);
                    anclajes.liberarAnclaje(posicion);
                    isRetirada = true;
                }else{

                }
            }
        } else {
            System.out.println("Tarjeta de usuario inactiva :(");
        }
    }

    private void mostrarBicicleta(Movil bicicleta, int numeroAnclaje){
        System.out.println("bicicleta retirada: " + bicicleta.getId()
                + " del anclaje: " + numeroAnclaje);
    }


    public void consultarAnclajes()
    {
        int posicion = 0;
        int numeroAnclaje = 1;
        for (Anclaje anclaje : anclajes()){
            numeroAnclaje++;
            if (anclaje.isOcupado()){
                System.out.println("Anclaje: " + numeroAnclaje + "  con la bicicleta: " + anclaje.getBici().getId());
            }
            else{
                System.out.println("Anclaje: " + numeroAnclaje + " libre");
            }
            posicion++;
        }
    }
}
