import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=1;i<a/2;i++)
        {
            if(a==i*i)
            {
                c=1;
            }
        }
        if(c==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}