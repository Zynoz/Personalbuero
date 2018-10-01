package model;

import java.time.Year;

public class Angestellter extends Mitarbeiter
{

	public Angestellter(String name, Year gebJahr, Year eintrJahr, Adresse adresse)
	{ 
		super(name, gebJahr, eintrJahr, adresse);
	}


	// -------------------------------------- others -----------------------

	public float berechneGehalt()
	{
		return 1500f + 50f*berechneDienstalter();
	}

	public void print() 
	{
		System.out.println(toString());
	}
}
