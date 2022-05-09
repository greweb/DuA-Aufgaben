public class Sorter 
{
    int numbers[]={0,0,0,0,0,0,0,0};
    public int Mergesort(int numbers[])
    {
        numbers = this.numbers;
        int partOne[]={};
        int partTwo[]={};
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
        Mergesort();
    }    
}
