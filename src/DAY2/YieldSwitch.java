package DAY2;
import java.util.Scanner;
public class YieldSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        String color = switch (ch) {
            case 'V'->{yield "Voilet";}
            case 'I'->{yield "Indigo";}
            case 'B'->{yield "Blue";}
            case 'G'->{yield "Green";}
            case 'Y'->{yield "Yellow";}
            case 'O'->{yield "Orange";}
            case 'R'->{yield "Red";}
            default->{ yield "Invalid Input";}

        };
        System.out.println("Color ="+color);
    }
}
