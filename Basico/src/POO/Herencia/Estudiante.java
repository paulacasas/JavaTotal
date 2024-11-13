package POO.Herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private double notaFinal;

    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, double notaFinal) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Código Estudiante: " + codigoEstudiante);
        System.out.println("Nota Final: " + notaFinal);

    }

    public static void main(String[] args) {
        Estudiante estudi1 = new Estudiante("Paula", "Casas Fuentes", 19, 10533430, 4.5);
        estudi1.mostrarDatos();

    }
}
