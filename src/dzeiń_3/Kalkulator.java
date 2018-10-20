package dzeiń_3;

public class Kalkulator {

    //przyjmuje dwie zmienne typu double i wykonuje co trzeba zależne od teog co wprowadzi user: + - * /
//    public static void main(String[] args) {
//
//         double a, b;
//         String dzialanie;
//
//
//            System.out.println(oblicz(46.6, 3, "*"));
//    }


    public double oblicz(double a, double b, String dzialanie) {
        double wynik;
        switch (dzialanie) {
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                wynik = a / b;
                break;
            default:
                wynik = 0;


        }
        return wynik;


    }
}
