import java.util.Scanner;

public class Calculator {
    public static final String REGEX_ACT = "[+-*/]";
    public static final String REGEX_NUMERIC = "[^0-9]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        scanner.close();

        System.out.println(calc(inputStr));
    }


    public static String calc(String input) {

        String[] args = input.split("\\s+");

        int result = 0;

        //Проверка входных данных
        //кол-во операторов
        try {
            if (args.length != 3) throw new RuntimeException();

        } catch (Exception ex) {
            System.out.println("Неверная запись строки");
            System.out.println(" операнд оператор операнд");
            throw ex;
        }

        //проверка данных на цифры и допустимые операторы
        try {
            if (!args[1].matches(REGEX_ACT)) {
                throw new RuntimeException();
            }

            if (!args[0].matches(REGEX_NUMERIC) || !args[2].matches(REGEX_NUMERIC)) {
                throw new RuntimeException();
            }

        } catch (Exception ex) {
            System.out.println("Неверные входнные данные");
            System.out.println("Допустимы 0-9 и */-+");
            throw ex;
        }


        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[2]);

        try {
            if (arg1 > 10 || arg1 < 1 || arg2 < 1 || arg2 > 10){
                throw new RuntimeException();
            }
        } catch (Exception ex){
            System.out.println("Неверные входнные данные");
            System.out.println("Допустимые числа 0 - 10");
            throw ex;
        }


        if (args[1].equals("+")) {
            result = arg1 + arg2;
        } else if (args[1].equals("-")) {
            result = arg1 - arg2;
        } else if (args[1].equals("*")) {
            result = arg1 * arg2;
        } else if (args[1].equals("/")) {
            result = arg1 / arg2;
        }

        return "Результат операции: " + result;
    }

}
