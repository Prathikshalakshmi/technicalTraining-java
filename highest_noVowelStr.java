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
		System.out.println(MaxstrVowel(str));
	}
	public static String MaxstrVowel(String str[]){
	    int max=0;
	    String s="";
	    for(int i=0;i<str.length;i++)
	    {
	        int count=0;
	        for(int j=0;j<str[i].length();j++)
	        {
	            char ch=str[i].toLowerCase().charAt(j);
	            if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u')
	                count++;
	            }
	             if(count>=max){
	                 max=count;
	                s=str[i];
	        }
	       
	    }
	    return s;
	}
}