package itbootcamp.zadatak0316;

import java.text.DecimalFormat;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AccountTest {

	private Account a;
	private SoftAssert sa;
	private SoftAssert sa1;
	private Account a1;

	@BeforeClass
	public void pocetak() {
		a = new Account("Mila");
		a1 = new Account("Bole", "12345");
		sa = new SoftAssert();
		sa1 = new SoftAssert();
	}

	@Test
	public void testKonstruktor() {
		String ime = "Ivana";
		String broj = "3254688";

		Account racun = new Account(ime, broj);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getName(), "Ivana");
		// moze i ime umesto ivana tj ime promenljive koju prosledjujemo
		sa.assertEquals(racun.getNumber(), broj);
		sa.assertEquals(racun.getAmount(), 0d);// fail
		// ocekivao je 0, a vratio 1, bug u klasi
		// greske mogu biti u konstruktoru, ali i u svim ostalim
		// metodama koje se koriste u testu, npr getName

		sa.assertAll();
	}

	@Test
	public void testGetName() {
		Assert.assertEquals(a.getName(), "Mila");
	}

	@Test
	public void testGetNumber() {
		Assert.assertEquals(a1.getNumber(), "12345");
	}

	@Test
	public void testGetAmount() {
		a1.setAmount(200d);
		sa.assertEquals(a1.getAmount(), 200d);
		sa.assertAll();
	}

	@Test
	public void testAccountNumber() {

		Account[] racuni = new Account[100];

		for (int i = 0; i < racuni.length; i++) {
			racuni[i] = new Account("Pera"); // kreiranje 100 racuna
			// svi imaju ime pera ali to nije bitno
		}

		SoftAssert sa = new SoftAssert();

		for (int i = 0; i < racuni.length; i++) {// ovde moze i length -1
			String broj = racuni[i].getNumber();
			for (int j = i + 1; j < racuni.length; j++) {
				sa.assertNotEquals(broj, racuni[j].getNumber());
				// ako hocemo da napusti petlju posle prvog pronadjenog
				// neslaganja, onda staticka Assert, koja tako funkcionise

			}
		}

		sa.assertAll();

	}

	@Test
	public void testSetAmount() {

		Account a = new Account("Ivana", "12545");

		a.setAmount(12000.222);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a.getAmount(), 12000.222);

	}

	@Test
	public void testToString() {
		// Ocekivani format ispisa: broj<tab>ime<tab>stanje. Stanje treba da bude zaokruženo na dve decimale.
		DecimalFormat df = new DecimalFormat ("###.00");
		String s1 = a1.toString();
		String s2 = a1.getNumber()+ "\t" +a1.getName() + "\t" + df.format(a1.getAmount()); 
		sa1.assertEquals(s1, s2);
		sa1.assertAll();
	}
}
