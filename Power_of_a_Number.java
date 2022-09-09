import java.util.Scanner;
class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int l=(int)Math.pow(a,b);
        System.out.println(l%c);
    }
}