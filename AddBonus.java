import java.util.*;

class AddBonus{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextInt();
        System.out.println(salary);
        if(salary>10){
            salary=salary+100;
        }        
        else
        {
            salary+=300;
        }
        System.out.println(salary);
    }

}