package Day7;
import java.util.Arrays;
public class RotateBy1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n=arr.length;//to store length of an array
        int last=arr[n-1];//to store the last element in an variable
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];//Shifting by 1 index
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
