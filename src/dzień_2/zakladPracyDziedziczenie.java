package dzień_2;

class PracownikZakladu {
    String imie, nazwisko, stanowisko, miasto;
    int wiek;

    PracownikZakladu(String imie, String nazwisko, String stanowisko, String miasto, int wiek) {

        this.imie=imie;
        this.nazwisko=nazwisko;
        this.stanowisko=stanowisko;
        this.miasto=miasto;
        this.wiek=wiek;

    }

    public PracownikZakladu() {}
}

class Szef extends PracownikZakladu {
    int premia;

    Szef(int premia, String imie, String nazwisko, String stanowisko, String miasto, int wiek){
        super(imie, nazwisko, stanowisko, miasto, wiek);
        this.premia=premia;
    }

}

public class zakladPracyDziedziczenie {
    public static void main(String[] args) {

        PracownikZakladu bogdan = new PracownikZakladu("Bogdan", "Wąsik, ", "Kopacz, ", "Lubartów ,", 64);
        System.out.println(bogdan.imie);

        Szef janusz = new Szef(3333, "Janusz ", "Wąsaty, ","Pan Szef, ", "Pścim dolny, ", 42);

        System.out.println(janusz.imie+janusz.nazwisko+janusz.stanowisko+janusz.miasto+janusz.wiek+" lata, "+janusz.premia+"PLN premii bo tak.");
    }

}
