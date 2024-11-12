public class Triangulo_Isosceles {
    private double base;
    private double lado; // los lados son iguales
    private double altura;

    // Constructor
    public Triangulo_Isosceles(double base, double lado, double altura) {
        this.base = base;
        this.lado = lado;
        this.altura = altura;
    }

    public double areaTriangulo() {
        return (base * altura) * 1 / 2;
    }

    public double perimetroTriangulo() {
        return (lado * 2) + base;
    }

    public void mostrarDatos() {
        System.out.println("Base: " + base);
        System.out.println("Lado: " + lado);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + areaTriangulo());
        System.out.println("Perímetro: " + perimetroTriangulo());
    }

    public static void main(String[] args) {
        Triangulo_Isosceles t1 = new Triangulo_Isosceles(3, 2, 5);
        t1.mostrarDatos();
    }
}
