package pl.sda.interfejsy.Zamek;

public class Soldier extends Citizen{
    @Override
    boolean canVote() {
        return true;
    }

    public Soldier(String imie) {
        super(imie);
    }
}
