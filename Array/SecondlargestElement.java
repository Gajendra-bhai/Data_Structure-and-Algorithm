import java.util.Scanner;
public class SecondlargestElement {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of an array");
     int size = sc.nextInt();
     int array[] = new int[size];
     System.out.println("Enter the element of an array");
     for(int i = 0; i < array.length; i++)
     {
        array[i] = sc.nextInt();
     }
     int largestElement = -1;
     int SecondlargestElement = -1;
     for(int i = 0; i < array.length; i++)
     {
        if(array[i] > largestElement)
        {
            SecondlargestElement = largestElement;
            largestElement = array[i];
        }
        else if (array[i] > SecondlargestElement && array[i] < largestElement)
         {
            SecondlargestElement = array[i];
            
        }
     }
     System.out.println("The second largest element: "+ SecondlargestElement);
    }

}
