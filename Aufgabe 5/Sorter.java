public class Sorter 
{
    int numbers[]={0,0,0,0,0,0,0,0};
    int partOne[];
    int partTwo[];
    int n=0;
    int m=0;
    int skippy=0;
    int min=0;
    int max=0;
    public void split(int numbers[])
    {
        numbers = this.numbers;
        int partOne[]=new int[numbers.length/2];
        int partTwo[]=new int[numbers.length/2];
        int j=0;
        for(int i=0;i<=numbers.length;i++)
        {
            if(i<numbers.length/2)
            {
                partOne[i]=numbers[i];
            }
            else
            {
                partTwo[j]=numbers[i];
                j++;
            }
        }
    }
    public void sort()
    {
        if(partOne.length>1)
        {
            if(n>1&&partOne[n]<partOne[n-1]&&m<=numbers.length/2&&skippy==0)
            {
                partOne[m]=partOne[n];
                n++;
                sort();
            }
            else if(m<=numbers.length/2&&skippy==0)
            {
                m++;
                n=0;
                sort();
            }
            else if(m>numbers.length&&skippy==1)
            {
                m=0;
                skippy+=1;
                sort();
            }
            else if(skippy==1&&n>1&&partTwo[n]<partTwo[n-1]&&m<=numbers.length/2)
            {
                partTwo[m]=partTwo[n];
                n++;
                sort();
            }
            else if(skippy==1&&m<=numbers.length/2)
            {
                m++;
                n=0;
                merge();
            }
        }
    }   
    public void merge()
    {

    }
}
