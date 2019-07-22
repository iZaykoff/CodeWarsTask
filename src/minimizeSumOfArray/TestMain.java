package minimizeSumOfArray;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestMain {
    @Test
    public void staticTests(){
        assertEquals(22, Main.Solution.minSum(new int[]{5,4,2,3}));
        assertEquals(342, Main.Solution.minSum(new int[]{12,6,10,26,3,24}));
        assertEquals(74, Main.Solution.minSum(new int[]{9,2,8,7,5,4,0,6}));
    }


}
