class Oficina extends Local {

    private boolean gobierno;

    public Oficina(
            String identificador,
            double area,
            String direccion,
            String localizacion,
            boolean gobierno
    ) {

        super(
                identificador,
                area,
                direccion,
                localizacion
        );

        this.gobierno = gobierno;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- OFICINA ---");

        super.mostrarInformacion();

        System.out.println("Oficina del gobierno: " + gobierno);
    }
}
