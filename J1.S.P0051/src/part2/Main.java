package part2;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    public static void main(String[] args) {
        DataInput input = new DataInput();
        Calculator cal = new Calculator();

        while (true) {
            displayMenu();
            int choice = input.getInputIntInRange("Enter your choice: ",
                    "Please input in range[1-3]", 1, 3);
            switch (choice) {
                case 1:
                    normalCalc();
                    break;
                case 2:
                    double weight = input.inputBMINumber("Enter weight: ", "BMI must be number");
                    double height = input.inputBMINumber("Enter height: ", "BMI must be number");
                    double bmi = cal.BMICalculate(weight, height);
                    cal.getBMIStatus(bmi);
                    break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("======= Calculator program =======");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
    }

    public static void normalCalc() {
        DataInput input = new DataInput();
        Calculator cal = new Calculator();

        double number1 = input.inputNumber();
        String operator = input.inputOperator();
        if (operator.equalsIgnoreCase("=")) {
            System.out.print("Result: " + number1 + "\n");
        } else {
            double number2 = input.inputNumber();
            double memory = cal.normalCalculator(number1, number2, operator);
            System.out.print("Memory: " + memory + "\n");
            while (true) {
                operator = input.inputOperator();
                if (operator.equalsIgnoreCase("=")) {
                    break;
                }
                number2 = input.inputNumber();
                memory = cal.normalCalculator(number2, memory, operator);
                System.out.print("Memory: " + memory + "\n");
            }
            System.out.print("Result: " + memory + "\n");
        }
    }
}
