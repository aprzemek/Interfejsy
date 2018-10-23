package pl.sda.interfejsy.kolekcje;

/*- dodaj do listy 10 liczb losowych
    - oblicz sumę elementów na liście (wypisz ją)
    - oblicz średnią elementów na liście (wypisz ją)
    - podaj medianę elementów na liście (wypisz ją) (Collections.sort( listaDoPosortowania) - sortuje listę)
*/


import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Lista list = new Lista();
        for(int i=0; i<10; i++) {
            list.addListElement(rand.nextInt(100));
        }
        System.out.println(list.podajSume());
        System.out.println(list.podajSrednia());
        System.out.println(list.podajMediane());
        System.out.println(list.podajWartoscMin());
        System.out.println(list.podajWartoscMax());
    }
}











