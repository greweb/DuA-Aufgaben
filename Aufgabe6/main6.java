
public class main6
{
	public static void main(String[] args) 
	{
		Zahlungsmittel geld[] = 
		{
			new USD_Muenze(0.10), new USD_Schein(20),   new SFR_Schein(5),
			new SFR_Muenze(0.50), new USD_Muenze(0.50), new EUR_Schein(50),
			new USD_Schein(100),  new USD_Muenze(0.2),  new USD_Muenze(0.25),
			new EUR_Muenze(0.01), new SFR_Schein(200),  new USD_Schein(100),
			new EUR_Muenze(2),    new EUR_Schein(5),    new USD_Muenze(0.25),
			new SFR_Muenze(0.10), new SFR_Muenze(0.01), new USD_Muenze(0.50),
			new USD_Schein(100),  new USD_Schein(100),  new USD_Muenze(0.2),
			new USD_Muenze(0.01), new SFR_Schein(20),   new SFR_Muenze(0.50),
			new USD_Muenze(0.50), new EUR_Schein(50),   new USD_Schein(5),
			new EUR_Muenze(0.50), new EUR_Muenze(0.01), new SFR_Schein(10),
			new SFR_Schein(20),   new SFR_Muenze(0.50), new SFR_Muenze(0.02)
		};
		int j=0;
		int n=0;
		double[] wert=new double[3];
		double muenzgewicht=0;
		double scheinflaeche=0;
		double muenzstapel=0;
		Zahlungsmittel[] gueltig=new Zahlungsmittel[69];
		for(Zahlungsmittel i : geld)
		{
			if(geld[j].wertIstGueltig()==true)
			{
				gueltig[n]=geld[j];
				System.out.println((n+1)+". Gueltiges Wertgeld: Wert: "+gueltig[n].getWert()+" Waehrung: "+gueltig[n].getWaehrung());
				if(gueltig[n].getWaehrung()=="USD")
				{
					wert[0]+=gueltig[n].getWert();
					if(gueltig[n].getWert()<=1)
					{
						muenzgewicht+=((USD_Muenze) gueltig[n]).getGewicht();
						muenzstapel+=((USD_Muenze)gueltig[n]).getDicke();

					}
					else
					{
						scheinflaeche+=((USD_Schein)gueltig[n]).getBreite()*((USD_Schein)gueltig[n]).getLaenge();
					}
				}
				else if(gueltig[n].getWaehrung()=="EUR")
				{
					wert[1]+=gueltig[n].getWert();
					if(gueltig[n].getWert()<=2)
					{
						muenzgewicht+=((EUR_Muenze) gueltig[n]).getGewicht();
						muenzstapel+=((EUR_Muenze)gueltig[n]).getDicke();
					}
					else
					{
						scheinflaeche+=((EUR_Schein)gueltig[n]).getBreite()*((EUR_Schein)gueltig[n]).getLaenge();
					}
				}
				else if(gueltig[n].getWaehrung()=="SFR")
				{
					wert[2]+=gueltig[n].getWert();
					if(gueltig[n].getWert()<=5)
					{
						muenzgewicht+=((SFR_Muenze) gueltig[n]).getGewicht();
						muenzstapel+=((SFR_Muenze)gueltig[n]).getDicke();
					}
					else
					{
						scheinflaeche+=((SFR_Schein)gueltig[n]).getBreite()*((SFR_Schein)gueltig[n]).getLaenge();
					}
				}
				n++;
			}
			j++;
		}
		System.out.println("Gesamtwerte: USD: "+wert[0]+" EUR: "+wert[1]+" SFR: "+wert[2]);
		System.out.println("Gesamtflaeche:"+scheinflaeche+" Gesamtgewicht:"+muenzgewicht);
		System.out.println("Muenzstapel:"+muenzstapel+"cm");
	}
}

