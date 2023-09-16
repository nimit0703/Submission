public class Problem5 {

    /*
    * To achieve this  we will do some mathematical logic
    * i will add both number in one variable
    * in second variable i will subtract total of them - it's current value ->that will replace it's value with first variable.
    * now will in first variable(total sum) i will subtract second variable's value->it will be replaced also
    * it is constant order O(1)
    * */
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a +"\n"+ "b = " + b);
        
    }
}
