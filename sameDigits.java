import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println(sameDigits(a));
	}
	static boolean sameDigits(int a[]){
	    int dig=count(a[0]);
	    int c=0;
	    for(int i=1;i<a.length;i++){
	        c=count(a[i]);
	        if(c!=dig)
	            return false;
	    }
	    return true;
	}
	static int count(int n){
	    int d=0;
	    while(n>0){
	        d++;
	        n=n/10;
	    }
	    return d;
	}
}

