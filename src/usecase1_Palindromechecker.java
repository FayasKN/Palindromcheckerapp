import java.util.Scanner;
import java.util.Stack;
public class usecase1_Palindromechecker {
    public static void main(String[]args){
        String word = "madam";
        boolean ispalindrome = true;


        for(int i = 0; i < input.length () / 2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome) {
            System.out.println("Is it a Pallindrome ? yes ");
        } else{
            System.out.println("Is it a Pallindrome ? NO")
        }
    }
}