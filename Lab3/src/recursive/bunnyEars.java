package recursive;
import java.util.Scanner;

public class bunnyEars {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bunny : ");
        int num = sc.nextInt();
        System.out.println("The total of bunny ears are "+bunnyEars(num));
    }

    public static int bunnyEars(int num){
        if(num==0){
            return 0;
        }
        if(num % 2 == 1){
            return 2 +bunnyEars(num-1);
        }
        return 3 + bunnyEars(num-1);
    }

}
