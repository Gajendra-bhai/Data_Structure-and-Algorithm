public class ThirdLargestelement 
{
    public static void main(String[] args) 
    {
     int array[] = {10,-85,-96,32,15,78,95,26,-500,-02,-563,-200,-89,-100};
     int largestElement = -1;
     int secondLargest = -1;
     int thirdLargest = -1;
     for(int i = 0; i < array.length; i++)
     {
        if(array[i] > largestElement)
        {
            thirdLargest = secondLargest;
            secondLargest = largestElement;
            largestElement = array[i];
            
        }
        else if (array[i] > secondLargest && array[i] < largestElement)
         {
           thirdLargest = secondLargest;
           secondLargest = array[i];    
        }
        else if( array[i] > thirdLargest && array[i]< secondLargest && array[i] < largestElement)
        {
            thirdLargest = array[i];
        }
     } 
     System.out.println("largest Element: "+ largestElement);  
     System.out.println("second Largest Element: "+ secondLargest);
     System.out.println("Third Largest Element: "+ thirdLargest);
    }
    
}
