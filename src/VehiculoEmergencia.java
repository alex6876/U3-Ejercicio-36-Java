public class VehiculoEmergencia{

    protected String patente;
    protected String estacionBase;
    protected boolean enServicio;

    public VehiculoEmergencia(String patente, String estacionBase){
        this.patente = patente;
        this.estacionBase = estacionBase;
        this.enServicio = false;
    }

    public void activarAlerta(){
        System.out.println("Activando sirena y balisas de emergencia.");
    }

    public void despachar(){
        if(!enServicio){
            enServicio = true;
            System.out.println("Despachando vehiculo emergencia.");
            activarAlerta();

        }else{
            System.out.println("El vehiculo ya se encuentra en servicio!");
        }
    }

    public void mostrar(){
        System.out.println("Patente: " + patente);
        System.out.println("EstacionBase: " + estacionBase);
        System.out.println("En Servicio?: " + enServicio);
    }
}
