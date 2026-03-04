package Day6;
class GC extends Exception{
    GC(String message){
        super(message);
    }
}
public class LibraryDemo {
    static void CheckAttendence(boolean absent)throws GC{
        if(absent){
            throw new GC("Penalty to submit 5 books in Library");
        }
        else {
            System.out.println("Good Students");
        }

    }
    public static void main(String[] args) {
        try{
            CheckAttendence(true);
        }
        catch(GC e)
        {
            System.out.println("Caught an exception "+e.getMessage());
        }
        finally
        {
            System.out.println("Welcome to Sapthagiri friends: Chai peelo");
        }
    }
}
