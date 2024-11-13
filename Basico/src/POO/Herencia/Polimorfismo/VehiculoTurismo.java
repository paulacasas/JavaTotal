package POO.Herencia.Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de puertas " + numeroPuertas + "\n");
    }
}
