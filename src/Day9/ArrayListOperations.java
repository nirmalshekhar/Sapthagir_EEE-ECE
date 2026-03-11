package Day9;
import java.util.Collections;//Class
import java.util.List;
import java.util.ArrayList;
public class ArrayListOperations {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();//Object of ArrayList class specifyinf the obejct of Integer
        //1.add elements
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("After Adding :"+list1);

        //2.Access element->get()
        System.out.println(list1.get(2));

        //3.Update elements
        list1.set(1,25);
        System.out.println(list1);

        //4. remove elements
        list1.remove(0);//remove by index
        System.out.println(list1);
        list1.remove(Integer.valueOf(30));//remove by value
        System.out.println(list1);

        //5.Check Size
        System.out.println("Size of ArrayList :"+list1.size());

        //6.Search for an element
        System.out.println(list1.contains(25));
        //7.Index of
        System.out.println(list1.indexOf(25));

        //8.sort the list
        Collections.sort(list1);//Collections
        System.out.println(list1);

        //9.clear the list
        list1.clear();
        System.out.println(list1);
    }
}
