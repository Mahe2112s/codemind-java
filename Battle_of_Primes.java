import java.util.Scanner;
class Primes
{
    public static boolean prime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i<n;i++)
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
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        for(int i=1;i<=100;i++)
        {
            if(prime(c+i))
            {
                System.out.print(i);
                break;
            }
        }
    }
}