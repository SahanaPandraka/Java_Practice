import java.util.Scanner;
class Factors
  {
    public static void main(String args[])
    
    {
      Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of n:");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            System.out.println(i);
          }
        }
      
      
    }
  }