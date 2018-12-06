package model;

import java.util.Comparator;

public class MitarbeiterNamensComparator implements Comparator<Mitarbeiter> {
    @Override
    public int compare(Mitarbeiter o1, Mitarbeiter o2) {
        return o1.getName().compareTo(o2.getName());
    }
}