public class Stringanalyse 
{
    String text="";
    String space=" ";
    int counter=0;
    int i=1;
    public int buchstabenanzahl[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
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
        i=1;
        counter=0;
        for(int j=64;j<=128;j++)
            {
                buchstabenanzahl[j]=0;
            }
        text=text.toUpperCase();
        String c=text.substring(0,1);
        char saveChar=c.charAt(0);
        int saveInt=saveChar;
        for(int x=0;x<=(text.length()+1);x++)
        {
            if(c.charAt(0)==saveChar&&i==0)
            {
                i++;
                continue;
            } 
            buchstabenanzahl[c.charAt(0)]=buchstabenanzahl[c.charAt(0)]+1;
            if(c.equals(space))
            {
                counter=counter-1;
                System.out.println(" "+(counter)+" ");
                counter=0;
            }
            else if(x==text.length())
            {
                counter=counter+1;
                System.out.println(" "+(counter-1)+" ");
            }
            if(x==text.length()+1)
                c=text.substring(x-2);
            else if(x!=0)
                c=text.substring(x-1,x);
            counter=counter+1;
        } 
        int counter=0;
        for(int j=64;j<=128;j++)
            {
                if(buchstabenanzahl[j]!=0)
                {
                    if(j==saveInt)
                        buchstabenanzahl[j]-=2;
                    System.out.println((char)j+": "+buchstabenanzahl[j]);
                }
            }
    }
       
}
