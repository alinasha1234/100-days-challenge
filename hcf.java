public class hcf {
    public static void main(String a[])
    {
        DataInputStream d=new DataInputStream(System.in);
         System.out.println("enter the numbers");
         int number1=Integer.parseInt(d.readLine());
         int number2=Integer.parseInt(d.readLine());
          for (int i = 1; i <= num1 || i <= num2; i++)
      {
     if (number1 % i == 0 && number2 % i == 0)
        hcf = i;
      }
      System.out.println("The HCF: "+ hcf);
    }
}