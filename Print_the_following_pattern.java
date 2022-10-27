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
            for(j=1;j<=n;j++)
            {
                if(i==j || (i==n+1-j))
                {
                    System.out.print(n-i+1+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}