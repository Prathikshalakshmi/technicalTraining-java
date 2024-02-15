import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] a=new int[5];
		int[] b=new int[5];
		int[] c=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter values into array a:");
		for(int i=0;i<5;i++){
		    a[i]=sc.nextInt();
		}
		
		System.out.println("Enter values into array b:");
		for(int i=0;i<5;i++){
		    b[i]=sc.nextInt();
		}
		c=Addition(a,b);
		System.out.println("Result of Addition of arrays");
		for(int i=0;i<5;i++){
		    System.out.print(c[i]+" ");
		}
	}	
	static int[] Addition(int x[],int y[]){
	    int[] z=new int[5];
	    for(int i=0;i<5;i++){
	        z[i]=x[i]+y[i];
	    }
	    return z;
	}
}
