import java.io.*;
import java.lang.*;
class pos_nag{
    public static void main(String a[])throws IOException
    { 
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("enter a number");
        int n=Integer.parseInt(d.readLine());
        if(n>0)
        {
            System.out.println("postive");
        }
        else{
            System.out.println("negative");
        }
    }
}