import java.util.*;
class Array
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
        Arrays.sort(x);
        int[] q=new int[100];
        int l=0,j;
        q[l]=x[0];
        for(i=0;i<n;i++)
        {
            int c=0;
            for(j=0;j<l;j++)
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
        int h=0;
        for(j=0;j<l;j++)
        {
            //System.out.print(q[j]+" ");
            h++;
        }
        int u=0;
        if(h>=3 && h<100)
        {
           System.out.print(q[l-3]);
           u=1;
        }
        if(u==0)
        {
            System.out.print("It is not possible");
        }
        /*if(u==0)
        {
            System.out.print("It is not possible");
        }*/
        
    }
}