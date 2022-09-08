import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int x=a;
        int y=b;
        int i,j,s=0,c=0;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        for(j=1;j<b;j++)
        {
            if(b%j==0)
            {
                c+=j;
            }
        }
        if(s==y && c==x)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}