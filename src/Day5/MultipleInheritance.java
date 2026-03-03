package Day5;
interface Superman{
    void fly();
}
interface WonderWomen{
    void fightCrime();
}
class DC implements Superman,WonderWomen{
    @Override
    public void fly(){
        System.out.println("Superman flies");
    }
    @Override
    public void fightCrime(){
        System.out.println("WonderWomen fights crime");
    }

}
public class MultipleInheritance {
    public static void main(String[] args) {
       DC hero=new DC();
       hero.fightCrime();
       hero.fly();
    }
}
