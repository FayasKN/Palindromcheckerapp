import java.util.Scanner;
import java.util.Stack;
public class usecase1_Palindromechecker {
    public static void main(String[]args){
        String word = "madam";
        String reversed=" ";

        for(int i=word.lemgth()-1;i>=0; i--) {
            reversed = reversed + wortd.charAt(i);
        }
        if(word.equals(reversed)) {
            System.out.println("It is a Palindrome ? : True");
        }else{
            System.out.println("It is a palindrome ? : False");
        }

    }
}