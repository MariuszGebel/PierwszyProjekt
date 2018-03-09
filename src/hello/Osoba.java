package hello;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    // To są zmienne pamiętane w obiektach, na które można mówić:
    // * pola (field)
    // * atrybuty (attribute)
    // * zmienne instancyjne (instance variable)
    String imie, nazwisko;
    LocalDate dataUrodzenia;
    
    // Konstruktory, czyli takie specjalne metody uruchamiane podczas tworzenia obiektu
    Osoba() {
   	
    }
    
    Osoba(String imi, String naz) {
   	 imie = imi;
   	 nazwisko = naz;
    }
    
    Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}

    //dataUrodzenia jako String
    Osoba(String imie, String nazwisko, String dataUrodzenia) {
		// W ten sposob z jednego konstrukora mozemy wywolac inny konstruktor tej samej klasy
    	// Przy tym zapisie this musi by© pierwszá instrukcj w konstruktorze
    	this(imie, nazwisko, LocalDate.parse(dataUrodzenia));
	}
    
	// Metody, czyli czynności, które potrafi wykonywać obiekt
    void przedstawSie() {
   	System.out.println("Nazywam się " + imie + " " + nazwisko);
   	System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + getWiek() + " lat/a");
    }
    
    int getWiek() {
    	LocalDate dzisiaj = LocalDate.now();
    	//liczba lat, miesięcy i dni pomiędzy jedną a drugą datą
    	Period wiekDokladnie = Period.between(dataUrodzenia, dzisiaj);
    	return wiekDokladnie.getYears();    	
    }

    public String toString(){
    	return imie + " " + nazwisko + " " + getWiek() + " lat";
    }
}



