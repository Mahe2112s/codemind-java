import java.util.*;
class sort
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
        for(i=0;i<n;i++)
        {
            if(x[i]<0)
            {
                x[i]*=-1;
            }
        }
        Arrays.sort(x);
        for(i=0;i<n;i++)
        {
            int b=(int)Math.pow(x[i],2);
            System.out.print(b+" ");
        }
    }
}