package Day6;
class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread Finished");
    }
}
public class TerminatedState {
    public static void main(String[] args) {
        MyThread2 t1=new MyThread2();
        t1.start();
        try {
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println("Thread Interupted :"+e.getMessage());
        }
        System.out.println("State :"+t1.getState());
    }
}
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;
            }

            if ((long) mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}