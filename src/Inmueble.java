class Inmueble {

    protected String identificador;
    protected double area;
    protected String direccion;

    public Inmueble(String identificador, double area, String direccion) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularValorCompra() {

        // Ejemplo de valor por metro cuadrado
        return area * 2000000;
    }

    public void mostrarInformacion() {

        System.out.println("\nIdentificador: " + identificador);
        System.out.println("Area: " + area + " m2");
        System.out.println("Direccion: " + direccion);
        System.out.println("Valor estimado: $" + calcularValorCompra());
    }
}
