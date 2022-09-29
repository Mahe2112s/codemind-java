import java.util.Scanner;
class Triplets
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int i,j;
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=0,d=0;
        for(i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                c++;
            }
            else if(a[i]<b[i])
            {
                d++;
            }
        }
        System.out.print(c+" "+d);
    }
}