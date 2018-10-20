package pracaDomowa.zadanie3;

public class partsShop {
    public static void main(String[] args) {
        AutoParts tarczaSprzegla = new clutchParts();
        ((clutchParts) tarczaSprzegla).setZastosowanie("Tarcza sprzegla");
        ((clutchParts) tarczaSprzegla).setCena(250);
        ((clutchParts) tarczaSprzegla).setIlosc(1);

        AutoParts przod = new suspensionParts.Wahacz();

        ((suspensionParts) przod).setZastosowanie("Lewy przód");
        ((suspensionParts) przod).setCena(100);
        ((suspensionParts) przod).setIlosc(2);

        System.out.println(((suspensionParts.Wahacz) przod).getZastosowanie()
                + ((suspensionParts.Wahacz) przod).getIlosc()
                + ((suspensionParts.Wahacz) przod).getCena());


    }
}
