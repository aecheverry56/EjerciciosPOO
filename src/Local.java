class Local extends Inmueble {

    protected String localizacion;

    public Local(
            String identificador,
            double area,
            String direccion,
            String localizacion
    ) {

        super(identificador, area, direccion);

        this.localizacion = localizacion;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Localizacion: " + localizacion);
    }
}
