public class Sorter 
{
    public Comparable[] mergesort(Comparable numbers[])
    {
        
    	Comparable[] partOne = new Comparable[numbers.length/2];

    	Comparable[] arrayback = new Comparable[numbers.length];
    	Comparable[] partTwo;
        if (numbers.length%2 == 1) {
            partTwo = new Comparable[(numbers.length/2)+1];
        }
        else {
            partTwo = new Comparable[(numbers.length/2)];
        }
        int j=0;
        for(int i=0;i<numbers.length;i++)
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
        if (partOne.length>=2){
        	partOne = mergesort(partOne);
        }
        if(partTwo.length>=2){
        	partTwo = mergesort(partTwo);
        } 	
        
        	//merge
    	int x = 0;
    	int y = 0;
    	int z = 0;
    	while (x+y != numbers.length  ) {

        	//System.out.print(x+" "+y+" "+z+"     ");
    		if (x>(partTwo.length)-1) {
    			arrayback[z] = partOne[y];
    			y++;
    		}
    		else if (y>(partOne.length)-1) {
    			arrayback[z] = partTwo[x];
    			x++;
    		}
    		else if (partTwo[x].compareTo(partOne[y])>0 ) {
    			arrayback[z] = partOne[y];
    			y++;
    		}
    		else {
    			arrayback[z] = partTwo[x];
    			x++;
    		}
    		z++;

        	System.out.println(x+" "+y+" "+z+"     ");
	
        }
    	System.out.println(arrayback[0]+" ");	
    	
		return arrayback;
        
        
        
        
        
        
        
        
    }    
}
