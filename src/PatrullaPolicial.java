public class PatrullaPolicial extends VehiculoEmergencia {

    private int cantidadEfectivos;
    private boolean blindaje;

    public PatrullaPolicial(String patente, String estacionBase,
                            int cantidadEfectivos, boolean blindaje) {

        super(patente, estacionBase);

        this.cantidadEfectivos = cantidadEfectivos;
        this.blindaje = blindaje;
    }

    @Override
    public void activarAlerta() {
        System.out.println("BALIZAS POLICIALES ACTIVADAS.");
        System.out.println("Operativo: intervencion policial.");
    }


    @Override
    public void mostrar() {
        super.mostrar();

        System.out.println("Cantidad de efectivos: " + cantidadEfectivos);
        System.out.println("Blindaje: " + blindaje);
    }
}