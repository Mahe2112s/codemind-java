import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
           char z;
           int c=0;
           z=sc.nextLine().charAt(0);
           if(z=='a' || z=='A')
           {
               c=1;
           }
           else if(z=='e' || z=='E')
           {
               c=1;
           }
           else if(z=='i' || z=='I')
           {
               c=1;
           }
           else if(z=='o' || z=='O')
           {
               c=1;
           }
            else if(z=='u' || z=='U')
           {
               c=1;
           }
           if(c==1)
           {
               System.out.println("Vowel");
           }
           else
           {
               System.out.println("Consonant");
           }
        }
    }
}