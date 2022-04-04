public class Brueche
{
    public static void main(String[] args) 
    {
        Bruch x =new Bruch(4,3);
        Bruch y=new Bruch(2,3);
        y.add(x,y);
        System.out.println("y:"+y.get());
        System.out.println("Summe?:"+y.summe());
    }
}