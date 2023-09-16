public class Problem4 {

    /*
    * to do we can use String method .substring() b
    * because substring() method don't change the original string
    * it is of constant Order : O(1)
    * */
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("a = " + a +"\n"+ "b = " + b);
    }
}
