public class rev {
    public static void main(String a[])throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("enter number");
        int n=Integer.parseInt(d.readLine());
        int e,sum=0;
        while(n!=0)
        {
           e=n%10;
           sum=sum*10+e;
           n=n/10;
        }
        System.out.println("ans:"+sum);
    }
}
