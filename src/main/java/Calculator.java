import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();


        System.out.println(calc(inputStr));
    }


    public static String calc(String input){

        String[] args = input.split("\\s+");
        String regexAct = "[+-*/]";
        String regexNumeric = "[^0-9]";
        String funcRes;

        int result = 0;

        //Проверка входных данных
        //кол-во операторов
        try{
            if (args.length != 3) throw new RuntimeException();

        }catch (Exception ex){
            System.out.println("Неверная запись строки");
            System.out.println(" операнд оператор операнд");
            throw ex;
        }

        //проверка данных на цифры и допустимые операторы
        try{
            if (!args[1].matches(regexAct)){
                throw new RuntimeException();
            }

            if(!args[0].matches(regexNumeric) || !args[2].matches(regexNumeric)){
                throw new RuntimeException();
            }

        }catch (Exception ex){
            System.out.println("Неверные входнные данные");
            System.out.println("Допустимы 0-9 и */-+");
            throw ex;
        }

        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[2]);

        if(args[1].equals("+")){
            result =  arg1 + arg2;
        } else if (args[1].equals("-")){
            result =  arg1 - arg2;
        } else if (args[1].equals("*")){
            result =  arg1 * arg2;
        } else if(args[1].equals("/")){
            result =  arg1 / arg2;
        }

        funcRes ="Результат операции: " + result;

        return funcRes;
    }

}
