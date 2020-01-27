package lv.accenture.bootcamp.exc;

public class Arithmetic {

    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Dont divide with zero!");
        }

        try {
            /*int[] arr = new int[0];
            int some = arr[1];*/

            "hello".charAt(100);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dont break array!");
        } catch (Exception ex) {
            System.out.println("Generic Exception happened");
        }

    }

}
