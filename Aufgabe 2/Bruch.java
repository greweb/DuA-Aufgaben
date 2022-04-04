public class Bruch
{
    private int zaehler;
    private int nenner;
    private int u=1;
    public Bruch(int pzaehler, int pnenner)
    {
        zaehler=pzaehler;
        nenner=pnenner;
    }
    public void add(Bruch x,Bruch y)
    {
        for(int i=1;i<=100;i++)//kleinster gemeinsamer teiler finden
        {
            if(i%y.nenner==0&&i%x.nenner==0)
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
        Bruch summe=new Bruch(1,u);
        for(int u=1;u<=20;u++)
        {
            System.out.println(summe.nenner+"/"+summe.zaehler);
            summe.add(summe,summe);
        }
        
        return summe;
    }
}

