class Apartamento extends Vivienda {

    protected double administracion;

    public Apartamento(
            String identificador,
            double area,
            String direccion,
            int habitaciones,
            int banos,
            double administracion
    ) {

        super(
                identificador,
                area,
                direccion,
                habitaciones,
                banos
        );

        this.administracion = administracion;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Administracion: $" + administracion);
    }
}