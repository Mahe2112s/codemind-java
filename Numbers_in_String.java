import java.util.Scanner;
class Numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        int s=0;
        for(int i=0;i<x.length();i++)
        {
            if(Character.isDigit(x.charAt(i)))
            {
                s+=x.charAt(i)-'0';
            }
        }
        System.out.print(s);
    }
}