import java.util.Scanner;
import java.util.Stack;
public class usecase1_Palindromechecker {
    public static void main(String[]args){
    String Word = "radar";
    char[] characters = word.toCharArray();
    int left = 0;
    int right = charecters.length-1;
    boolean ispallindrome = true;
    while(left<right){
        if (characters[left]!=characters[right]){
            ispallindrome = false;
            break;
        }
        left++;
        right--;
    }
    System.out.println("Word: " + word);
    System.out.println("ispallindrome: " + ispallindrome);
    }
}