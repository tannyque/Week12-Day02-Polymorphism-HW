import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OblivionTest {

    Oblivion oblivion;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("Cheryl Blossom", 17, 167, 10);
        customer2 = new Customer("Bruce Wayne", 11, 135, 4);
        oblivion = new Oblivion("Oblivion", 7.50, 150, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Oblivion", oblivion.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(7.50, oblivion.getPrice(), 0.01);
    }

    @Test
    public void hasMinHeight() {
        assertEquals(150, oblivion.getMinHeight());
    }

    @Test
    public void hasMinAge() {
        assertEquals(15, oblivion.getMinAge());
    }

    @Test
    public void isTallEnough() {
        assertEquals(true, oblivion.checkHeight(customer1));
    }

    @Test
    public void isNotTallEnough() {
        assertEquals(false, oblivion.checkHeight(customer2));
    }

    @Test
    public void canPay() {
        oblivion.takeMoney(customer1);
        assertEquals(2.50, customer1.getMoney(), 0.01);
    }

    @Test
    public void cannotPay() {
        oblivion.takeMoney(customer2);
        assertEquals(4, customer2.getMoney(), 0.01);
    }
}
