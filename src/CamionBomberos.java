public class CamionBomberos extends VehiculoEmergencia {

    private double capacidadAguaLitros;
    private double longitudEscala;

    public CamionBomberos(String patente, String estacionBase,
                          double capacidadAguaLitros, double longitudEscala) {

        super(patente, estacionBase);

        this.capacidadAguaLitros = capacidadAguaLitros;
        this.longitudEscala = longitudEscala;
    }

    @Override
    public void activarAlerta() {
        System.out.println("SIRENA DE BOMBEROS ACTIVADA.");
        System.out.println("Operativo: respuesta ante incendio.");
    }

    @Override
    public void mostrar() {
        super.mostrar();

        System.out.println("Capacidad de agua: "
                + capacidadAguaLitros + " litros");

        System.out.println("Longitud de escala: "
                + longitudEscala + " metros");
    }

}