package pl.sda.interfejsy.Zamek;

public class King extends Citizen{
    @Override
    boolean canVote() {
        return false;
    }

    public King(String imie) {
        super(imie);


    }
}
