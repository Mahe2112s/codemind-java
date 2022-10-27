import java.util.Scanner;
class Cars
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for(int i=1;i<=z;i++)
        {
            float a,b,c,d;
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            d=sc.nextFloat();
            float x,y;
            x=c/a;
            y=d/b;
            if(x>y)
            {
                System.out.println("1");
            }
            else if(x<y)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println("0");
            }
            
        }
    }
}