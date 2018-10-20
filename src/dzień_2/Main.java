package dzień_2;

class Samochod2 {

    int iloscKol;
    String kolor;

    public void jedzie() {
        System.out.println("brum, brum!");
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public String getKolor() {
        return kolor;
    }

}

public class Main {

    public static void main(String[] args) {


        Samochod2 tipo = new Samochod2();
        tipo.iloscKol = 5;
        System.out.println(tipo.getIloscKol());
        tipo.getKolor();

    }
}
