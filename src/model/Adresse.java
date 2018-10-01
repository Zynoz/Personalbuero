package model;

 

public class Adresse
{
	private String land;
	private int plz;
	private String ort;
	private String strasse;
	private int nr;

	public Adresse(String land, int plz, String ort, String strasse, int nr)
	{
		setLand(land);
		setPlz(plz);
		setOrt(ort);
		setStrasse(strasse);
		setNr(nr);
	}

	// ---------------------------- getter --------------------------
	public String getLand()
	{
		return land;
	}

	public int getNr()
	{
		return nr;
	}

	public String getOrt()
	{
		return ort;
	}

	public int getPlz()
	{
		return plz;
	}

	public String getStrasse()
	{
		return strasse;
	}

	// ---------------------------- setter --------------------------
	public void setLand(String land)
	{
		if (land != null)
			this.land = land;
		else
			System.out.println("Null-Referenz fuer setLand");
	}

	public void setNr(int nr)
	{
		if (nr > 0 && nr <= 1000)
			this.nr = nr;
		else
			System.out.println("Falscher Wert fuer setNr(" + nr + ") !!");
	}

	public void setOrt(String ort)
	{
		if (ort != null)
			this.ort = ort;
		else
			System.out.println("Null-Referenz fuer setOrt");
	}

	public void setPlz(int plz)
	{
		if (plz >= 1000 && plz <= 9999)
			this.plz = plz;
		else
			System.out.println("Falscher Wert fuer setPlz(" + plz + ") !!");
	}

	public void setStrasse(String strasse)
	{
		if (strasse != null)
			this.strasse = strasse;
		else
			System.out.println("Null-Referenz fuer strasse");
	}

	// ---------------------------- other --------------------------
	public String toString()
	{
		String str = land + ('-') + plz + ' ' + ort + (", ") + strasse + ' ' + nr;		
		return str;
	}

}
