import java.util.Scanner;
class automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int x=a,c=0;
        while(x!=0)
        {
            x=x/10;
            c++;
        }
        int l=a*a;
        int d=l%((int)Math.pow(10,c));
        if(d==a)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}