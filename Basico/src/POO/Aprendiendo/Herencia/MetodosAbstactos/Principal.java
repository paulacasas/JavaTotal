package POO.Aprendiendo.Herencia.MetodosAbstactos;

public class Principal {
    public static void main(String[] args) {
        Planta plant = new Planta();
        plant.alimentarse();

        AnimalCarnivoro animal = new AnimalCarnivoro();
        animal.alimentarse();

        AnimalHervivoro hervivoro = new AnimalHervivoro();
        hervivoro.alimentarse();

    }
}
