/* Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
        Peasant(Chłop),
        Townsman(Mieszczanin),
        King(Król),
        Soldier(Żołnierz)
        Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole).
        Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote'
        która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.

        Stwórz klasę Town która posiada tablicę Citizenów.
        Dodaj do niej kilku citizenów (różnych w mainie) i stwórz metody howManyCanVote które zwracają
        ilość osób które mogą głosować. Stwórz w klasie Town metodę "whoCanVote" która wypisuje imiona osób które mogą głosować.
*/
package pl.sda.interfejsy.Zamek;

public abstract class Citizen {

    public Citizen(String imie) {
        this.imie = imie;
    }

    String imie;

    boolean canVote() {
        return true;


    }


}