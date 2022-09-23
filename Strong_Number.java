import java.util.Scanner;
class Strong_number
{
    public static int fact(int a)
    {
        int i,s=1;
        for(i=1;i<=a;i++)
        {
            s*=i;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b;
        b=sc.nextInt();
        int r,d=0,x=b;
        while(x>0)
        {
            r=x%10;
            d+=fact(r);
            x=x/10;
        }
        if(d==b)
        {
            System.out.print("The number "+b+" is a strong number");
        }
        else
        {
             System.out.print("The number "+b+" is not a strong number");
        }
    }
}