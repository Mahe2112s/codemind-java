import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
          int h,s,f;
          h=sc.nextInt();
          s=sc.nextInt();
          f=sc.nextInt();
          if(h>50 && s>60 && f>100)
           {
               System.out.println("10");
           }
           else if(h>50 && s>60)
           {
               System.out.println("9");
           }
           else if(f>100 && s>60)
           {
               System.out.println("8");
           }
           else if(h>50 && f>100)
           {
               System.out.println("7");
           }
           else if(h>50 || s>60 || f>100)
           {
               System.out.println("6");
           }
           else
           {
              System.out.println("5");
           }
        }
    }
}