class CasaRural extends Casa {

    private double distanciaCabecera;
    private double altitud;

    public CasaRural(
            String identificador,
            double area,
            String direccion,
            int habitaciones,
            int banos,
            int pisos,
            double distanciaCabecera,
            double altitud
    ) {

        super(
                identificador,
                area,
                direccion,
                habitaciones,
                banos,
                pisos
        );

        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- CASA RURAL ---");

        super.mostrarInformacion();

        System.out.println("Distancia cabecera municipal: "
                + distanciaCabecera + " km");

        System.out.println("Altitud: "
                + altitud + " metros");
    }
}