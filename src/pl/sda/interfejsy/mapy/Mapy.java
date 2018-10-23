package pl.sda.interfejsy.mapy;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();


//        list.add("Abrakadabra");
        map.put(234567, "Abrakadabra");
        map.put(234568, "Abrakadabra2");
        map.put(234569, "Abrakadabra3");
        map.put(234570, "Abrakadabra4");

        if (map.containsKey(234568)) {
            String wartosc = map.get(234568);
        }

        if (map.containsValue("Abrakadabra")) {
            System.out.println("Zawiera tekst Abrakadabra");
        }

        // iterowanie wartości
        for (String tekst : map.values()) {
            System.out.println(tekst);
        }

        // iterowanie kluczy
        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            if(entry.getKey() == 234569) {
                map.remove(234569);
            }
        }



        map.remove(234567);
    }
}



