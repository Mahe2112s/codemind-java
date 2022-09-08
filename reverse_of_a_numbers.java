import java.util.Scanner;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,r,d=0;
        a=sc.nextInt();
        while(a!=0)
        {
            r=a%10;
            a=a/10;
            d=d*10+r;
        }
        System.out.println(d);
    }
}