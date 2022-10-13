import java.util.Scanner;
class EO
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int s=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
                s+=1;
            }
            else
            {
                c+=1;
            }
        }
        System.out.print(s+" "+c);
    }
}