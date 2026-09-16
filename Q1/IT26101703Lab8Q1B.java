import java.util.Scanner;

public class IT26101703Lab8Q1B {
    public static void main(String[] args) {
        int[] myArray = new int[5];
		int[] evenArray = new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 5 Numbers:");
		for (int count = 0; count < myArray.length; count++) {
            System.out.print("Enter Number " + (count + 1) + ": ");
            myArray[count] = input.nextInt();
        }
		int evenIndex = 0;
		 for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            }
        }
		 System.out.println();
        System.out.println("myArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }
		System.out.println();
		System.out.println("evenArray Contents:");
		for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }

        input.close();
	}
}