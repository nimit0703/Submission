import java.util.Scanner;

public class Problem1 {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        char charToFind = sc.next().charAt(0); // we can not get char value default by ScannerClass so i used charAt()method to retrieve char

        int count = countCharacter(inputText, charToFind); // divide task into subtask to Achieve DRY concept

        System.out.println(count);


    }
    /*
    this method works on O(n) complexity because we iterate each element of our InputText
    where n is length of our string
    this method return an integer defining occurrence of our character
    default return will be 0
    */
    private static int countCharacter(String inputText, char charToFind) {
        int count = 0;

        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == charToFind) {
                count++;
            }
        }
        return count;
    }


}
