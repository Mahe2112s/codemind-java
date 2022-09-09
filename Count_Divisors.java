import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int s=0,i;
        for(i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                s++;
            }
        }
        System.out.println(s);
        
    }
}