public class Ambulancia extends VehiculoEmergencia{

    private double stockOxigeno;
    private int medicosAbordo;

    public Ambulancia(String patente, String estacionBase, double stockOxigeno, int medicosAbordo) {

        super(patente, estacionBase);

        this.stockOxigeno = stockOxigeno;
        this.medicosAbordo = medicosAbordo;
    }

    @Override
    public void activarAlerta() {
        System.out.println("¡SIRENA MEDICA ACTIVADA!");
        System.out.println("Operativo: asistencia sanitaria de emergencia.");
    }

    @Override
    public void mostrar() {
        super.mostrar();

        System.out.println("Stock de oxigeno: " + stockOxigeno + "Litros");
        System.out.println("Medicos a bordo: " + medicosAbordo);
    }
}
