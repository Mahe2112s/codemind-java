import java.util.Scanner;
class Numer_69
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d=0;
        n=sc.nextInt();
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            d=d*10+r;
        }
        int s=0,f,l=0;
        while(d>0)
        {
            f=d%10;
            if(f==6 && s==0)
            {
                f=9;
                s++;
            }
            d=d/10;
            l=l*10+f;
        }
        System.out.print(l);
    }
}