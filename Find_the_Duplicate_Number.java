import java.util.*;
class Duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int[] q=new int[100];
        int l=0;
        q[l]=x[0];
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<l;j++)
            {
                if(x[i]==q[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                q[l++]=x[i];
            }
        }
        for(int j=0;j<l;j++)
        {
            int h=0;
            for(i=0;i<n;i++)
            {
                if(q[j]==x[i])
                {
                    h+=1;
                }
            }
            if(h>1)
            {
                System.out.println(q[j]);
                break;
            }
        }
    }
}