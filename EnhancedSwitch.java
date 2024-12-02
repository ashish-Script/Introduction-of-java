public class EnhancedSwitch {
    public static void main(String[] args) {
        String fruit="Apple";
        switch(fruit)
        {
            case "mango" -> System.out.println("King of Fruit");
            case "grapes" -> System.out.println("Sweet Fruit");
            case "Apple" -> System.out.println("Match");
            default -> System.out.println("Default Cateory");
        }
    }
}
