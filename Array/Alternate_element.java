import java.util.Scanner;
public class Alternate_element {

    public static void main(String[] args) 
    {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of an array");
  int arr_size = sc.nextInt();
  int array[] = new int[arr_size];
  for(int i = 0; i < arr_size;i++)
  {
    array[i] = sc.nextInt();
  }
  //Print Alternate Element

  for(int i = 0; i < arr_size; i+=2)
  {
    System.out.println(array[i]);
  }
        
    }
}