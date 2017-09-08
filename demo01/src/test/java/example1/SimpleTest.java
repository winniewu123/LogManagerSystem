package example1;

import org.testng.annotations.*;

/**
 * Created by wuxiaodong on 2017/9/1.
 */
public class SimpleTest {
    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }
}
