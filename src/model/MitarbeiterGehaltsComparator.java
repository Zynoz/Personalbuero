package model;

import java.util.Comparator;

public class MitarbeiterGehaltsComparator implements Comparator<Mitarbeiter> {
    @Override
    public int compare(Mitarbeiter o1, Mitarbeiter o2) {
        return Float.compare(o1.berechneGehalt(), o2.berechneGehalt());
    }
}