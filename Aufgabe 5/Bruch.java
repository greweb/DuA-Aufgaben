public class Bruch implements Comparable<Bruch>
{
    private double zaehler;
    private double nenner;
    private double u=1;
    private double sum=0;
    private double n=1;
    private double eule=1;
    public Bruch(double pzaehler, double pnenner)
    {
        zaehler=pzaehler;
        nenner=pnenner;
    }
    public void add(Bruch x,Bruch y)
    {
        for(int i=1;i<=1000000000;i++)//kleinster gemeinsamer teiler finden
        {
            if(i%y.nenner == 0 && i%x.nenner == 0)
            {
                y.zaehler=y.zaehler*(i/y.nenner);
                y.nenner=i;
                x.zaehler=x.zaehler*(i/x.nenner);
                x.nenner=i;
                y.zaehler=y.zaehler+x.zaehler;
                break;
            }
        }   
    }
    public String get() 
    {
        return (zaehler+"/"+nenner);
    }
    public Bruch summe()
    {
        Bruch summe=new Bruch(1.0,u);
        for(int u=1;u<=20;u++)
        {
            System.out.println(summe.nenner+"/"+summe.zaehler);
            sum=sum+(summe.nenner/summe.zaehler);
            summe.add(summe,summe);
        }
        System.out.println("Summe:"+sum);
        return summe;
    }
    public Bruch euler()
    {
        Bruch eulisch=new Bruch(1.0,n);
        for(n=1;n<=20000;n++)
        {
            for(double i=1;i<=n;i++)
            {
                eulisch.nenner=eulisch.nenner*i;
            }
            eule=eule+(1.0/eulisch.nenner);
            eulisch.nenner=1;
        }
        System.out.println("Eulerische Zahl:"+eule);
        return eulisch;
    }
	public int compareTo(Bruch o) {
		if  (zaehler/nenner > o.zaehler/o.nenner) {
			return 1;
		}
		else if((zaehler/nenner < o.zaehler/o.nenner)) {
			return -1;
		}
		else {
		return 0;
		}
	}
}

