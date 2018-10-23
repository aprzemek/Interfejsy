package pl.sda.interfejsy.Zamek;

public class Main {

    public static void main(String[] args) {
        {
            Citizen c1 = new Peasant("Zenon");
            Citizen c2 = new Peasant("Kazik");
            Citizen c3 = new Townsman("Brunon");
            Citizen c4 = new Townsman("Janusz");
            Citizen c5 = new King("Kazimierz");
            Citizen c6 = new Soldier("Antoni");
            Citizen c7 = new Soldier("Wiking");
            Citizen c8 = new Soldier("Alfons");

            Town t = new Town();
            t.addCitizen(c1);
            t.addCitizen(c2);
            t.addCitizen(c3);
            t.addCitizen(c4);
            t.addCitizen(c5);
            t.addCitizen(c6);
            t.addCitizen(c7);
            t.addCitizen(c8);

            t.printCitizens();

            System.out.println(t.howManyCanVote());
            t.whoCanVote();
        }
    }}

