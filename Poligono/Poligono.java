package Poligono;

public abstract class Poligono {
    protected int lados;

    public Poligono(int lados) {
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }

    public String toString() {
        return "Numero de lados " + lados;
    }

    public abstract double area();

}