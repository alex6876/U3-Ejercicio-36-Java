public class Main {

    public static void main(String[] args) {

        Ambulancia ambulancia = new Ambulancia(
                "AB123CD", "Hospital Central",
                80, 2
        );

        CamionBomberos bomberos = new CamionBomberos(
                "EF456GH", "Cuartel Norte",
                5000, 25
        );

        PatrullaPolicial patrulla = new PatrullaPolicial(
                "IJ789KL", "Comisaria Primera",
                3, true
        );

        VehiculoEmergencia[] flota = {
                ambulancia,
                bomberos,
                patrulla
        };

        System.out.println("===== CENTRAL DE EMERGENCIAS =====");

        for (VehiculoEmergencia vehiculo : flota) {

            System.out.println("\n------------------------------");

            vehiculo.mostrar();

            System.out.println("\nDespachando unidad...");

            vehiculo.despachar();
        }
    }
}