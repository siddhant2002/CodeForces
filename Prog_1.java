import java.util.*;
public class Prog_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1||n==2)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}