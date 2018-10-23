package pl.sda.interfejsy.mapy;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1111L,"Przemek ", "Kowalski");
        Student student2 = new Student(1112L,"Rysiek ", "Mimet");
        Student student3 = new Student(1113L,"Michał ", "Krs");
        Student student4 = new Student(1114L,"Adam ", "Ktwrw");
        Student student5 = new Student(1115L,"Zenek ", "Kowwt");

        Map<Long,String> map = new HashMap<>();


        map.put((long) 1111,"Przemek");
        map.put((long) 1112,"Rysiek");
        map.put((long) 1113,"Michał");
        map.put((long) 1114,"Adam");
        map.put((long) 1115,"Zenek");


        if (map.containsKey(1111L)){
            String wartosc = map.get(1111L);
            System.out.println("jest taki student");
        }

        if (map.containsKey(1112L)) {
            String wartosc = map.get(1112L);
            System.out.println(wartosc);


        }
        //map.keySet();
        System.out.println(map);



    }

}
