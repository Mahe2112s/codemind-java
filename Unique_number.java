import java.util.*;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,r,d=0;
        a=sc.nextInt();
        int[] x=new int[100];
        int l=0;
        while(a!=0)
        {
            r=a%10;
            a=a/10;
            x[l++]=r;
        }
        int c=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
        }
        if(c==0)
        {
            System.out.print("Unique Number");
        }
        else
        {
            System.out.print("Not Unique Number");
        }
    }
}