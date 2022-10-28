import java.util.*;
class Winner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,x[],i;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        int z=0;
        int y=0;
        for(i=0;i<a;i++)
        {
         if(i%2==0)
         {
             z+=x[i];
         }
         else
         {
             y+=x[i];
         }
        }
        int h=Math.abs(z-y);
        if(h%4==0)
        {
            System.out.print("X");
        }
        else
        {
            System.out.print("Y");
        }
    }
}