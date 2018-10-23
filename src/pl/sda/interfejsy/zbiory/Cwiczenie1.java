package pl.sda.interfejsy.zbiory;

//        Umieść wszystkie elementy tablicy {10,12,10,3,4,12,12,300,12,40,55} w zbiorze (HashSet) oraz:
//        Wypisz liczbę elementów na ekran (metoda size())
//        Wypisz wszystkie zbioru elementy na ekran (forEach)
//        Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
//        zmień implementacje na TreeSet


import java.util.HashSet;

public class Cwiczenie1 {
    public static void main(String[] args) {


        //boolean tablica[] = {10.0 10.0, 3.0, 4.0, 12.0, 12.0, 300.0, 12.0, 40.0, 55.0};

        HashSet<Integer> liczby = new HashSet<>();

       // liczby.add(tablica);
        System.out.println(liczby);
    }
}
