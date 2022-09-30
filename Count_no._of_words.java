import java.util.Scanner;
class Words
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y[]=x.split(" ");
        System.out.print(y.length);
    }
}