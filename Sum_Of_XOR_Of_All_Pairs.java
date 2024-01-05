import java.util.*;
class Sum_XOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        long s=0;
        for(int i=0;i<32;i++)
        {
            long zero_count=0,one_count=0;
            for(int j=0;j<a;j++)
            {
                if((arr[j] & (1<<i)) != 0) one_count++;
                
                else zero_count++;
            }
            s+=(one_count*zero_count*Math.pow(2,i));
        }
        System.out.print(s);
    }
}
