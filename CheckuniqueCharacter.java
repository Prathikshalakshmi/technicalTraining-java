import java.util.Scanner;

public class CheckuniqueCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        System.out.println(uniqueChar(s));
    }
    static boolean uniqueChar(String s){
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.chatAt(i))!=s.lastIndexOf(s.charAt(i)))
            return false;
        }
        return true;
    }
}
