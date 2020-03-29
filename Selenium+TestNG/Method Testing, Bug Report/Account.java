package itbootcamp.zadatak0316;

import java.util.UUID;

public class Account {
	private String number;
    private String name;
    private Double amount;

    public Account(String name, String number){
        this.number=number;
        this.name=name;
        this.amount=0d;//ovde je bio bug, vrednost je bila postavljena na 1d
    }

    public Account(String name){
        this(name,UUID.randomUUID().toString());//ispravno
    }

    public String getNumber() {//ispravno
        return number;
    }

    public String getName() {//ispravno
        return name;
    }


    public Double getAmount() {//ispravno
        return amount;
    }

    public void setAmount(Double amount) {//ispravno
        this.amount = amount;
    }

    @Override
    public String toString() {//bug, razmaci su bili space umesto tab
        return String.format("%s%s%s%s%.2f",number,"\t",name,"\t",amount);
    }
}

