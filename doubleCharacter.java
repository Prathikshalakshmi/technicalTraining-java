import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s =sc.nextLine();
        System.out.print(doubleChar(s));
    }
    static String doubleChar(String s){
        String dc="";
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            dc=dc+c+c;
        }
        return dc;
    }
    
}
