package recursive;
import java.util.*;

public class factorial {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("The program will find the factorial");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("The factorial for the number "+num+" is "+factorial(num));

    }

    public static int factorial (int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

}
