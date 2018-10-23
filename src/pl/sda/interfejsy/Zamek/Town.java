package pl.sda.interfejsy.Zamek;


import java.util.ArrayList;
import java.util.List;

public class Town  {

    private List<Citizen> citizens;

    public Town() {
        citizens = new ArrayList<>();
    }

    public void addCitizen(Citizen c){
        citizens.add(c);
    }

    public void printCitizens(){
        for(Citizen c: citizens){
            System.out.println(c);
        }
    }
    public int howManyCanVote(){
        int liczbaGlosujacych = 0;
        for (Citizen c: citizens) {
            if (c instanceof Townsman || c instanceof Soldier){
                liczbaGlosujacych++;
            }
        }
        return liczbaGlosujacych;
    }

    public void whoCanVote(){
        for (Citizen c: citizens) {
            if (c instanceof Townsman || c instanceof Soldier){
                System.out.println(c);
            }
        }
    }
}