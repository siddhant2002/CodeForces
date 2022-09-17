import java.util.*;
public class Prog_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<Character> nm=new ArrayList<>();
        nm.add('a');
        nm.add('e');
        nm.add('i');
        nm.add('o');
        nm.add('u');
        nm.add('y');
        s=s.toLowerCase();
        StringBuilder k=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(!nm.contains(c))
            {
                k.append('.');
                k.append(c);
            }
        }
        System.out.println(k.toString());
    }
}