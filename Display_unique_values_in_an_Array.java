import java.util.Scanner;
class Unique
{
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
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.print(x[i]+" ");
                m+=1;
            }
            
        }
        if(m==0)
        {
        System.out.println("-1");
        }
    }
}