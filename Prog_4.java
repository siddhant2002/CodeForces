import java.util.*;
public class Prog_4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int p=(a/c)+Math.min(1,a%c);
        int q=(b/c)+Math.min(1,b%c);
        long r=(long)p*(long)q;
        System.out.println(r);
    }
}