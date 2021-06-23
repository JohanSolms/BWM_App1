
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Johan Solms, 2021/06/23

public class StackTests {

    private Stack testStack;

    @BeforeEach
    public void setup() throws Exception{
        testStack = new Stack();
    }
    @AfterEach
    public void tearDown() throws Exception{
        testStack = null;
    }

    @Test
    public void testAddAndRemoveFirst(){ //adding and removing from stack test
        testStack.push(1);
        assertFalse(testStack.empty());
        testStack.pop();
        assertTrue(testStack.empty());
    }

    @Test
    public void testPop(){ //test popping until stack is empty
        testStack.push(1);
        testStack.pop();
        try {
            assertNull(testStack.pop());
        }
        catch (Exception e){
            fail("Pop should not have thrown exception.");
        }
    }


}
