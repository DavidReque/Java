public class App {
    public static void main(String[] args) {
    coche miCoche = new coche();
    miCoche.numeroPuertas();

    System.out.println(miCoche.puertas);
    }


public static int suma(int a, int b) {
    return a + b;

}

}

class coche {
    public int puertas = 4;


public void numeroPuertas () {
    this.puertas++;
}

}