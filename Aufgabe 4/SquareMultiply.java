public class SquareMultiply
{
    double x=1;
    private double y=1;
    double n=0;
    double j;
    Counter powerCounter=new Counter();
    Counter fastPowerCounter=new Counter();

    public double power(double n, double x)
    {
        for(int i=0;i<n;i++)
        {
            y=y*x;
            powerCounter.increment();
        }
        System.out.println(y);
        System.out.println("Multiplikationen: "+powerCounter.get());
        return y;
    }
    public double fastPower(int n, double x)
    {
        y=1;
        
        while(n!=0)
        {
            if(n%2!=0)
            {
                y=y*x;
                fastPowerCounter.increment();
            }
            x=x*x;
            fastPowerCounter.increment();
            n=n/2;
            fastPowerCounter.increment();
        }
        System.out.println(y);
        System.out.println("Multiplikationen: "+fastPowerCounter.get());
        return y;
    }
    public void reset()
    {
        powerCounter.reset();
        fastPowerCounter.reset();
    }
    public int getPowerCounter()
    {
        return powerCounter.get();
    }
    public int getFastPowerCounter()
    {
        return fastPowerCounter.get();
    }
}