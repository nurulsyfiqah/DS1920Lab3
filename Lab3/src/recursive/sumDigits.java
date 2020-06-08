package recursive;
import java.util.Scanner;

public class sumDigits {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number : ");
        int num = sc.nextInt();
        System.out.println("The sum digits of the number is "+sumDigits(num));
    }

    public static int sumDigits(int num){
        if(num<10){
            return num;
        }
        return(sumDigits(num/10))+num%10;
    }
}
