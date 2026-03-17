package Day10;
import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        String str1="The classroom";
        String str2="School Master";

        //replaceAll removes all the white space,tab space and newline character from a string
        str1= str1.toLowerCase().replaceAll("\\s","");
        str2= str2.toLowerCase().replaceAll("\\s","");

        //toCharArray converts entire string to an Array
        char[]arr1=str1.toCharArray();
        char []arr2=str2.toCharArray();

        //Sort the Character Array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
}
