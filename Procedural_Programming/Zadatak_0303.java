package itbootcamp.domaci0303;

import java.util.Scanner;

public class Zadatak_0303 {

	      //Ovaj kod predstavlja kalkulator povrsina 
	    //kvadrata, pravougaonika i kruga.
	    //Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
	    //Ukoliko se unese 'izadji', program treba da se zavrsi.
	    //Program treba da se ponavlja dokle god se ne unese izadji.

	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        String figura;
	    
	        while(true) {
	            figura=sc.nextLine();
	            switch(figura) { //fali break u case-evima, da bi se korisnik vracao na petlju (dok ne unese izadji)
	            case "kvadrat":racunajKvadrat();
	            case "pravougaionik":racunajPravougaonik();//mozda je slucajno, ali slovna greska u nazivu case-a - pravougaionik
	            case "krug":racunajKrug();            
	            case "izadji":return;
	            }
	        }
	    }

	    public static void racunajKrug() {
	    	Scanner sc= new Scanner(System.in);// nije greska, ali Scanner je mogao da se prosledi posto je vec definisan u main-u, da se izbegne ponovno definisanje
	        double r;
	        r=sc.nextDouble();
	        if(r<=0) { System.out.println("Los unos!");return;}
	        System.out.println("Povrsina pravougaionika je: "+pKruga(r));//pogresan ispis - pravougaionika, definitivno nije slucajno :), metoda radi povrsinu kruga
	    }

	    public static void racunajPravougaonik() {
	        Scanner sc= new Scanner(System.in);// nije greska, ali Scanner je mogao da se prosledi posto je vec definisan u main-u, da se izbegne ponovno definisanje
	        double a, b;
	        a=sc.nextDouble();
	        b=sc.nextDouble();
	        if(a<=0 || b<=0) { System.out.println("Los unos!");return;}
	        System.out.println("Povrsina pravougaionika je: "+pPravougaonika(a, b));//slovna greska - pravougaionika, ali nije bitno posto je u pitanju samo ispis stringa
	        
	    }

	    public static void racunajKvadrat() {
	        Scanner sc= new Scanner(System.in);// nije greska, ali Scanner je mogao da se prosledi posto je vec definisan u main-u, da se izbegne ponovno definisanje
	        double a;
	        a=sc.nextDouble();
	        if(a<=0) { System.out.println("Los unos!");return;}
	        System.out.println("Povrsina kvadrata je: "+pKruga(a));//pogresna metoda-za krug
	        
	    }
	    public static double pKruga(double r) {
	        return r*r*3.14;
	    }
	    public static double pKvadrata(int a) {//pogresan tip promenljive koja se prosledjuje
	        return a*a*a;//pogresna formula
	    }
	    public static double pPravougaonika(double a, double b) {
	        return a*b;
	    }


	}


