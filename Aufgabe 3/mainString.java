public class mainString 
{
    public static void main(String[] args) 
    {
        Stringanalyse text=new Stringanalyse();
        for(int i=0;i<args.length;i++)
        {
            String str= args[i];
            text.setText(str);
            text.getText();
            text.wortanzahl();
        }    
    }   
}
