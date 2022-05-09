public class Sorter 
{
    int numbers[]={0,0,0,0,0,0,0,0};
    public void Split(int numbers[])
    {
        numbers = this.numbers;
        int partOne[int(numbers.length/2)];
        int partTwo[int(numbers.lenght/2)];
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
    public void Sort()
    {

    }   
    public void Merge()
    {

    }
}
