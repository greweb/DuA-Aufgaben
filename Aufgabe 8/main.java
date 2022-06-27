import java.util.*;  
import java.util.Queue;
import java.util.Stack;

public class main
{
    public static void main(String[] args) 
    {
        List<String> li = new LinkedList<String>();
        li.add("Montag");
        li.add("Dienstag");
        li.add("Mittwoch");
        li.add("Donnerstag");
        li.add("Freitag");
        li.add("Samstag");
        li.add("Sonntag");

        Set<String> ts1 = new TreeSet<>();
        ts1.add(li.get(0));
        ts1.add(li.get(1));
        ts1.add(li.get(2));
        ts1.add(li.get(3));
        ts1.add(li.get(4));
        ts1.add(li.get(5));
        ts1.add(li.get(6));
        for(String value : ts1)
        {
            System.out.println(value);
        } 

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(6, li.get(0));
        ht1.put(5, li.get(1));
        ht1.put(4, li.get(2));
        ht1.put(3, li.get(3));
        ht1.put(2, li.get(4));
        ht1.put(1, li.get(5));
        ht1.put(0, li.get(6));
        System.out.println("\nList:");
        for(String i:li)
        {
            System.out.println(i);
        }
        System.out.println("\nHash:");
        Set<Integer> setOfKeys = ht1.keySet();
        for(Integer key : setOfKeys)
        {
            System.out.println(ht1.get(key));
        }
        System.out.println("Jeder Zweite mit Hash");
        for(int i=setOfKeys.size()-1;i>=0;i=i-2)
        {
            System.out.println(ht1.get(i));
        }
        System.out.println("Jeder Zweite mit List");
        for(int i=0;i<=li.size();i=i+2)
        {
            System.out.println(li.get(i));
        }
        System.out.println("Jeder Zweite mit Tree");
        boolean checker=true;
        for(String value:ts1)
        {
            if(checker==false)
            {
                checker=true;
            }
            else
            {
                System.out.println(value);
                checker=false;
            }
        }
        int counter=0;
        ArrayList<Integer> prim = new ArrayList<Integer>();
        int max=1000;
        for(int i=2;i<=max;i++)
        {
            prim.add(i);
        }
        int n=1000;
        List<Integer> primes = new ArrayList<Integer>();
        boolean[] isPrimeNumber = new boolean[n + 1];
        for (int i = 2; i < n; i++) 
        {
            //set all numbers from 2 to n as primes. The filters in the following statement will correct this
            isPrimeNumber[i] = true;
        }
        for (int i = 2; i < n; i++) 
        {
            //All of the primes numbers will be written into the list and all multiples of that prime will be marked as false
            if (isPrimeNumber[i]) 
            {
                primes.add(i);
                // now mark the multiple of i as non-prime number
                for (int j = i; j * i <= n; j++) 
                {
                    isPrimeNumber[i * j] = false;
                }
            }

        }
        for(int value:primes)
        {
            System.out.println(value);
        }
        int previous=-1;
        int previousPrinted=0;
        System.out.println("Paare:");
        for(int value:primes)
        {
            if(value-previous<=2)
                {
                    if(previous!=previousPrinted)
                    {
                        System.out.println(previous);
                    }
                    System.out.println(value);
                    previousPrinted=value;
                }
            previous=value;

        }
    }
}
