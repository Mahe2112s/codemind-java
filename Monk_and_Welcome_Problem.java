import java.util.Scanner;
class Welcome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,x[],y[],i,j;
        a=sc.nextInt();
        x=new int[a];
        y=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(i=0;i<a;i++)
        {
            y[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            System.out.print(x[i]+y[i]+" ");
        }
        
    }
}