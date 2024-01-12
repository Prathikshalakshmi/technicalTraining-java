import java.util.Scanner;
public class Main
{
    static int a,b,c;
    static int Quadratic(){
        double x1,x2;
        x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println(x1);
		System.out.println(x2);
		return 0;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		Quadratic();
	}
}
