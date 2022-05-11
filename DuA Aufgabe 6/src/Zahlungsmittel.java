
public abstract class Zahlungsmittel
{
	String waehrung;
	double wert;
	public String getWaehrung()
	{
		return waehrung;
	}
	public double getWert()
	{
		return wert;
	}
	public abstract boolean wertIstGueltig();
}
