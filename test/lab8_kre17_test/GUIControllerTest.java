package lab8_kre17_test;

import org.junit.Test;
import static org.junit.Assert.*;

import static lab8_kre17.GUIController.buttonSolveAction;

public class GUIControllerTest {
    
    @Test    
    public void test1MyDiv() throws Exception {
        assertTrue(buttonSolveAction(1, 2, -1) == -1);
        assertTrue(buttonSolveAction(3, -4, 9) == (18 + 5 / 18.0));
    }
}
