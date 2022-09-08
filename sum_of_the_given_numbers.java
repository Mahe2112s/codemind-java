import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            int a,b,j;
            a=sc.nextInt();
            b=sc.nextInt();
            int c=a+b;
            System.out.println(c);
        }
    }
}