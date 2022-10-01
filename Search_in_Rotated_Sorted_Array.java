import java.util.*;
class Sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int index=0;
        for(i=0;i<n;i++)
        {
            if(x[i]==a)
            {
                index=i;
                break;
            }
        }
        if(index!=0)
        {
            System.out.print(index);
        }
        else
        {
            System.out.print("-1");
        }
    }
}