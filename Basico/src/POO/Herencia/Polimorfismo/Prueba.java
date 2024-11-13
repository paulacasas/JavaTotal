package POO.Herencia.Polimorfismo;

public class Prueba {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("AXB120", "Toyota", "Vx2");
        vehiculo.mostrarDatos();
        System.out.println();

        Vehiculo vehiculo2 = new VehiculoDeportivo("YRS474", "Ferrari", "Sp400", 500);
        vehiculo2.mostrarDatos();

        Vehiculo vehiculo3 = new VehiculoTurismo("XYZ123", "Honda", "Civic", 250);
        vehiculo3.mostrarDatos();

        Vehiculo vehiculo4 = new VehiculoFurgoneta("MTT033", "Van", "A8", 2000);
        vehiculo4.mostrarDatos();
    }
}
