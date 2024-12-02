import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be Reverse");
        int n=sc.nextInt();
        System.out.println("After Reverse the Number");
        int rev=0;
        while(n!=0)
        {
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.print(rev);
    }
}
