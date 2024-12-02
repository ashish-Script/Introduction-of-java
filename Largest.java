import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.printf("Three Number Are:%d  ,%d,   %d",a,b,c);
        int max=0;
        if(a>b)
        {
            if(b>c)
            {
                max=a;
            }
            else
            {
                if(a>c)
                {
                    max=a;
                }
                else
                {
                    max=c;
                }
            }
        }
        else
        {
            if(b>c)
            {
                max=b;
            }
            else
            {
                if(c>a)
                {
                    max=c;
                }
                else
                {
                    max=a;
                }
            }
        }
        System.out.println();
        System.out.println("LArgest Number: "+max);
    }
}
