import java.io.*;
import java.lang.*;
public class sum {
    public static void main(String a[])throws Exception
    {
        int sum=0;
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("enter number");
        int n=Integer.parseInt(d.readLine());
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;

        }
        System.out.println("ans:"+sum);
    }
}