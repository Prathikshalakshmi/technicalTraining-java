import java.util.Scanner;
public class Main
{
    static boolean Prime(int n)
    {
        
        for(int i=2;i<=n/2;i++)
        {
                if(n%i==0)
                    return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
		System.out.println(Prime(a));
	}
}
