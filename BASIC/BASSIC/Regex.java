import java.util.*;
public class Regex {
    public static void main(String[] args){

         String input = "apple  orange,banana  buoi";
         String[] fruits = input.split("\s+");
         System.out.println(Arrays.toString(fruits));   
         
    }
    
}
