import java.util.Scanner;
public class mainString 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        Stringanalyse text=new Stringanalyse();
        String str= scan.nextLine();
        text.setText(str);
        text.getText();
        text.wortanzahl();
    }   
}
