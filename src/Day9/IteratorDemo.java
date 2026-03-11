package Day9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class IteratorDemo {
    public static void main(String[] args) {
        //Insert elements in an ArrayList in one Line
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        System.out.println("Using Iterator :");
        Iterator<Integer> itr=list.iterator();
        //Treaverse in forward direction
        //hasNext()->Check next node is available or not
        //next()-> shift to the next node after printing the current node
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
