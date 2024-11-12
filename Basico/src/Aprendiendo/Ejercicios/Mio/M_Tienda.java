package Aprendiendo.Ejercicios.Mio;

import java.util.Scanner;

public class M_Tienda {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int UbolloM = 1500, UbolloL = 800, UbolloA = 800, Ubuñuelo = 800;
        int TbolloM, TbolloL, TbolloA, Tbuñuelo;
        int CbolloM, CbolloL, CbolloA, Cbuñuelo;

        System.out.print("Bollos de mazorca: ");
        CbolloM = datos.nextInt();
        System.out.print("Bollos de limpio: ");
        CbolloL = datos.nextInt();
        System.out.print("Bollos de angelito: ");
        CbolloA = datos.nextInt();
        System.out.print("Buñuelos: ");
        Cbuñuelo = datos.nextInt();

        TbolloM = CbolloM * UbolloM;
        TbolloL = CbolloL * UbolloL;
        TbolloA = CbolloA * UbolloA;
        Tbuñuelo = Cbuñuelo * Ubuñuelo;
        System.out.println("Total bollos de mazorca: " + TbolloM);
        System.out.println("Total bollos de limpio: " + TbolloL);
        System.out.println("Total bollos de angelito: " + TbolloA);
        System.out.println("Total buñuelos: " + Tbuñuelo);
        System.out.println("Total: " + (TbolloM + TbolloL + TbolloA + Tbuñuelo));

        System.out.println("____________");
        System.out.println("Ganancia");

        int PventaBM = 2500, PventaBLA = 2000, Pbuñuelo = 2000;
        int GananciaBM = PventaBM * CbolloM;
        int GananciaBL = PventaBLA * CbolloL;
        int GananciaBA = PventaBLA * CbolloA;
        int GananciaBuñuelo = Pbuñuelo * Cbuñuelo;

        System.out.println("Ganancia de bollo mazorca: " + (GananciaBM - TbolloM));
        System.out.println("Ganancia de bollo limpio: " + (GananciaBL - TbolloL));
        System.out.println("Ganancia de bollo angelito: " + (GananciaBA - TbolloA));
        System.out.println("Ganancia de buñuelos: " + (GananciaBuñuelo - Tbuñuelo));
        datos.close();
    }
}
