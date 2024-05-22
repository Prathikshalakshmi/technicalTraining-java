import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str[]=new String[n];
		for(int i=0;i<n;i++){
		    str[i]=sc.nextLine();
		}
		System.out.println(Maxstr(str));
	}
	public static String Maxstr(String str[]){
	    int max=0;
	    String s="";
	    for(int i=0;i<str.length;i++)
	    {
	        int count=0;
	        for(int j=0;j<str[i].length();j++)
	        {
	            char ch=str[i].charAt(j);
	            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
	                count++;
	            }
	        }
	        if(count>=max){
	            s=str[i];
	        }
	    }
	    return s;
	}
}
