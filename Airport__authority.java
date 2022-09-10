import java.util.Scanner;
class airport
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int b=0;
        for(int ele:x)
        {
            if(ele<=t)
            {
                b+=1;
            }
            else
            {
                b+=2;
            }
        }
        System.out.println(b);
        
    }
}