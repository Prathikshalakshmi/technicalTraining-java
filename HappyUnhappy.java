import java.util.Scanner;
public class Main
{
    public static void happyunhappy(int n)
    {    
        int sum=0;
        int rem;
        int original = n;
        while(n>0){
          rem = n%10;
          n=n/10;
          sum+=rem*rem ;
        }
   
      if(sum == 1)
      {
        System.out.println("HAPPY");
        return;
      }else if(sum == 4)
      {
        System.out.println("UNHAPPY");
        return;
      }
      else
      {
          happyunhappy(sum);
      }
}


public static void main(String[] args)
{

Scanner in = new Scanner(System.in);
int n = in.nextInt();
happyunhappy(n);
}
}
