package Lab3;
import java.util.*;
public class Q1meshTopology {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of switches in the campus : ");
        int n = s.nextInt();
        System.out.println("Mesh Topology");
        display(n,meshTopology(n));
    }

    //tail recursion - for computing a formula
    //N(N-1)/2,
    public static int meshTopology(int n){
        if(n==1){
            return 0;
        }
        return n*(n-1)/2;
    }

    public static void display(int n, int total){
        System.out.println("There are "+n+" switches in the campus.");
        System.out.println("The total number of connections required is "+total);
    }
}
