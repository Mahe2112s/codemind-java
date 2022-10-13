import java.util.*;
class PrimePalindrome
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean ispal(int z)
    {
        int r,d=0;
        int s=z;
        while(s!=0)
        {
            r=s%10;
            s=s/10;
            d=d*10+r;
        }
        if(d==z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int j=a+1;j!=0;j++)
        {
            if(isprime(j))
            {
                if(ispal(j))
                {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
    
}