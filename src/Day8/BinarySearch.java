package Day8;
//Performed always on Sorted Array->Divide and Conquer technique
//Best->O(1)  Worst->O(log n)  Average-> O(log n)
//Space->O(1)
public class BinarySearch {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10,12,14,16,18};
        int target=19;
        int low=0;
        int high=arr.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        if(index!=-1){
            System.out.println("Element "+target +" found at "+index);
        }
        else{
            System.out.println("target Not found");
        }
    }
}
