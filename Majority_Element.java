import java.util.Scanner;
class Element
{
    public static void main(String[] args)
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
            int l=0;
            for(int j=0;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    l++;
                }
            }
            if(l>(n/2))
            {
                System.out.print(x[i]);
                break;
            }
        }
    }
}