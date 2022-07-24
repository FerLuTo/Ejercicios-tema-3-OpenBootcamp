public class Main {
    public static void main(String args[]) {
        int total = 0;
        total = suma(15, 20, 40);
        System.out.println(total);
        Coche miCoche = new Coche();
        miCoche.sumaPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

class Coche {

    public int puertas = 0;

    public void sumaPuertas()
    {
        this.puertas++;
    }

}
