import java.util.Scanner;
class Occurances
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        char   y=sc.nextLine().charAt(0);
        int c=0,flag=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)==y)
            {
                c++;
                flag=1;
            }
        }
        if(flag==1)
        {
           System.out.print(c); 
        }
        else
        {
            System.out.print("-1");
        }
        
    }
}