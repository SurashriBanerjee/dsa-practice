import java.util.*;

public class Palindrome{
    String word="", revword="";

    String reverse(String wd){
        int len;

        word=wd;
        len = word.length();

        for(int i=len-1; i>=0; i--){
            revword = revword + word.charAt(i);
        }

        return revword;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Palindrome obj = new Palindrome();

        System.out.print("Enter word : ");
        String wd = sc.nextLine();

        String rev = obj.reverse(wd);

        if(rev.equals(wd))
            System.out.println(wd + " is Palindromic.");
        else
            System.out.println(wd + " is NOT Palindromic.");
    }
}