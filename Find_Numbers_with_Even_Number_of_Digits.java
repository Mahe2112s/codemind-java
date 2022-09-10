import java.util.Scanner;
class Even
{
    public static boolean even(int n)
    {
        int d=0;
        while(n!=0)
        {
            n=n/10;
            d++;
        }
        if(d%2==0)
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
        int n,x[],i,m=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int ele:x)
        {
            if(even(ele))
            {
                m++;
            }
        }
        System.out.println(m);
    }
}