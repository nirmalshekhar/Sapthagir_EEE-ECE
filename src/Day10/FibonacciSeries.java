package Day10;

public class FibonacciSeries {
    public static int fib(int n){
        //Base Case
        if(n==0||n==1){
            return n;
        }
        //Recursive Case
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int terms=10;
        System.out.println("Fibonacci Series");
        for(int i=0;i<terms;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
