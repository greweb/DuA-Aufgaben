public class PowerFunctionsTest 
{
    public static void main(String[] args) 
    {
        double savestate1=0;
        double savestate2=0;
        double savestate3=0;
        double savestate4=0;
        SquareMultiply functionTest=new SquareMultiply();
        for(int i=0;i<=10000;i++)
        {
            double temp =Math.random()*1000;
            int n=(int)temp;
            double x=Math.random();
            savestate1=savestate1+n;
            savestate2=savestate2+x;
            functionTest.power(n,x);
            savestate3=savestate3+functionTest.getPowerCounter();
            functionTest.fastPower(n, x);
            savestate4=savestate4+functionTest.getFastPowerCounter();
            functionTest.reset();
            
        }
        System.out.println("N:"+savestate1/10000);
        System.out.println("X:"+savestate2/10000);
        System.out.println("Multi power:"+savestate3/10000);
        System.out.println("Multi fastPower:"+savestate4/10000);

    }
}
