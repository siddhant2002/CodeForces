import java.util.*;
public class Prog_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for(int i=1;i<=n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int p=0;
            if(a==1)
            {
                p++;
            }
            if(b==1)
            {
                p++;
            }
            if(c==1)
            {
                p++;
            }
            if(p>=2)
            {
                f++;
            }
        }
        System.out.println(f);
    }
}