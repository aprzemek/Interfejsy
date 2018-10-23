package pl.sda.interfejsy.rodzina;

public class Syn implements ICzlonekRodziny {

    public static void main(String[] args) {
        Syn syn = new Syn();


        syn.przedstawSie();
    }


    @Override
    public void przedstawSie() {
        System.out.println("who's asking?");

    }

    @Override
    public boolean jestDorosly() {
        return false;
    }
}
