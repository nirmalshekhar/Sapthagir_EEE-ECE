package Day8;
//linear search is performed on both sorted and unsorted array
//Time-> O(n)   space-> O(1)
public class LinearSearch {
    public static void main(String[] args) {
        int []arr={18,7,45,77,17,1};
        int target =17;
        boolean found=false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if(found){
            System.out.println("Element "+target+ "found at index "+index);
        }
        else {
            System.out.println("Element "+target +"Not found");
        }

    }
}
