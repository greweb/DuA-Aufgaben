
public class USD_Schein extends USD implements Schein {
	private eigenschaften x;
		
	public USD_Schein(double wert) {
		super(wert);
		x=select(wert);
	}
	public boolean wertIstGueltig() {
		return x!=null;
	}

	public double getLaenge() {
		return (x!=null) ? x.laenge : 0;
	}
	
	public double getBreite() {
		return (x!=null) ? x.breite : 0;
	}
	
	
	private eigenschaften select(double wert) {
	   final eigenschaften daten[] = {new eigenschaften(  1, 155.81, 66.42),
                                          new eigenschaften(  2, 155.81, 66.42),
                                          new eigenschaften(  5, 155.81, 66.42),
                                          new eigenschaften( 10, 155.81, 66.42),
                                          new eigenschaften( 20, 155.81, 66.42),
                                          new eigenschaften( 50, 155.81, 66.42),
                                          new eigenschaften(100, 155.81, 66.42)};
	   for (eigenschaften x:daten)
	      if (getWert()==x.wert)
	        return x;
	   return null;
	}
	
	@Override
	public int compareTo(Zahlungsmittel o) {
		if (o.getWaehrung() == "USD") {

			if (o.getWert() <= 1) {

				if (x.breite > ((USD_Muenze) o).getDurchmesser()) {
					return 1;
				} else if (x.breite < ((USD_Muenze) o).getDurchmesser()) {
					return -1;
				}
				return 0;
			}

			else {
				if (x.breite > ((USD_Schein) o).getBreite()) {
					return 1;
				} else if (x.breite < ((USD_Schein) o).getBreite()) {
					return -1;
				}
				return 0;
			}
		}

		else if (o.getWaehrung() == "EUR") {

			if (o.getWert() <= 2) {
				if (x.breite > ((EUR_Muenze) o).getDurchmesser()) {
					return 1;
				} else if (x.breite < ((EUR_Muenze) o).getDurchmesser()) {
					return -1;
				}
				return 0;
			} else {
				if (x.breite > ((EUR_Schein) o).getBreite()) {
					return 1;
				} else if (x.breite < ((EUR_Schein) o).getBreite()) {
					return -1;
				}
				return 0;
			}
		} else if (o.getWaehrung() == "SFR") {

			if (o.getWert() <= 5) {
				if (x.breite > ((SFR_Muenze) o).getDurchmesser()) {
					return 1;
				} else if (x.breite < ((SFR_Muenze) o).getDurchmesser()) {
					return -1;
				}
			}else {
				if (x.breite > ((SFR_Schein) o).getBreite()) {
					return 1;
				} else if (x.breite < ((SFR_Schein) o).getBreite()) {
					return -1;
				}
				return 0;
			}
		}
		return 0;
	}
}
