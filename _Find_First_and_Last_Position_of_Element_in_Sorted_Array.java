import java.util.*;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        Arrays.sort(x);
        int index=0,pos=0,flag=0;
        for(i=0;i<n;i++)
        {
            if(x[i]==a)
            {
                index=i;
                x[i]=0;
                flag=1;
                break;
                
            }
        }
        for(i=0;i<n;i++)
        {
            if(x[i]==a)
            {
                pos=i;
                x[i]=0;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("-1"+" "+"-1");
        }
        else
        {
            System.out.print(index+" "+pos); 
        }
       
    }
}