package POO.Herencia.Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cilindrada: " + cilindrada);
    }

}
