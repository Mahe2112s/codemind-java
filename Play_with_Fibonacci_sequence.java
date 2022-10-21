import java.util.Scanner;
class Fib
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=0,b=1,c=0;
        while(x>0)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            x--;
        }
    }
}