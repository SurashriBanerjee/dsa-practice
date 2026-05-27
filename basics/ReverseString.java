import java.util.*;

public class ReverseString{
    String word="", revword="";
    void reverse(String wd){
        int len;

        word=wd;
        len = word.length();

        for(int i=len-1; i>=0; i--){
            revword = revword + word.charAt(i);
        }

        System.out.println(revword);
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        ReverseString obj = new ReverseString();

        System.out.print("Enter word : ");
        String wd = sc.nextLine();

        System.out.print("Reversed Word : ");
        obj.reverse(wd);
    }
}