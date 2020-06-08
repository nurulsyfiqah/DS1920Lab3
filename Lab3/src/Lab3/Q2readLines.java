package Lab3;
import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Q2readLines {

        static String str1 = "";

    public static void main(String[] args){

        String str = "";

        try{
            Scanner a = new Scanner(new FileInputStream("D:\\SOFTWARE ENGINE SEM 2\\WIA1002 - Data Structure\\Lab\\Lab3\\hey.txt"));

            System.out.println("Line from the File");
            System.out.println(readLine(a));

            a.close();

        }catch (FileNotFoundException e){
            System.out.println("File is not found");
        }

        //write in another file
        try{
            PrintWriter b = new PrintWriter(new FileOutputStream("D:\\SOFTWARE ENGINE SEM 2\\WIA1002 - Data Structure\\Lab\\Lab3\\newHey.txt"));
            b.write(reverseString(str1));

            b.close();
        }catch(IOException e){
            System.out.println("Problem with the file");
        }

        //checking the reverse file
        try{
            Scanner c = new Scanner(new FileInputStream("D:\\SOFTWARE ENGINE SEM 2\\WIA1002 - Data Structure\\Lab\\Lab3\\newHey.txt"));

            System.out.println("\n");
            System.out.println("Line from the reverse File\n");
            while(c.hasNextLine()){
                //displaying the original sentence
                str1 = c.nextLine();
                System.out.println(str1);

            }

            c.close();
        }catch (FileNotFoundException e){
            System.out.println("File is not found");
        }
    }

    public static String reverseString(String myStr)
    {
        if (myStr.isEmpty()){
            return myStr;
        }
        //Calling Function Recursively
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }

    public static String readLine(Scanner str){

        if(str.hasNextLine()){
            String line = str.nextLine();
            str1 += "\n";
            str1 += line;
            readLine(str);
        }
        return str1;
    }

}


