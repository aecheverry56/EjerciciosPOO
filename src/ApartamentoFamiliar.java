class ApartamentoFamiliar extends Apartamento {

    public ApartamentoFamiliar(
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
                banos,
                administracion
        );
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- APARTAMENTO FAMILIAR ---");

        super.mostrarInformacion();
    }
}
