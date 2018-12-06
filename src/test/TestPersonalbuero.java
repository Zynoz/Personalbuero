package test;

import java.io.File;
import java.time.Year;

import model.*;

public class TestPersonalbuero
{

	public static void main(String[] args)
	{

		Adresse adr = new Adresse("AUT", 1050, "Wien", "Spengergasse", 20);
		Adresse adr1 = new Adresse("AUT", 1010, "Wien", "Stephansplatz", 10);
		
//		Mitarbeiter m1 = new Mitarbeiter("Anton", Year.of(2000), Year.of(2018), adr1);
//		Mitarbeiter m2 = new Mitarbeiter("Anton", Year.of(1990), Year.of(2018));		
//		Mitarbeiter m3 = new Mitarbeiter("Berta", Year.of(1990), Year.of(2018));				
		
		Angestellter a1 = new Angestellter("Caesar", Year.of(2000), Year.of(2016), adr);
//		Angestellter a2 = new Angestellter("Dorothea", Year.of(1990), Year.of(2018));		
//		Angestellter a3 = new Angestellter("Emilia", Year.of(1990), Year.of(2018));	
//		a1.setAdresse(adr);
		
		Personalbuero pb = new Personalbuero();

		//pb.aufnehmen(null);
		
//		System.out.println(pb.aufnehmen(m1));
//		System.out.println(pb.aufnehmen(m2));		
//		System.out.println(pb.aufnehmen(m3));	
//		System.out.println(pb);
		
		//System.out.println(pb.aufnehmen(a1));
//		System.out.println(pb.aufnehmen(a2));		
//		System.out.println(pb.aufnehmen(a3));	
		System.out.println(pb);
		System.out.println(pb.gehaltsListe());
		File file = new File("C:\\scratch\\test.ser");
		try {
			pb.loadMitarbeiter(file);
		} catch (PersonalbueroException e) {
			System.out.println(e.getMessage());
		}
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

//		System.out.println("\nTestfaelle zum Erzeugen neuer Mitarbeiter-Objekte");
//		System.out.println("=================================================");
//		System.out.println("\nEs folgt Mitarbeiter m2 ohne Namen:");
//		System.out.println("===================================");
//		Mitarbeiter m2 = new Mitarbeiter("", Year.now().plusYears(1), Year.now().plusYears(1), 0);
//		System.out.println(m2);
//		System.out.println("Eintrittsjahr: " + m2.getEintrJahr());
//		System.out.println("\nEs folgt Mitarbeiter m9 Hansi:");
//		System.out.println("==============================");
//		Mitarbeiter m9 = new Mitarbeiter("Hansi", Year.now().minusYears(40), Year.now().minusYears(10), 1500);
//		System.out.println(m9);
//		System.out.println("Eintrittsjahr: " + m9.getEintrJahr());

//		System.out.println("\n\nTestfaelle zum Aufnehmen neuer Mitarbeiter ins Personalbuero");
//		System.out.println("============================================================");
//		Personalbuero pb = new Personalbuero();
//		System.out.println("\nEs folgt Testfall tf_pb_aufnehmen_01:");
//		System.out.println(pb.aufnehmen(null)); // Testfall tf_pb_aufnehmen_01
//		System.out.println("\nEs folgt Testfall tf_pb_aufnehmen_02:");
//		System.out.println(pb.aufnehmen(m2));   // Testfall tf_pb_aufnehmen_02
//		System.out.println("\nEs folgt Testfall tf_pb_aufnehmen_03:");
//		System.out.println(pb.aufnehmen(m9));	// Testfall tf_pb_aufnehmen_03
//		System.out.println(pb.gehaltsListe());
//
//		System.out.println("\n\nTestfaelle zu pb.zaehlenAlter()");
//		System.out.println("==============================");
//		System.out.println("\nEs folgt Testfall zaehlenAlter(-1):");
//		System.out.println(pb.zaehlenAlter(-1));
//		System.out.println("\nEs folgt Testfall zaehlenAlter(17):");
//		System.out.println(pb.zaehlenAlter(17));
//		System.out.println("\nEs folgt Testfall zaehlenAlter(39):");
//		System.out.println(pb.zaehlenAlter(39));
//		System.out.println("\nEs folgt Testfall zaehlenAlter(39) mit m10:");
//		Mitarbeiter m10 = new Mitarbeiter("Hubert", Year.now().minusYears(40), Year.now().minusYears(10), 1400);
//		System.out.println(m10);
//		System.out.println("Alter: " + m10.berechneAlter());
//		System.out.println(pb.aufnehmen(m10));
//		System.out.println(pb.zaehlenAlter(39));
//		System.out.println("\nEs folgt Testfall zaehlenAlter(14):");
//		System.out.println(pb.zaehlenAlter(14));
//		System.out.println(pb.gehaltsListe());
//
//		System.out.println("\n\nTestfaelle zu pb.topVerdiener()");
//		System.out.println("===============================");
//		System.out.println(pb.topVerdiener());
//		System.out.println("\nEs folgt Testfall pb.topVerdiener() mit m11:");
//		Mitarbeiter m11 = new Mitarbeiter("Heribert", Year.now().minusYears(40), Year.now().minusYears(10), 1500);
//		System.out.println(m11);
//		System.out.println("Gehalt: " + m11.getGehalt());
//		System.out.println(pb.aufnehmen(m11));
//		System.out.println(pb.topVerdiener());
//		System.out.println("\nEs folgt Testfall pb.topVerdiener() mit m12:");
//		Mitarbeiter m12 = new Mitarbeiter("Harkon", Year.now().minusYears(40), Year.now().minusYears(10), 1501);
//		System.out.println(m12);
//		System.out.println("Gehalt: " + m12.getGehalt());
//		System.out.println(pb.aufnehmen(m12));
//		System.out.println(pb.topVerdiener());
//
//		System.out.println("\n\nTestfaelle zu pb.gehaltsErhoehung()");
//		System.out.println("===================================");
//		System.out.println(pb.gehaltsListe());
//		System.out.println("\nEs folgt Testfall pb.gehaltsErhoehung(0):");
//		pb.gehaltsErhoehung(0);
//		System.out.println(pb.gehaltsListe());
//		System.out.println("\nEs folgt Testfall pb.gehaltsErhoehung(1001):");
//		pb.gehaltsErhoehung(1001);
//		System.out.println(pb.gehaltsListe());
//		System.out.println("\nEs folgt Testfall pb.gehaltsErhoehung(10):");
//		pb.gehaltsErhoehung(10);
//		System.out.println(pb.gehaltsListe());
//
//		System.out.println("\n\nTestfaelle zu pb.entlassen()");
//		System.out.println("===================================");
//		System.out.println(pb);
//		System.out.println("\nEs folgt Testfall pb.entlassen(null):");
//		System.out.println(pb.entlassen(null));
//		System.out.println(pb);
//		System.out.println("\nEs folgt Testfall pb.entlassen(\"\"):");
//		System.out.println(pb.entlassen(""));
//		System.out.println(pb);
//		System.out.println("\nEs folgt Testfall pb.entlassen(\"Hansi\"):");
//		System.out.println(pb.entlassen("Hansi"));
//		System.out.println(pb);
//		System.out.println("\nEs folgt Testfall 1 zu pb.entlassen(\"Tagesloehner\"):");
//		Mitarbeiter m13 = new Mitarbeiter("Tagesloehner", Year.now().minusYears(20), Year.now(), 100);
//		System.out.println("Name Mitarbeiter (m13): " + m13.getName());
//		System.out.println(pb.aufnehmen(m13));
//		System.out.println(pb);
//		System.out.println(pb.entlassen("Tagesloehner"));
//		System.out.println(pb);
//		System.out.println("\nEs folgt Testfall 2 zu pb.entlassen(\"Tagesloehner\"):");
//		System.out.println(pb.entlassen("Tagesloehner"));
//		System.out.println(pb);
//		System.out.println("\nEs folgt Testfall 3 zu pb.entlassen(\"Tagesloehner\"):");
//		System.out.println(pb.entlassen("Tagesloehner"));
//		System.out.println(pb);
//
//		System.out.println("\n\nTestfall zu pb.toString()");
//		System.out.println("=========================");
//		System.out.println(pb);
//		System.out.println(pb.entlassen("Harkon"));
//		System.out.println(pb);
//		System.out.println(pb.entlassen(1));
//		System.out.println(pb);
//		System.out.println(pb.entlassen(0));
//		System.out.println(pb);
	}
}
