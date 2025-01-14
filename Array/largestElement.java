import java.util.Scanner;
public class largestElement {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of an Array");
     int size = sc.nextInt();
     int array[] = new int[size];
     System.out.println("Enter the element of an array");
     for(int i = 0; i < array.length; i++)
     {
        array[i] = sc.nextInt();
     }
     int largest = array[0];
     for(int i = 0; i < array.length; i++)
     {
        if(array[i] > largest)
        {
            largest = array[i];
        }
     }   
     System.out.println("The Largest Element :" + largest);
    }
}
