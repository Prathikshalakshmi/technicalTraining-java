import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] a=new int[5];
		int[] b=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("Enter values into array b:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
		    b[i]=sc.nextInt();
		}
		System.out.println("the first array elements are:");
		PrintElements(a);
		System.out.println("the second array elements are:");
		PrintElements(b);
	}
	static void PrintElements(int x[]){
	    for(int i:x){
	        System.out.print(i+" ");
	    }
	}
}
