import java.util.*;
class Sub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,x[],i;
        n=sc.nextInt();
        a=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int j,c=0;
        for(i=0;i<n;i++)
        {
            int s=0;
            for(j=i;j<n;j++)
            {
               s+=x[j]; 
               if(s==a)
                {
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}