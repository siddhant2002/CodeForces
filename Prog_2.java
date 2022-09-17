import java.util.*;
public class Prog_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            String p=sc.next();
            if(p.length()<=10)
            {
                System.out.println(p);
            }
            else
            {
                System.out.println(p.charAt(0)+""+(p.length()-2)+""+p.charAt(p.length()-1));
            }
        }
    }
}
