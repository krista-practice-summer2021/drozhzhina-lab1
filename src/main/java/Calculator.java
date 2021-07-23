import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String[] strList = consoleInput();
        System.out.println("Результат равен: " + calculate(strList));
    }

    public static String[] consoleInput(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strings = str.split(" ");
        return strings;
    }

    public static int calculate(String[] str) {
        int num1, num2, res = 0;
        num1 = Integer.parseInt(str[0]);
        num2 = Integer.parseInt(str[2]);
        String oper = str[1];
        switch (oper) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                try {
                    res = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!");
                    System.exit(0);
                }
        }
        return res;
    }
}
