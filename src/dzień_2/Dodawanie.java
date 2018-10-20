package dzień_2;


public class Dodawanie {
    public static void main(String[] args) {
        System.out.println(dodaj(3, 3.333));
        System.out.println(dodaj(3, 3.333, 4));
        System.out.println(dodaj(3, 3.33, 4));

    }

    static double dodaj(int a, double b) {
        return a + b;
    }

    static int dodaj(int a, int b, int c) {
        return a + b + c;
    }

    static double dodaj(double a, double b, double c) {
        return a + b;
    }
}
