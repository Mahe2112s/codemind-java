import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(i=2;i<=n;i++)
        {
            for(j=2;j<=n;j++)
            {
                if(i==j || j>=i)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        
    }
}