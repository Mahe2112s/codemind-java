import java.util.*;
class Square
{
    public static boolean sqr(int n)
    {
        int i,f=0;
        for(i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,x[],j;
        a=sc.nextInt();
        x=new int[a];
        for(j=0;j<a;j++)
        {
            x[j]=sc.nextInt();
        }
        int s=0;
        for(j=0;j<a;j++)
        {
            if(sqr(x[j]))
            {
                s+=x[j];
            }
        }
        System.out.print(s);
    }
}