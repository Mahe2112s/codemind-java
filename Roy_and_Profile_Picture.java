import java.util.Scanner;
class profile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,n,i;
        l=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a<l || b<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(a==b)
            {
                System.out.println("ACCEPTED");
            }
            else if(a<b || a>b)
            {
                System.out.println("CROP IT");
            }
        }
    }
}