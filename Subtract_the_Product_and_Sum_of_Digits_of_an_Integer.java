import java.util.Scanner;
class digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int s=0,p=1,r;
        while(a!=0)
        {
            r=a%10;
            s+=r;
            p*=r;
            a=a/10;
        }
        System.out.print(p-s);
    }
}