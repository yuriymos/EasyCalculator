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
     @param params The arguments for summing
     */
    public void add(double... params){
        for(Double param : params){
            this.result += param;
        }
    }

    /**
     This method to subtract arguments.
     @param params The arguments for subtracting
     */
    public void subtract(double... params){
        this.result = params[0];
        for(int i = 1; i < params.length; i++){
            this.result -= params[i];
        }
    }

    /**
     This method to multiply arguments.
     @param params The arguments for multiplying
     */
    public void multiply(double... params){
        this.result = 1;
        for(Double param : params){
            this.result *= param;
        }
    }

    /**
     * This method to divide arguments.
     * @param args The arguments for dividing.
     * @throws Exception
     */
    public void divide(double... args) throws Exception{
        if(args.length > 0) {
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
     This method to set degree.
     @param number The arguments for setting degree
     @param deg The arguments for setting degree
     */
    public void degree(double number, int deg){
        this.result = 1;
        for(int i = 0; i < deg; i++){
            this.result *= number;
        }
    }

    /**
     Get a result.
     @return This is a result.
     */
    public double getResult(){
        return result;
    }

    /**
     Reset the result.
     */
    public void resetResult(){
        this.result = 0;
    }
}
