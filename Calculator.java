import org.omg.CORBA.UserException;

/**
 * This class realises a simple calculator.
 */
public class Calculator {
    /**
     * This is a result.
     */
    private double result;

    /**
     This method to summ arguments.
     @param args The arguments for summing
     */
    public void add(double... args) throws Exception{
        if(args.length > 1) {
            for (Double param : args) {
                this.result += param;
            }
        }
        else {
            throw new Exception("Error! You should enter more than two arguments.");
        }
    }

    /**
     This method to subtract arguments.
     @param args The arguments for subtracting
     */
    public void subtract(double... args) throws Exception {
        if(args.length > 1) {
            this.result = args[0];
            for(int i = 1; i < args.length; i++){
                this.result -= args[i];
            }
        }
        else {
            throw new Exception("Error! You should enter more than two arguments.");
        }
    }

    /**
     * This method to multiply arguments.
     * @param args The arguments for multiplying
     * @throws Exception
     */
    public void multiply(double... args) throws Exception{
        if(args.length > 1) {
            this.result = 1;
            for(Double param : args) {
                this.result *= param;
            }
        }
        else {
            throw new Exception("Error! You should enter more than two arguments.");
        }
    }

    /**
     * This method to divide arguments.
     * @param args The arguments for dividing.
     * @throws Exception
     */
    public void divide(double... args) throws Exception{
        if(args.length > 1) {
            this.result = args[0];
            for (int index = 1; index < args.length; index++) {
                if(args[index] != 0){
                this.result /= args[index];
                }
                else {
                    throw new Exception("Error! You try to divide to zero.");
                }
            }
        }
        else {
            throw new Exception("Error! You should enter more than two arguments.");
        }
    }

    /**
     * This method to set degree.
     * @param number The arguments for setting degree.
     * @param deg The arguments for setting degree.
     * @throws Exception
     */
    public void degree(double number, int deg) throws Exception{
        if(deg > 0) {
            this.result = 1;
            for (int i = 0; i < deg; i++) {
                this.result *= number;
            }
        }
        else {
            throw new Exception("Error! Degree must be more than zero.");
        }
    }

    /**
     Get a result.
     @return This is a result.
     */
    public double getResult(){ return result; }

    /**
     Reset the result.
     */
    public void resetResult(){
        this.result = 0;
    }
}
