package model;

import java.time.Year;

public abstract class Mitarbeiter
{
	private String name;
	private Year gebJahr;
	private Year eintrJahr;
	//private float gehalt;
	private Adresse adresse;

	public Mitarbeiter(String name, Year gebJahr, Year eintrJahr, Adresse adresse)// , float gehalt)
	{ 
		setName(name);
		setGebJahr(gebJahr);
		setEintrJahr(eintrJahr);
		//setGehalt(gehalt);
		setAdresse(adresse);
	}

	// ------------------------------------ getter ------------------------
	public String getName()
	{
		return name;
	}

	public Year getGebJahr()
	{
		return gebJahr;
	}

	public Year getEintrJahr()
	{
		return eintrJahr;
	}

	public Adresse getAdresse()
	{
		return adresse;
	}

//	public float getGehalt()
//	{
//		return gehalt;
//	}

	// ------------------------------------ setter ------------------------ 
	public void setName(String name)
	{
		if (name != null && name != "")
		{
			this.name = name;
		}
		else
		{
			System.out.println("Null-Referenz fuer setName !!!");
			System.out.println("Default-Wert (\"Tagesloehner\") fuer setName wird gesetzt");
			this.name = "Tagesloehner";	
		}
	}

//	public void setGebJahr(Year gebJahr)
//	{
////		if (gebJahr >= 1900 && gebJahr <= 2018 )
//		if (gebJahr != null )
//		{
//			int aktJahr = Year.now().getValue();
//			int geburtsJahr = gebJahr.getValue();
//			if (geburtsJahr >= aktJahr - 100 && geburtsJahr <= aktJahr)
//				this.gebJahr = gebJahr;
//			else 
//				System.out.println("Falsche Parameter für setGebJahr("+gebJahr+")");
//		}
//		else 
//			System.out.println("null-Referenz für setGebJahr("+gebJahr+")");
//	}
	public void setGebJahr(Year gebJahr)
	{
		if (gebJahr != null )
		{
			if (!gebJahr.isBefore(Year.now().minusYears(100))   && !gebJahr.isAfter(Year.now()) )
			{
				this.gebJahr = gebJahr;
			}
			else
			{
				System.out.println("Falsche Parameter für setGebJahr("+gebJahr+")");
				// Ergaenzung nach null-pointer-Exception in Testfall tf_pb_aufnehmen_02
				System.out.println("Default-Geburtsjahr (Anm. Year.now().minusYears(18)) wird gesetzt");
				this.gebJahr = Year.now().minusYears(18);
			}
		}
		else
		{
			System.out.println("null-Referenz für setGebJahr("+gebJahr+")");
		}
	}

	public void setEintrJahr(Year eintrJahr)
	{
		// Ergaenzung nach Eintrittsjahr 2019 in Testfall tf_pb_aufnehmen_02
		Year fruehestesEintrittsjahr = getGebJahr().plusYears(15);
		Year spaetestesEintrittsjahr = Year.now();
		if (eintrJahr != null)
		{
			if (!eintrJahr.isBefore(fruehestesEintrittsjahr) && !eintrJahr.isAfter(spaetestesEintrittsjahr))
			{
					this.eintrJahr = eintrJahr;
			}
			else
			{
				System.out.println("Falscher Parameterwert (" + eintrJahr + ") fuer setEintrJahr !!!");
				System.out.println("Defaultwert ( Year.now() ) fuer setEintrJahr wird gesetzt");
				this.eintrJahr = Year.now();				
			}
		}
		else
		{
			System.out.println("null-Referenz fuer setEintrJahr erhalten!!!");			
			System.out.println("Defaultwert ( Year.now() ) fuer setEintrJahr wird gesetzt");
			this.eintrJahr = Year.now();
		}
	}

	public void setAdresse(Adresse adresse) 
	{
		if (adresse != null)
		{
			this.adresse = adresse;
		}
		else
		{
			System.out.println("Null-Referenz fuer setAdresse !!!");
		}
	}

//	public void setGehalt(float gehalt)
//	{
//		if (gehalt >= 100 && gehalt <= 100000)
//		{
//			this.gehalt = gehalt;
//		}
//		else
//		{
//			System.out.println("Falscher Parameterwert fuer setGehalt !!!");
//			System.out.println("Default-Wert (EUR 100) fuer setGehalt wird gesetzt");
//			this.gehalt = 100f;		
//		}
//	}

	// -------------------------------------- others -----------------------
	public int berechneAlter() 
	{
		return Year.now().getValue() - gebJahr.getValue();
	}

	public String toString() 
	{
		String str = name + ", geb. " + gebJahr + "  @ ";
		if (adresse != null)
		{
			str += adresse;
		}
		else
		{
			str += "keine Adresse";
		}
		return str;
	}

	public void print() 
	{
		System.out.println(toString());
	}

	public float berechneGehalt()
	{
		return 0;
	}
	
	public int berechneDienstalter()
	{
		return Year.now().getValue() - eintrJahr.getValue();
	}
}

