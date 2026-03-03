package Day5;
public class StringManipulation {
    public static void main(String[] args) {
        String st1="Rocky";
        String st2="Rocky";
        String st3="Adheera";
        //Using equals()
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));

        //using comapareTo
        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));
        System.out.println(st3.compareTo(st1));

        //lexicographic
    }
}
