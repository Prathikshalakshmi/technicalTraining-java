import java.util.Scanner;

public class reverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s =sc.nextLine();
        System.out.print(palindrome(s));
    }
    static boolean palindrome(String s){
        String rvs="";
        for(int i=s.length()-1;i>=0;i--){
            rvs=rvs+s.charAt(i);
        }
        if(s.equals(rvs))
            return true;
        else
            return false;
    }
    
}
