import java.util.Scanner;
class Maximum
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
        int[] y=new int[100];
        int l=0,j;
        y[l]=x[0];
        for(i=0;i<n;i++)
        {
            int c=0;
            for(j=0;j<l;j++)
            {
                if(y[j]==x[i])
                {
                    c++;
                }
            }
            if(c==0)
            {
                y[l++]=x[i];
            }
        }
      /*  for(j=0;j<l;j++)
        {
            System.out.print(y[j]+" ");
        }*/
        if(l>=3)
        {
            System.out.print(y[2]);
        }
        else
        {
            System.out.print(y[l-1]);
        }
    }
}