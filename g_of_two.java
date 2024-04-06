import java.io.*;
public class g_of_two {
    public static void main(String a[])throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("enter first number");
        int n1=Integer.parseInt(d.readLine());
        System.out.println("enter second number");
        int n2=Integer.parseInt(d.readLine());
        if(n1>n2)
         System.out.println("n1 is greater");
         else
           System.out.println("n2 is greater");
    }
}