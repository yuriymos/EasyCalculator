/**
 * Created by Y on 10.08.2017.
 */

public class InteractCalculator {

    private final Input input;
    private final Output output;
    private final Calculator calculator;

    public InteractCalculator(Input input, Output output, Calculator calculator){
        this.input = input; // an object for input data
        this.output = output; // an object for output data
        this.calculator = calculator; // an object for calculator
    }

    public void action(){
        do{
            String first = input.ask("Enter the first argument: ");
            String operation = input.ask("Enter an operation (+ - * / ^): ");
            String second = input.ask("Enter the second argument: ");
            try {
                if("+".equals(operation)) {
                    calculator.add(Double.valueOf(first), Double.valueOf(second));
                }
                else if ("-".equals(operation)) {
                    calculator.subtract(Double.valueOf(first), Double.valueOf(second));
                }
                else if ("*".equals(operation)) {
                    calculator.multiply(Double.valueOf(first), Double.valueOf(second));
                }
                else if ("/".equals(operation)) {
                    calculator.divide(Double.valueOf(first), Double.valueOf(second));
                }
                else {
                    throw new Exception("An operation must be (+ - * / ^).");
                }
            }
            catch (Exception e) {
                output.println(e.getMessage());
                output.println("Please enter two arguments.");
            }

            output.println(String.format("The result is ", calculator.getResult()));
            if("yes".equals(input.ask("Do you want to use the result?"))){
                calculator.resetResult();
            }
        }while ("no".equals(input.ask("Exit(yes/no)?")));
    }
}
