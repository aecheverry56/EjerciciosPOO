class Vivienda extends Inmueble {

    protected int habitaciones;
    protected int banos;

    public Vivienda(
            String identificador,
            double area,
            String direccion,
            int habitaciones,
            int banos
    ) {

        super(identificador, area, direccion);

        this.habitaciones = habitaciones;
        this.banos = banos;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Habitaciones: " + habitaciones);
        System.out.println("Banos: " + banos);
    }
}