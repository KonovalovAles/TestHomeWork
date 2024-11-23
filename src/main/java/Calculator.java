import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();


        System.out.println("" + calc(inputStr));
    }


    public static String calc(String input){

        String[] args = input.split("\\s+");
        String regexAct = "[+-*/]";
        String regexNumeric = "[^0-9]";
        int result;
        int arg1;
        int arg2;


        private int add(int arg1, int arg2){
            return arg1 + arg2;
        }

        private  int multi(int arg1, int arg2){
            return arg1 * arg2;
        }

        private int minus(int arg1, int arg2){
            return arg1 - arg2;
        }

        private int divison(int arg1, int arg2){
            return arg1 % arg2;
        }

        return result;
    }

}
