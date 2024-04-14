class m{
    public static void main(String da[])
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
        if(sum==n)
        {
            System.out.println("palindrome");
        }

    }

}