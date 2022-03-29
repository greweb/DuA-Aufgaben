public class RestrictedCounter extends Counter {

    private int maxCapacity;
    private int capacity;
    

    public RestrictedCounter(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public void increment() 
    { // Hochzählen
        if(x<maxCapacity)
            x++;
        else
            System.out.println("At Full Capacity!");
    }
    public int freeCapacity()
    {
        capacity=maxCapacity-x;
        return capacity;
    }

}