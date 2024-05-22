import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int sb=sc.nextInt();
	    int lb=sc.nextInt();
	    int goal=sc.nextInt();
		System.out.println(Wall(sb,bb,goal));
	}
	public static boolean Wall(int sb, int bb,int goal){
	    int rlb=goal/5;                     //rlb-required large brick
	    int minlb=Math.min(rlb,lb);
	    int lwl=goal-(minlb*5);             //lwl=leftover wall length
	    return lwl<=sb;
	}
}


/* Wall(2,2,7)----> true 
   Wall(2,2,8)---->false  */