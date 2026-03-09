package Day7;

public class MinElement {
    public static void main(String[] args) {
        int []nums={18,10,1,77,45,17};
        //Assume first element is max
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min){
                min=nums[i];//Update max if current element is smaller than min
            }
        }
        System.out.println("Miniimum Element :"+min);
    }
}
