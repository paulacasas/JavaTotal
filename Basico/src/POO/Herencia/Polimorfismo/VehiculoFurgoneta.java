package POO.Herencia.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad de carga: " + getCarga() + "\n");
    }

}
