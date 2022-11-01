import java.util.*;
class Square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            int b;
            b=sc.nextInt();
            int j,f=0;
            for(j=1;j<=b;j++)
            {
                if(j*j==b)
                {
                    f=1;
                }
            }
            if(f==1)
            {
                System.out.print("True");
            }
            else
            {
                System.out.print("False");
            }
            System.out.println();
        }
    }
}