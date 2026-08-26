class CasaConjunto extends CasaUrbana {

    private double administracion;
    private boolean areasComunes;

    public CasaConjunto(
            String identificador,
            double area,
            String direccion,
            int habitaciones,
            int banos,
            int pisos,
            double administracion,
            boolean areasComunes
    ) {

        super(
                identificador,
                area,
                direccion,
                habitaciones,
                banos,
                pisos
        );

        this.administracion = administracion;
        this.areasComunes = areasComunes;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- CASA EN CONJUNTO ---");

        super.mostrarInformacion();

        System.out.println("Administracion: $" + administracion);
        System.out.println("Tiene areas comunes: " + areasComunes);
    }
}
