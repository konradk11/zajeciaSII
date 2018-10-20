package dzień_2;

class Samochod {

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

    public void setIloscKol(int ileJestKol) {
        iloscKol = ileJestKol;
    }

}

class Punkt {
    int x, y;
    public Punkt(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Test{
    static void zmien(Punkt punkt){
        punkt.x=punkt.x*4;
        System.out.println(punkt.x);

    }
}

public class MetodyNaSamochodach {

    public static void main(String[] args) {


        Samochod tipo = new Samochod();
        tipo.setIloscKol(5);
        System.out.println(tipo.getIloscKol());
        tipo.getKolor();

        Punkt punkt = new Punkt(7,2);
        Test.zmien(punkt);
    }

}
