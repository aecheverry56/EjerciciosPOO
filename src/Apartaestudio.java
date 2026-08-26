class Apartaestudio extends Apartamento {

    public Apartaestudio(
            String identificador,
            double area,
            String direccion,
            int banos,
            double administracion
    ) {

        super(
                identificador,
                area,
                direccion,
                1,
                banos,
                administracion
        );
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- APARTAESTUDIO ---");

        super.mostrarInformacion();
    }
}

