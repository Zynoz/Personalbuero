package test;

import java.time.Year;

import model.Adresse;
import model.Angestellter;
import model.Mitarbeiter;
import model.Personalbuero;

public class TestPersonalbuero
{

	public static void main(String[] args)
	{

		Adresse adr = new Adresse("AUT", 1050, "Wien", "Spengergasse", 20);
		Adresse adr1 = new Adresse("AUT", 1010, "Wien", "Stephansplatz", 10);
		
		Mitarbeiter m1 = new Mitarbeiter("Anton", Year.of(2000), Year.of(2018), adr1);
//		Mitarbeiter m2 = new Mitarbeiter("Anton", Year.of(1990), Year.of(2018));		
//		Mitarbeiter m3 = new Mitarbeiter("Berta", Year.of(1990), Year.of(2018));				
		
		Angestellter a1 = new Angestellter("Caesar", Year.of(2000), Year.of(2016), adr);
//		Angestellter a2 = new Angestellter("Dorothea", Year.of(1990), Year.of(2018));		
//		Angestellter a3 = new Angestellter("Emilia", Year.of(1990), Year.of(2018));	
//		a1.setAdresse(adr);
		
		Personalbuero pb = new Personalbuero();

		//pb.aufnehmen(null);
		
		System.out.println(pb.aufnehmen(m1));
//		System.out.println(pb.aufnehmen(m2));		
//		System.out.println(pb.aufnehmen(m3));	
//		System.out.println(pb);
		
		System.out.println(pb.aufnehmen(a1));
//		System.out.println(pb.aufnehmen(a2));		
//		System.out.println(pb.aufnehmen(a3));	
		System.out.println(pb);
		System.out.println(pb.gehaltsListe());
		
//		System.out.println(pb.entlassenAlle(null));
//		System.out.println(pb.entlassenAlle(""));		
//
//		System.out.println(pb);
//		
//		System.out.println(pb.entlassenAlle("Anton"));
//		System.out.println(pb);		
//
//		System.out.println(pb.entlassenAlle("Berti"));
//		System.out.println(pb);			
//	
//		
//		

		

	}
	

}
