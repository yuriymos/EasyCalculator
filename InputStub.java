import java.util.Iterator;

/**
 * Created by Y on 10.08.2017.
 */
public class InputStub implements Input {

    private final Iterator<String> answers;
    private final Output output;

    public InputStub(Iterator<String> answers, Output output){
        this.answers = answers;
        this.output = output;
    }

    public String next(){
        return this.answers.next();
    }

    public String ask(String question){
        this.output.println(question);
        return  this.answers.next();
    }

    public void close(){

    }
}
