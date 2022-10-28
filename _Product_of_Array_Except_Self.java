import java.util.*;
class Self
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,x[],i;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        int j=0;
        for(i=0;i<a;i++)
        {
            int pro=1;
            for(j=0;j<a;j++)
            {
                if(i!=j)
                {
                    pro=pro*x[j];
                }
            }
            System.out.print(pro+" ");
        }
    }
}