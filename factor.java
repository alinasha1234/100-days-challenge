import java.io.*;
   public class factor {
    public static void main(String a[])throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("enter number");
        int n=Integer.parseInt(d.readLine());
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
}
}
 
