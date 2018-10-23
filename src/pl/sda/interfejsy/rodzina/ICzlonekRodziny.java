/*Utwórz interfejs ICzłonekRodziny i metodą przedstawSie():void. Wykorzystaj interfejs i implementuj go w klasach Matka, Ojciec, Syn, Córka.
        dla klasy Matka niech instancja wypisuje wartość “i am mother”,
        dla klasy Ojciec niech instancja wypisuje wartość “i am your father”,
        dla klasy Córka niech instancja wypisuje wartość “i am daughter ;) ”,
        dla klasy Syn niech instancja wypisuje wartość “who’s asking?
*/

/*Dopisz w interfejsie dodatkową metodę jestDorosły():boolean która zwraca dla rodziców true, dla dzieci false.
Stwórz w mainie kilka instancji powyższych klas.
Przechowaj je w tablicy, a następnie iteruj i wypisuj w kolejnych liniach ich metody ‘przedstawSie()’ oraz “jestDorosły”
we wszystkich klasach dodaj pole imie.
Zmień metodę ‘przedstawSie()’ tak, aby poza treścią wypisywała również imie członka rodziny. Imie przypisuj w konstruktorze
*Zamień metodę przedstawSie():void na defaultową. Domyślnie metoda ma wypisać “I am just a simple family member”. */

package pl.sda.interfejsy.rodzina;

public interface ICzlonekRodziny {

    public void przedstawSie();
    boolean   jestDorosly();


}
