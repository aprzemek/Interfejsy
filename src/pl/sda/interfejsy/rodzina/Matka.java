package pl.sda.interfejsy.rodzina;

public class Matka implements ICzlonekRodziny {


    public static void main(String[] args) {
    Matka matka = new Matka();


    matka.przedstawSie();
    matka.jestDorosly();
    }

    @Override
    public void przedstawSie() {
        System.out.println("i am mother");


    }

    @Override
    public boolean jestDorosly() {
        return true;


    }
}
