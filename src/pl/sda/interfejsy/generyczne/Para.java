package pl.sda.interfejsy.generyczne;

/* 3. Stwórz klasę generyczną Para, która przyjmuje dwa obiekty - obiekt prawy i lewy.
      Niech klasa będzie generyczna. Typy obiektów (lewego i prawego) klasy mają być podane przy tworzeniu obiektu (generyczne).
      Stwórz kilka obiektów tego typu a następnie dodaj je do tablicy.
*/
public class Para <T> {

    private T lewy;
    private T prawy;

    public Para(T lewy, T prawy) {
        this.lewy = lewy;
        this.prawy = prawy;


    }

}
