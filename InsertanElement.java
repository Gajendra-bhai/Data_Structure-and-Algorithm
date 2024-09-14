
package Array;
import java.util.*;

public class InsertanElement 
{
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the size of an element");
       int size = scan.nextInt();
       int array[] = new int[size + 1];
        System.out.println("Enter the element of an array");
        for(int i = 0; i < size; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the element to enter in the element ");
        int element = scan.nextInt();
        System.out.println("Enter the position of an element");
        int position = scan.nextInt();
        if(position > size || position < 0)
        {
            System.out.println("Invalid position");
        }
        else
        {
        for(int i = size; i > position;i--)
        {
           array[i] = array[i-1];
        }
        array[position] = element;
        } 
     for(int i = 0; i <= size ; i++)
     {
         System.out.println(array[i]);
     }
        
        
    }
    
}
