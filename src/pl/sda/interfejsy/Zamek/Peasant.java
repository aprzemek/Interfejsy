package pl.sda.interfejsy.Zamek;

public class Peasant extends Citizen{
    @Override
    boolean canVote() {
        return false;
    }

    public Peasant(String imie) {
        super(imie);


    }
}
