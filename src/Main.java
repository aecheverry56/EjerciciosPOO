import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Inmueble> inmuebles = new ArrayList<>();

    int opcion;

    do {

        System.out.println("\n--- INMOBILIARIA ---");
        System.out.println("1. Registrar casa rural");
        System.out.println("2. Registrar casa independiente");
        System.out.println("3. Registrar casa en conjunto");
        System.out.println("4. Registrar apartaestudio");
        System.out.println("5. Registrar apartamento familiar");
        System.out.println("6. Registrar local comercial");
        System.out.println("7. Registrar oficina");
        System.out.println("8. Mostrar inmuebles");
        System.out.println("0. Salir");

        System.out.print("Seleccione una opcion: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {

            case 1:

                System.out.print("Identificador: ");
                String id = scanner.nextLine();

                System.out.print("Area en metros cuadrados: ");
                double area = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Direccion: ");
                String direccion = scanner.nextLine();

                System.out.print("Numero de habitaciones: ");
                int habitaciones = scanner.nextInt();

                System.out.print("Numero de banos: ");
                int banos = scanner.nextInt();

                System.out.print("Cantidad de pisos: ");
                int pisos = scanner.nextInt();

                System.out.print("Distancia a la cabecera municipal: ");
                double distancia = scanner.nextDouble();

                System.out.print("Altitud sobre el nivel del mar: ");
                double altitud = scanner.nextDouble();

                inmuebles.add(new CasaRural(
                        id,
                        area,
                        direccion,
                        habitaciones,
                        banos,
                        pisos,
                        distancia,
                        altitud
                ));

                System.out.println("Casa rural registrada correctamente.");

                break;

            case 2:

                System.out.print("Identificador: ");
                id = scanner.nextLine();

                System.out.print("Area: ");
                area = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Direccion: ");
                direccion = scanner.nextLine();

                System.out.print("Habitaciones: ");
                habitaciones = scanner.nextInt();

                System.out.print("Banos: ");
                banos = scanner.nextInt();

                System.out.print("Pisos: ");
                pisos = scanner.nextInt();

                inmuebles.add(new CasaIndependiente(
                        id,
                        area,
                        direccion,
                        habitaciones,
                        banos,
                        pisos
                ));

                System.out.println("Casa independiente registrada.");

                break;

            case 3:

                System.out.print("Identificador: ");
                id = scanner.nextLine();

                System.out.print("Area: ");
                area = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Direccion: ");
                direccion = scanner.nextLine();

                System.out.print("Habitaciones: ");
                habitaciones = scanner.nextInt();

                System.out.print("Banos: ");
                banos = scanner.nextInt();

                System.out.print("Pisos: ");
                pisos = scanner.nextInt();

                System.out.print("Valor administracion: ");
                double administracion = scanner.nextDouble();

                System.out.print("Tiene areas comunes? true/false: ");
                boolean areasComunes = scanner.nextBoolean();

                inmuebles.add(new CasaConjunto(
                        id,
                        area,
                        direccion,
                        habitaciones,
                        banos,
                        pisos,
                        administracion,
                        areasComunes
                ));

                System.out.println("Casa en conjunto registrada.");

                break;

            case 4:

                System.out.print("Identificador: ");
                id = scanner.nextLine();

                System.out.print("Area: ");
                area = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Direccion: ");
                direccion = scanner.nextLine();

                System.out.print("Numero de banos: ");
                banos = scanner.nextInt();

                System.out.print("Valor administracion: ");
                administracion = scanner.nextDouble();

                inmuebles.add(new Apartaestudio(
                        id,
                        area,
                        direccion,
                        banos,
                        administracion
                ));

                System.out.println("Apartaestudio registrado.");

                break;

            case 5:

                System.out.print("Identificador: ");
                id = scanner.nextLine();

                System.out.print("Area: ");
                area = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Direccion: ");
                direccion = scanner.nextLine();

                System.out.print("Habitaciones: ");
                habitaciones = scanner.nextInt();

                System.out.print("Banos: ");
                banos = scanner.nextInt();

                System.out.print("Valor administracion: ");
                administracion = scanner.nextDouble();

                inmuebles.add(new ApartamentoFamiliar(
                        id,
                        area,
                        direccion,
                        habitaciones,
                        banos,
                        administracion
                ));

                System.out.println("Apartamento familiar registrado.");

                break;

            case 6:

                System.out.print("Identificador: ");
                id = scanner.nextLine();

                System.out.print("Area: ");
                area = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Direccion: ");
                direccion = scanner.nextLine();

                System.out.print("Localizacion (interno/calle): ");
                String localizacion = scanner.nextLine();

                System.out.print("Centro comercial: ");
                String centroComercial = scanner.nextLine();

                inmuebles.add(new LocalComercial(
                        id,
                        area,
                        direccion,
                        localizacion,
                        centroComercial
                ));

                System.out.println("Local comercial registrado.");

                break;

            case 7:

                System.out.print("Identificador: ");
                id = scanner.nextLine();

                System.out.print("Area: ");
                area = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Direccion: ");
                direccion = scanner.nextLine();

                System.out.print("Localizacion: ");
                localizacion = scanner.nextLine();

                System.out.print("Es oficina del gobierno? true/false: ");
                boolean gobierno = scanner.nextBoolean();

                inmuebles.add(new Oficina(
                        id,
                        area,
                        direccion,
                        localizacion,
                        gobierno
                ));

                System.out.println("Oficina registrada.");

                break;

            case 8:

                System.out.println("\n--- LISTA DE INMUEBLES ---");

                for (Inmueble inmueble : inmuebles) {
                    inmueble.mostrarInformacion();
                }

                break;

            case 0:
                System.out.println("Programa finalizado.");
                break;

            default:
                System.out.println("Opcion no valida.");
        }

    } while (opcion != 0);

    scanner.close();
}