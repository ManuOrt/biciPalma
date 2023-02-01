package domain.tarjetaUsuario;

public class TargetaUsuario implements Autenticacion
{
    private final String id;
    private boolean activada;

    public TargetaUsuario(String id, boolean activada)
    {
        this.id = id;
        this.activada = activada;
    }

    @Override
    public boolean isActivada()
    {
        return this.activada;
    }

    public void setActivada(boolean activada){
        this.activada = activada;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        return sb.toString();
    }
}
