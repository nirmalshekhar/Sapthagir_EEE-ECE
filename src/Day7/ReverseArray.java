package Day7;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //Reverse An Array
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
