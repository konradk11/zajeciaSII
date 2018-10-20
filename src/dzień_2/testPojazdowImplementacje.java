package dzień_2;

abstract class Pojazd {
   abstract public void jazda(int predkosc);
   abstract public void stop();
   void dajGlos(){
       System.out.println("BrumBrum");
   }
}

class Auto extends Pojazd {

    public void jazda(int predkosc) {
        System.out.println("Autko rusza i jedzie z predkoscia " + predkosc + "km/h");

    }

    public void stop() {
        System.out.println("Atuo zatrzymuje się.");
    }

}

class Rower extends Pojazd {

    public void jazda(int predkosc) {
        System.out.println("Rowerek ruszył i wlecze się z prędkością " + predkosc + "km/h");
    }

    public void stop() {
        System.out.println("Rowerek zatzymał się.");
    }
}

public class testPojazdowImplementacje {

    public static void main(String[] args) {

        Rower giant = new Rower();
        Auto passacik = new Auto();
        System.out.println("Odpalamy passacika.");
        int n = 119;
        if (n > 99) {
            passacik.jazda(n);
            passacik.dajGlos();
            System.out.println("Niestety opony były łyse i na zakręcie pojechał prosto w drzewo.");
            passacik.stop();

        } else{
            passacik.jazda(n);
            System.out.println("Jakimś cudem passacik przeleciał przez zakręt");
        }

            giant.jazda(99);
    }

}
