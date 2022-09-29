import java.util.Scanner;
class sort
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
        for(int ele:x)
        {
            if(ele==0)
            {
                System.out.print(ele+" ");
            }
        }
        for(int ele:x)
        {
            if(ele!=0)
            {
                System.out.print(ele+" ");
            }
        }
    }
}