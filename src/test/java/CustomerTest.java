import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Cheryl Blossom", 17, 167, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Cheryl Blossom", customer.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(17, customer.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(167, customer.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(6, customer.getMoney(), 0.01);
    }

    @Test
    public void canSetMoney() {
        customer.pay(5);
        assertEquals(1, customer.getMoney(), 0.01);
    }
}
