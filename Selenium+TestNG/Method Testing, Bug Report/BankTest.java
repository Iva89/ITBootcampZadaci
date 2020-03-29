package itbootcamp.zadatak0316;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest {
	private Bank b;// jedno polje klase banka i taj objekat imamo tu u polju
	// ne static jer cemo ga koristiti samo u ovoj klasi
	// posle se moze koristiti u bilo kojoj anotaciji
	private Account a;
	private SoftAssert sa;
	private Account a1;

	@BeforeClass
	public void pocetak() {
		b = new Bank();
		a = new Account("Mina");
		a1 = new Account("Bole", "22345");
		sa = new SoftAssert();
	}

	@Test
	public void testBankConstructor() {
		List<Account> accounts = new ArrayList<>();
		Assert.assertEquals(accounts.isEmpty(), true);
	}

	@Test
	public void testSumMoney() {
		b.reset();
		Account rac1 = b.openAccount("Boskic");
		rac1.setAmount(200.00);
		Account rac2 = b.openAccount("Koki");
		rac2.setAmount(10000.00);
		Account rac3 = b.openAccount("Kaka");
		rac3.setAmount(10000.00);
		double suma = b.getSumMoney();
		Assert.assertEquals(suma, 20200.0);
	}

	@Test
	public void testOpenAccount() {
		String AccNum1 = b.openAccount("Zika").getNumber();
		String AccNum2 = b.openAccount("Mika").getNumber();
		String AccNum3 = b.openAccount("Pera").getNumber();
		String AccNum4 = b.openAccount("Miki").getNumber();
		String AccNum5 = b.openAccount("Paja").getNumber();
		sa.assertEquals(b.getAccount(AccNum1).getNumber(), AccNum1);
		sa.assertEquals(b.getAccount(AccNum2).getNumber(), AccNum2);
		sa.assertEquals(b.getAccount(AccNum3).getNumber(), AccNum3);
		sa.assertEquals(b.getAccount(AccNum4).getNumber(), AccNum4);
		sa.assertEquals(b.getAccount(AccNum5).getNumber(), AccNum5);
		

	}

	@Test // daju nam info da li je test prosao ili nije
	public void testTransfer() {
		Bank mobi = new Bank();

		Account a3 = mobi.openAccount("Ivana");
		Account a2 = mobi.openAccount("Milica");

		a3.setAmount(10000.0);

		mobi.transferMoney(a3.getNumber(), a2.getNumber(), 1000.0);
		// a1 treba da bude 9000, a2 1000
		double izn1 = a3.getAmount();
		double izn2 = a2.getAmount();
		Assert.assertEquals(izn1, 9000.0);
		Assert.assertEquals(izn2, 1000.0);

	}

	@Test
	public void testPayInMoney() {
		Double iznos = a.getAmount();
		String brRacuna = a.getNumber();

		b.payInMoney(brRacuna, 10500.00);
		sa.assertEquals(iznos + 10500.00, a.getAmount());

	}

	@Test
	public void testGetAccount() {
		String provera = a1.getNumber();
		sa.assertEquals(b.getAccount(provera), provera);

	}

}
