public abstract class USD extends Zahlungsmittel {
   protected USD(double wert) {
	   super("USD", wert);
   }
   public abstract boolean wertIstGueltig();
}

