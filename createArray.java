
package Array;
import java.util.Scanner;
public class createArray {

    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
      int size = scan.nextInt();
      int[] array = new int[size];
        System.out.println("Enter the array");
        for(int i = 0;i < array.length; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.println("The Element you entered");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
    }
    
}
