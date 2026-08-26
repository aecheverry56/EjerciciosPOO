class LocalComercial extends Local {

    private String centroComercial;

    public LocalComercial(
            String identificador,
            double area,
            String direccion,
            String localizacion,
            String centroComercial
    ) {

        super(
                identificador,
                area,
                direccion,
                localizacion
        );

        this.centroComercial = centroComercial;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- LOCAL COMERCIAL ---");

        super.mostrarInformacion();

        System.out.println("Centro comercial: " + centroComercial);
    }
}
