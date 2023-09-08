public class Calculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: Calculator <num1> <num2>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = num1 + num2;

        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
    }
}
