package recursive;
import java.util.*;

public class triangle {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the triangle rows ");
        int num = sc.nextInt();
        System.out.println("The total number of blocks in a triangle is "+triangle(num));

    }

    public static int triangle(int num){
        if(num==0){
            return 0;
        }
        else
            return num + (triangle(num-1));
    }

}
