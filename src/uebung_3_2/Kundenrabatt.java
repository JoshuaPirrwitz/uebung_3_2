package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
	double Bestellwert = 22000;
	double bisherigesKundenBestellvolumen =11000;
	boolean istPremiumkunde=true;
	double Mengenrabatt=0;
	double Premiumrabatt=0;
	double Treuerabatt=0;
	double Bonusrabatt=0;
	
	

	if (Bestellwert >= 5000) {Mengenrabatt=0.05;}
	else {if (Bestellwert>=2000) {Mengenrabatt=0.03;}
	else {if (Bestellwert>=500) {Mengenrabatt=0.02;}
	else {if (Bestellwert>=100) {Mengenrabatt=0.01;}
	}}}
	if (istPremiumkunde==true) {Premiumrabatt= (Mengenrabatt) * 2;}
	if (bisherigesKundenBestellvolumen>10000) {Treuerabatt = 0.075;}
	else {if (bisherigesKundenBestellvolumen>=50000) {Treuerabatt = 0.12;}}
	
	if (Bestellwert>=2*bisherigesKundenBestellvolumen) {Bonusrabatt = 0.03;}
	
	double Gesamtrabatt= Bonusrabatt+Treuerabatt+Premiumrabatt+Mengenrabatt;
	
	
	if (Gesamtrabatt>0.15 && (istPremiumkunde==false)){Gesamtrabatt=0.15;}
	if (Gesamtrabatt>0.20 && (istPremiumkunde==true)){Gesamtrabatt=0.20;}
	
	System.out.println((1-Gesamtrabatt)*Bestellwert);
	System.out.println(bisherigesKundenBestellvolumen);
	System.out.println(Mengenrabatt);
	System.out.println(Premiumrabatt);
	System.out.println(Treuerabatt);
	System.out.println(Bonusrabatt);
	System.out.println(Gesamtrabatt);

}
	}
