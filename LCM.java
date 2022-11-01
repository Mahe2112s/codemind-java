import java.util.*;
class Lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c,x,y;
    	a=sc.nextInt();
    	b=sc.nextInt();
    	if(a>b)
    	{
    		x=a;
    		y=b;	
    	}
    	else
    	{
    		x=b;
    		y=a;
    	}
    	for(i=1;i<=y;i++)
    	{
    		c=x*i;
    		if(c%y==0)
    		{
    		    System.out.print(c);
    			break;
    		} 
    		
    	}
    }
}