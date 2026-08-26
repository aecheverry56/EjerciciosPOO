class Casa extends Vivienda {

    protected int pisos;

    public Casa(
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
                banos
        );

        this.pisos = pisos;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Pisos: " + pisos);
    }
}
