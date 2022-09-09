import java.util.Scanner;
class adddigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,s=0;
        a=sc.nextInt();
        while(a>9)
        {
            s=0;
            while(a>0)
            {
                s+=a%10;
                a=a/10;
            }
            a=s;
        }
        System.out.println(s);
    }
}