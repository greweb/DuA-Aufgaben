public class Stringanalyse 
{
    String text="";
    String space=" ";
    int counter=0;
    int i=1;
    int buchstabenanzahl[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public void setText(String neuerText)
    {
        text=neuerText;
    }
    public String getText()
    {
        System.out.println(text);
        return text;
    }
    public void wortanzahl()
    {
        text=text.toUpperCase();
        String c=text.substring(0,1);
        for(int x=1;x<=(text.length());x++)
        {
            buchstabenanzahl[c.charAt(0)]=buchstabenanzahl[c.charAt(0)]+1;
            if(c.equals(space))
            {
                counter=counter-1;
                System.out.println(" "+counter+" ");
                counter=0;
            }
            else if(x==text.length())
            {
                counter=counter+1;
                System.out.println(" "+counter+" ");
            }
            c=text.substring(x-1,x);
            counter=counter+1;
        } 
        for(int j=64;j<=128;j++)
            {
                if(buchstabenanzahl[j]!=0)
                {
                    System.out.println((char)j+": "+buchstabenanzahl[j]);
                }
            }
    }
       
}
