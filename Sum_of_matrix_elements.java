import java.util.Scanner;
class Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,x[][];
        r=sc.nextInt();
        c=sc.nextInt();
        x=new int[r][c];
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum+=x[i][j];
            }
        }
        System.out.print(sum);
    }
}