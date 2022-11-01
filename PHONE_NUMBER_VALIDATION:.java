import java.util.*;
class Phone
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] x=s.toCharArray();
        if(x[0]=='0')
        {
            System.out.print("Invalid");
        }
        else
        {
            if(x.length==10)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }
}