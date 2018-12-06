package model;

import java.util.Comparator;

public class MitarbeiterAltersComparator implements Comparator<Mitarbeiter> {
    @Override
    public int compare(Mitarbeiter o1, Mitarbeiter o2) {
        return Integer.compare(o1.berechneAlter(), o2.berechneAlter());
    }
}