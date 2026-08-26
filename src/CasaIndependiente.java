class CasaIndependiente extends CasaUrbana {

    public CasaIndependiente(
            String identificador,
            double area,
            String direccion,
            int habitaciones,
            int banos,
            int pisos
    ) {

        super(
                identificador,
                area,
                direccion,
                habitaciones,
                banos,
                pisos
        );
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- CASA INDEPENDIENTE ---");

        super.mostrarInformacion();
    }
}
