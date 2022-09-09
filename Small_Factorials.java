import java.util.Scanner;
class factorials
{
    static int fact(int n)
    {
        int i,p=1;
        for(i=1;i<=n;i++)
        {
            p=p*i;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int j;
        for(j=1;j<=n;j++)
        {
            int b;
            b=sc.nextInt();
            System.out.println(fact(b));
        }
    }
}