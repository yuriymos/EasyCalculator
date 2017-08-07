import java.util.Scanner;
/**
 * This class creates to use calculator class. In order to enter users' data.
 */
public class InteractRunner {
    /**
     * Данный метод является точкой входа в программу
     * @param args
     */
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String usePreviousResult = "clear", exit = "no", first;
            double previousResult = 0.0;
            while(!exit.equals("yes")){
                if(usePreviousResult.equals("clear")) {
                    System.out.println("Enter the first argument: ");
                    first = reader.next();
                }
                else {
                    first = Double.toString(previousResult);
                }
                System.out.println("Enter symbol (+,-,*,/,^): ");
                String mark  = reader.next();
                System.out.println("Enter the second argument: ");
                String second = reader.next();
                switch (mark){
                    case "+":
                        calc.add(Double.valueOf(first), Double.valueOf(second));
                        break;
                    case "-":
                        calc.subtract(Double.valueOf(first), Double.valueOf(second));
                        break;
                    case "*":
                        calc.multiply(Double.valueOf(first), Double.valueOf(second));
                        break;
                    case "/":
                        calc.divide(Double.valueOf(first), Double.valueOf(second));
                        break;
                    case "^":
                        calc.degree(Double.valueOf(first), Integer.valueOf(second));
                        break;
                        default:
                            // do nothing
                            break;
                }// for switch
                System.out.println("The result is " + calc.getResult());
                System.out.println("Exit(yes/no)?");
                exit = reader.next();
                if(!exit.equals("yes")) {
                    System.out.println("Do We use the result we've got yet or clear it (use/clear)?");
                    usePreviousResult = reader.next();
                    if(usePreviousResult.equals("use")){
                        previousResult = calc.getResult();
                    }
                }
                calc.resetResult();
            } // for while
        }
        finally {
            reader.close();
        }
    }
}
