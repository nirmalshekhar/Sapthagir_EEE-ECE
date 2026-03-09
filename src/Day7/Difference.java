package Day7;

public class Difference {
    public static void main(String[] args) {
        int []nums={18,10,1,77,45,17};
        //Assume first element as max and min
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max){
                max=nums[i];//Update max if current element is greater than max
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Difference :"+(max-min));
    }
}
