package pl.sda.interfejsy.generyczne;

//   2. Stwórz klasę generyczną Pudełko.
//   Pudełko przechowuje dowolny obiekt generyczny. Dodaj pole typu generycznego 'T'.
//   Stwórz konstruktor który przyjmuje jako parametr obiekt generyczny (przypisz jego wartość do pola).
//   Dodaj getter oraz setter do klasy.

public class Pudelko <T>{
    private T Pudelko;
    public T getPudelko() {
        return Pudelko;
    }
    public void setPudelko(T pudelko) {
        Pudelko = pudelko;
    }
    public Pudelko(T pudelko) {
        Pudelko = pudelko;
    }
}

