package dzień_2;

public class zadanieDziałanie {
    public static void main(String[] args) {
        System.out.println("wynik mnożenia: " + mnozenie(3, 4));
        System.out.println("wynik mnożenia: " + mnozenie(3, 4, 6));
        System.out.println("wynik mnożenia: " + mnozenie(3, 4, 4, 3));
    }

    static int mnozenie(int a, int b) {
        return a * b;
    }

    static int mnozenie(int a, int b, int c) {
        return a * b * c;
    }

    static int mnozenie(int a, int b, int c, int d) {
        return a * b * c * d;
    }
}
