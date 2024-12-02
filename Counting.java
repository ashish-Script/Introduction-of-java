import java.util.*;
public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            if(rem==key)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
        
    }
}
