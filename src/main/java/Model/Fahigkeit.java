package Model;

import ModelInterpreter.HelpfulMethods;

public class Fahigkeit {

    String name;
    String spiel;
    int level;

    public String getName() {
        return name;
    }

    public String getSpiel() {
        return spiel;
    }

    public int getLevel() {
        return level;
    }

    public Fahigkeit(String name, String spiel, int level) {
        this.name = name;
        this.spiel = spiel;
        this.level = level;
    }

    public Fahigkeit() {
    }

    @Override
    public String toString(){


        return "Level "+level+": "+HelpfulMethods.capitalizeFirst(name) ;


    }
}
