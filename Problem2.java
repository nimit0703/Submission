import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(checkPalindrome(text));

    }

    /*
    * we will use two pointer approach to solve this problem
    * one pointer will point to 1st character
    * second one will point to last character
    * if they are not same we will return false
    * else we will return true
    * we have to iterate n/2 length of text
    * it will be of order O(n)
    * it handles edge cases like NULL string , Only 1 Character string
    * */
    private static boolean checkPalindrome(String text) {
        int frontPointer = 0;
        int backPointer = text.length()-1;

        for(int i=0;i<text.length();i++){
            if(text.charAt(frontPointer) != text.charAt(backPointer)){
                return false; // char from front and back are not same so string is not palindrome
            }
        }

        return true;
    }
}
