public class Brueche
{
    public static void main(String[] args) 
    {
        Bruch x =new Bruch(4.0,3.0);
        Bruch y=new Bruch(2.0,3.0);
        y.add(x,y);
        System.out.println("y:"+y.get());
        y.summe();
        y.euler();
    }
}