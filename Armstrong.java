import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("number Entered : "+num);
        int original=num;
        int sum=0;
        while(original!=0)
        {
            int rem=original%10;
            sum=sum+rem*rem*rem;
            original/=10;
        }
        if (sum==original) {
            System.out.println("Number Entered is ARmstrong Number");
        }
        else
        {
            System.out.println("Not A ArmStrong Number");
        }

    }
}
