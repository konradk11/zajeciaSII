package pl.sii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listy {

    public static void main(String[] args) {

//        List<String> nowaLista = new LinkedList<>();
//
//        nowaLista.add("Włodawa");
//        nowaLista.add("bełżyce");
//        nowaLista.add("świdnik");
//        System.out.println(nowaLista);
//        System.out.println(nowaLista.size());
//        System.out.println(nowaLista.get(1));
//        nowaLista.set(0, "bychawa");
//        System.out.println(nowaLista);


        List<Integer> listaInt = new LinkedList<>();

        for (int i = 0; i <= 100; i++) {
            listaInt.add(i);
        }

        for (int i : listaInt) {
            if (i % 2 == 0) {
                listaInt.get(i);
                int b = i * 2;
                listaInt.set(i, b);
            }


            for (int d = 0; d < listaInt.size(); d++) {
                System.out.println(listaInt.get(d));

            }

        }


    }
}
