import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<Math.sqrt(p);i++)
        {
            if(p%i==0)
            {
                isprime=false;
                System.out.println("Not A Prime Number");
                break;
            }
        }
        if(isprime)
        {
            System.out.println("Prime Number");
        }
    }
}
