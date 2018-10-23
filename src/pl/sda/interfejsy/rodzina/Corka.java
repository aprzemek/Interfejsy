package pl.sda.interfejsy.rodzina;

public class Corka implements ICzlonekRodziny {

    public static void main(String[] args) {

        Corka corka = new Corka();

        corka.przedstawSie();

    }
    @Override
    public void przedstawSie() {

        System.out.println("i am doughter");

    }

    @Override
    public boolean jestDorosly() {
        return false;

    }
}
