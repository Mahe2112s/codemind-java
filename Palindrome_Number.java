import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            int a;
            a=sc.nextInt();
            int r,d=0;
            int b=a;
            while(b!=0)
            {
                r=b%10;
                b=b/10;
                d=d*10+r;
            }
            if(d==a)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}