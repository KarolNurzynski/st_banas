import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTestSuite {


    @Test
        public void CheckIfZerosAreAccepted() {

        Calculator calculator = new Calculator(new SumProcessor(),new SubtractProcessor());
        int i = calculator.subtract(0, 0);  // tu użyłem Alt + Enter  ->  insert veriable :)
        assertEquals(i,0 );
    }

}


