package model;

import java.time.Year;

public class Manager extends Mitarbeiter {

    private float fixum;

    public Manager(String name, Year gebJahr, Year eintrJahr, Adresse adresse, float fixum) {
        super(name, gebJahr, eintrJahr, adresse);
        this.fixum = fixum;
    }

    public float berechneGehalt() {
        return fixum;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "fixum=" + fixum +
                "} " + super.toString();
    }
}