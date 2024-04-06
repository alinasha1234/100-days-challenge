import java.io.*;
public class odd_even {
    public static void main(String a[])throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("enter number");
        int n=Integer.parseInt(d.readLine());
        if(n%2==0)
           System.out.println("given number is even");
        else
           System.out.println("given number is odd");
    }

}
 

