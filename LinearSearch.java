
package Array;
import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int size = scan.nextInt();
        int[] array = new int[size];
        //Element enter by user
        System.out.println("Enter the element");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = scan.nextInt();
        }
        //Enter element to search
        System.out.println("Enter the Element to search in the array");
        int searchElement = scan.nextInt();
        boolean found = false;
        int position = -1;
        //search ana element
        for(int i = 0; i < array.length; i++)
        {
          if(array[i] == searchElement)
          {
              found = true;
              position = i;
              break;
          }
            
        }
        if(found)
        {
            System.out.println("The Element present at position "+ position);
        }
        else 
        {
            System.out.println("Element Not Found");
        }
        
        
        
        
    }
    
}
