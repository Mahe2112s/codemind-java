import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,d=0;
        n=sc.nextInt();
        int a=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            d=d*10+r;
        }
        if(a==d)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}