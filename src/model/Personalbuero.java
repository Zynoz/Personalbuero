package model;

 

import java.util.*;

public class Personalbuero
{
	private ArrayList<Mitarbeiter> mitarbeiter;

	public Personalbuero()
	{
		mitarbeiter = new ArrayList<Mitarbeiter>();
	}

// ------------------------- others --------------------------------------------------------	

	public boolean aufnehmen(Mitarbeiter ma) 
	{
		if (ma != null)
		{
			if (ma.berechneAlter() < 60)
			{
				mitarbeiter.add(ma);
				return true;
			}
			else
			{
				System.out.println("Mitarbeiter zu alt, kann nicht aufgenommen werden!");
				return false;
			}
		}
		else
		{
			System.out.println("Null-Referenz fuer aufnehmen(Mitarbeiter ma) uebergeben!!");
			return false;
		}
	}

//	public float berechneGehaltSumme()  // mit Iterator
//	{
//		float summe = 0f;
//		if (mitarbeiter != null)
//		{
//			Mitarbeiter m;
//			Iterator <Mitarbeiter> iter = mitarbeiter.iterator();
//			while (iter.hasNext())
//			{
//				m = iter.next();
//				summe += m.getGehalt();
//			}
//		}
//		else
//		{
//			System.out.println("Null-Referenz bei mitarbeiter");
//		}
//		return summe;
//	}

	public String gehaltsListe() // mit Iterator
	{
		StringBuilder str = new StringBuilder("\n\nGehaltsliste aller Mitarbeiter\n------------------------------------------------------\n");
		if (mitarbeiter != null)
		{
			Mitarbeiter m;
			Iterator <Mitarbeiter> iter = mitarbeiter.iterator();
			while(iter.hasNext())
			{
				m = iter.next();
				if (m != null)
				{
					str.append(m.getName()).append("  EUR ").append(m.berechneGehalt()).append(", ");
					if (m.getAdresse() != null)
					{
						str.append(m.getAdresse());
					}
					else
					{
						str.append(" - derzeit ohne Adresse!");
					}
					str.append('\n');
				}
				else
				{
					System.out.println("Null-Referenz bei mitarbeiter in Collection!!!");
				}
			}
		}
		else
		{
			System.out.println("Null-Referenz bei Collection mitarbeiter!!!");
		}
//		str += "------------------------------------------------------\nGehaltsumme: " + berechneGehaltSumme();
		return str.toString();
	}

	public boolean entlassen(int pos)
	{
		if (pos >= 0 && pos < mitarbeiter.size())
		{
			mitarbeiter.remove(pos);
			return true;
		}
		else
		{
			System.out.println("Falsche Position fuer entlassen(int pos = " + pos + " ) uebergeben!!");
			return false;
		}
	}

	public boolean entlassen(String name) // mit iterator
	{
		if (name != null)
		{
			if (mitarbeiter != null)
			{
				Mitarbeiter m;
				Iterator <Mitarbeiter> iter = mitarbeiter.iterator();
				while(iter.hasNext())
				{
					m = iter.next();
					if (m != null)
					{
						if (m.getName().equals(name))
						{
							iter.remove();
							return true;
						}
					}
					else
					{
						System.out.println("Null-Referenz bei mitarbeiter in Collection!!!");
					}
				}
			}
			else
			{
				System.out.println("Null-Referenz bei Collection mitarbeiter!!!");
			}
		}
		else
		{
			System.out.println("Es gibt keinen Mitarbeiter mit dem Namen " + name + " !!");
		}
		return false;
	}

	public boolean entlassenAlle(String name) // mit iterator
	{
		boolean entlassung = false; 
		if (name != "" && name != null)
		{
		  Mitarbeiter m;
		  Iterator <Mitarbeiter> iter = mitarbeiter.iterator();
		  
		  while(iter.hasNext())
		  {
			  m = iter.next();
			  if (m.getName().equals(name))
			  {
				 iter.remove();  
				 entlassung = true;
			  }
			  
		  }
		  
		  if (entlassung)
		  {
			  return true;
		  }
		  else
			  return false;
		}
		else
			return false;
	}	
	
	public int zaehlenAlter(int alter) // mit Iterator
	{
		int anz = 0;
		if (alter > 0)
		{
			if (mitarbeiter != null)
			{
				Mitarbeiter m;
				Iterator <Mitarbeiter> iter = mitarbeiter.iterator();
				while (iter.hasNext())
				{
					m = iter.next();
					if (m != null)
					{
						if (m.berechneAlter() > alter)
						{
							anz++;
						}
					}
					else
					{
						System.out.println("Null-Referenz bei mitarbeiter in Collection!!!");
					}
				}
			}
			else
			{
				System.out.println("Null-Referenz bei Collection mitarbeiter!!!");
			}
		}
		else
		{
			System.out.println("Falscher Parameterwert fuer zaehleAlter(" + alter + ")");
		}
		return anz;
	}


//	public void gehaltsErhoehung(int proz) // mit Iterator
//	{
//		if (proz > 0 && proz <= 1000)
//		{
//			if (mitarbeiter != null)
//			{
//				Mitarbeiter m;
//				Iterator <Mitarbeiter> iter = mitarbeiter.iterator();
//				while (iter.hasNext())
//				{
//					m = iter.next();
//					if (m != null)
//					{
//						m.setGehalt((m.getGehalt() * (100 + proz)) / 100);
//					}
//					else
//					{
//						System.out.println("Null-Referenz bei mitarbeiter in Collection!!!");
//					}
//				}
//			}
//			else
//			{
//				System.out.println("Null-Referenz bei Collection mitarbeiter!!!");
//			}
//		}
//		else
//		{
//			System.out.println("Falscher Parameterwert fuer gehaltsErhoehung(" + proz + ")");
//		}
//	}

	public String toString()  // mit Iterator
	{
		String str = "";
		if (mitarbeiter != null)
		{
			Mitarbeiter m;
			Iterator <Mitarbeiter> iter = mitarbeiter.iterator();
			while (iter.hasNext())
			{
				m = iter.next();
				if (m != null)
				{
					str += m + "\n";
				}
				else
				{
					System.out.println("Null-Referenz bei mitarbeiter in Collection!!!");
				}
			}
		}
		else
		{
			System.out.println("Null-Referenz bei Collection mitarbeiter!!!");
		}
		if (str.equals(""))
		{
			str = ("keine Mitarbeiter vorhanden");
		}
		return str;
	}
}
