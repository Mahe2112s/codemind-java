import java.util.Scanner;
class capacity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=c+c;
        e=a*b*d*512;
        System.out.println(e);
    }
}