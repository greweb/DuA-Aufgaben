
class USD_Muenze extends USD implements Muenze {
	private eigenschaften x;
		
	public USD_Muenze(double wert) {
		super(wert);
		x=select(wert);
	}
	
	public boolean wertIstGueltig() {
		return x!=null;
	}
				
	public double getGewicht() {
	    if (x!=null)
		  return x.gewicht;
	    else
	      return 0;
	}
	
	public double getDurchmesser() {
		if (x!=null)
		  return x.durchmesser;
		else
		  return 0;
		}
	
	public double getDicke() {
		if (x!=null)
		  return x.dicke;
		else
		  return 0;
		}

		
	eigenschaften select(double wert) {
	   final eigenschaften daten[] = {new eigenschaften(0.01,  2.50, 19.05, 1.55),
                                          new eigenschaften(0.05,  5.00, 21.21, 1.95),
                                          new eigenschaften(0.10,  2.27, 19.91, 1.35),
	                                  new eigenschaften(0.25,  5.67, 24.26, 1.75),
                                          new eigenschaften(0.50, 11.34, 30.61, 2.15),
                                          new eigenschaften(1.00,  8.10, 26.50, 2.00)};
	   for (eigenschaften x:daten)
		  if (getWert()==x.wert)
		    return x;
		  return null;
		}
	

	@Override
	public int compareTo(Zahlungsmittel o) {
		if (o.getWaehrung() == "USD") {

			if (o.getWert() <= 1) {

				if (x.durchmesser > ((USD_Muenze) o).getDurchmesser()) {
					return 1;
				} else if (x.durchmesser < ((USD_Muenze) o).getDurchmesser()) {
					return -1;
				}
				return 0;
			}

			else {
				if (x.durchmesser > ((USD_Schein) o).getBreite()) {
					return 1;
				} else if (x.durchmesser < ((USD_Schein) o).getBreite()) {
					return -1;
				}
				return 0;
			}
		}

		else if (o.getWaehrung() == "EUR") {

			if (o.getWert() <= 2) {
				if (x.durchmesser > ((EUR_Muenze) o).getDurchmesser()) {
					return 1;
				} else if (x.durchmesser < ((EUR_Muenze) o).getDurchmesser()) {
					return -1;
				}
				return 0;
			} else {
				if (x.durchmesser > ((EUR_Schein) o).getBreite()) {
					return 1;
				} else if (x.durchmesser < ((EUR_Schein) o).getBreite()) {
					return -1;
				}
				return 0;
			}
		} else if (o.getWaehrung() == "SFR") {

			if (o.getWert() <= 5) {
				if (x.durchmesser > ((SFR_Muenze) o).getDurchmesser()) {
					return 1;
				} else if (x.durchmesser < ((SFR_Muenze) o).getDurchmesser()) {
					return -1;
				}
			}else {
				if (x.durchmesser > ((SFR_Schein) o).getBreite()) {
					return 1;
				} else if (x.durchmesser < ((SFR_Schein) o).getBreite()) {
					return -1;
				}
				return 0;
			}
		}
		return 0;
	}	
}
