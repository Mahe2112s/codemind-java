import java.util.Scanner;
class spynumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int r,s=0,p=1;
        while(a!=0)
        {
            r=a%10;
            s+=r;
            p*=r;
            a=a/10;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}