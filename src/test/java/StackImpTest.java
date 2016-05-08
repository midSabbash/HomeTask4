import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StackImpTest {
    private StackImpl stackImpl = new StackImpl(5);

    @Test
    public void stackPushTest () throws StackException {
        try {
            stackImpl.push("E1");
            stackImpl.push("E2");
            stackImpl.push("E3");
            stackImpl.push("E4");
            stackImpl.push("E5");
        } catch (StackException e) {
            e.printStackTrace();
        }
        assertEquals("E1 E2 E3 E4 E5","E1 E2 E3 E4 E5");

    }

    @Test
    public void stackPopTest () throws StackException {
        try {
            stackImpl.push("E1");
        } catch (StackException e) {
            e.printStackTrace();
        }
        assertEquals(stackImpl.pop(),'_');
    }

    @Test
    public void stackClearTest () {
        stackImpl.clear();
        assertEquals('_','_');
    }

    @Test
    public void stackPrintTest () throws StackException {
        stackImpl.push("E1");
        stackImpl.push("E2");
        stackImpl.push("E3");
        stackImpl.push("E4");
        assertEquals("E1 E2 E3 E4 _","E1 E2 E3 E4 _");
    }
}
