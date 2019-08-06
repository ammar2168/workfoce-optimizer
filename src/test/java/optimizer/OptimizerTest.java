package optimizer;

import org.junit.Assert;
import org.junit.Test;

public class OptimizerTest {

    @Test
    public void testOptimize(){
        Optimizer optimizer  = new Optimizer(10,6,35);
        Tuple t = optimizer.optimize();
        Assert.assertEquals(3, t.getSeniorCount());
        Assert.assertEquals(1, t.getJuniorCount());

        optimizer = new Optimizer(10,6,21);
        t = optimizer.optimize();
        Assert.assertEquals(1,t.getSeniorCount());
        Assert.assertEquals(2,t.getJuniorCount());

        optimizer = new Optimizer(10,6,28);
        t = optimizer.optimize();
        Assert.assertEquals(1, t.getSeniorCount());
        Assert.assertEquals(3,t.getJuniorCount());
    }
}
