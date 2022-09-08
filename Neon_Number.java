import java.util.Scanner;
class neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int l=a*a;
        int r,s=0;
        while(l!=0)
        {
            r=l%10;
            l=l/10;
            s+=r;
        }
        if(s==a)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}