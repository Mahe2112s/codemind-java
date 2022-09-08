import java.util.Scanner;
class perfectnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int s=0,i;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        if(s==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}