import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str=sc.nextLine();
		System.out.println("Special Characters: " + specialCharacterCount(str));
		System.out.println("Vowels : " + vowelCount(str));
	}
	
	static int specialCharacterCount(String str){
	    int count=0;
	    for(int i=0;i<str.length();i++){
	        if(!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
	            count++;
	        }
	    }
	    return count;
	}
	static int vowelCount(String str){
	    str=str.toLowerCase();
	    int vcount=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)== 'a' || str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u'){
	            vcount++;
	        }
	    }
	    return vcount;
	}
}
