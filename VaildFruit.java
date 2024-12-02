import java.util.*;
public class VaildFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit="Apple";
        switch(fruit)
        {
            case "Grapes":
            System.out.println("Differ");
            break;
            case "Mangos":
            System.out.println("Differ");
            break;
            case "Apple":
            System.out.println("Same");
            break;
            default:
            System.out.println("Default");
        } 
    }
}
