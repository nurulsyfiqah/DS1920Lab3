package Lab3;
import java.time.Period;
import java.util.*;

public class Q3Permutation {

    //HashSet wont return any redundant value because it is a set
    static Set<String> hash_Set = new HashSet<>();
    public static void PermutationNonDup(String str, String ans)
    {
        if (str.length() == 0) {
            hash_Set.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            PermutationNonDup(ros, ans + ch);
        }
    }

    public static void PermutationDup(String str, String ans){
        if(str.length()==0){
            System.out.println(ans+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            PermutationDup(ros,ans+ch);
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String num = "";
        System.out.print("Enter number of elements: ");
        int element = s.nextInt();

        for(int i=0; i<element; i++){
            num += Integer.toString(r.nextInt(10));
        }
        System.out.print("The element of the array with duplication");
        System.out.println(num);
        PermutationDup(num,"");
        System.out.print("The element of the array without duplication: ");
        System.out.println(num);
        PermutationNonDup(num, "");

        // -> = separates the parameters(left) from the implementation(right)
        hash_Set.forEach((n) -> System.out.println(n));
    }
}
