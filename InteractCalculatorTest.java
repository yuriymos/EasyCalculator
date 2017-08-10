import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Y on 10.08.2017.
 */
public class InteractCalculatorTest {

    @Test
    public void testAction() throws Exception{
        // assign
        final Output out = new OutputStub();
        final  Input input = new InputStub(Arrays.asList("1", "+", "1", "no", "yes").iterator(), out);
        final Calculator calc = new Calculator();
        final InteractCalculator interact = new InteractCalculator(input, out, calc);
        // action
        interact.action();
        input.close();
        // assert
        assertThat(calc.getResult(), is(2.0));
    }
}
