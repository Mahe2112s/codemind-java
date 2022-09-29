import java.util.Scanner;
class Element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b;
        n=sc.nextInt();
        b=sc.nextInt();
        int x[],i;
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int c=0;
        for(i=0;i<n;i++)
        {
            if(x[i]%b!=0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}