import java.util.Scanner;
public class LinearSearch {

    public static int linearsearch(int[] array,int element)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == element)
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    int size = sc.nextInt();
    int array[] = new int[size];
    System.out.println("Enter the Array");
    for(int i = 0; i < array.length; i++)
    {
       array[i] = sc.nextInt();
    }
  System.out.println("Enter the element you want to search");
  int element = sc.nextInt();
 int elem = linearsearch(array,element);
 if(elem == 0)
 {
    System.out.println("Element not found");
 }
 else
 {
    System.out.println("Element found at index: " + elem);
 }
    }
    
}
