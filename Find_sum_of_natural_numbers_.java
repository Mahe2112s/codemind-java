import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,s=0;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            s+=i;
        }
        System.out.println(s);
    }
}