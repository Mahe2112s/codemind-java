import java.util.*;
class Prime
{
    public static boolean prime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int m,n,f=0;
        for(m=1;m<=a;m++)
        {
            for(n=m;n<=a;n++)
            {
                if(m*n==a)
                {
                    if(prime(m) && prime(n))
                    {
                        System.out.print(m+" "+n);
                        f=1;
                    }
                }
            }
        }
        if(f==0)
        {
            System.out.print("-1");
        }
    }
}