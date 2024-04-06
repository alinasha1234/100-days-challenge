import java.io.*; 
public class ams {
    public static void main(String a[])throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("enter number");
        int n=Integer.parseInt(d.readLine());
        int e;
        int g=n;
        int sum=0;
        while(n!=0)
        {
           e=n%10;
           sum=sum+(int)Math.pow(e,3);
            n=n/10;
        }
        if(g==sum)
        {
            System.out.println("amstrong");
        }
        else
          System.out.println("not amstrong");
    }
}
