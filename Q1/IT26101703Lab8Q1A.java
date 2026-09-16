import java.util.Scanner;

public class IT26101703Lab8Q1A {
    public static void main(String[] args) {
        int[] myArray = new int[5]; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 Numbers:");
        
        for (int count = 0; count < myArray.length; count++) {
            System.out.print("Enter Number " + (count + 1) + ": ");
            myArray[count] = input.nextInt();
        }
        
        System.out.println("\nArray in Reverse Order:");
        for (int count = myArray.length - 1; count >= 0; count--) {
            System.out.print(myArray[count] + " ");
        }
        
        input.close();
    }
}		