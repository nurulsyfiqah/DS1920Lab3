package Lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5integer {
    public static void main(String[] args) {
        int[] element = new int[5];
        Scanner s = new Scanner(System.in);
        int i = 0;
        while (i <= 5) {
            try {
                System.out.print("Enter an integer : ");
                element[i] = s.nextInt();
                i++;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input type");
                s.nextLine();
            } catch (ArrayIndexOutOfBoundsException f){
                System.out.println("The array of integers is:");
                for (int j = 0; j < element.length; j++) {
                    System.out.print(element[j] + " ");
                }
                break;
            }
        }
    }
}
