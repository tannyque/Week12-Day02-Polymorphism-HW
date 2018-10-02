import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceMountainTest {

    SpaceMountain spaceMountain;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("Cheryl Blossom", 17, 167, 6);
        customer2 = new Customer("Bruce Wayne", 11, 135, 4);
        spaceMountain = new SpaceMountain("Kingda Ka", 5.50, 140, 12);
    }

    @Test
    public void hasName() {
        assertEquals("Kingda Ka", spaceMountain.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(5.50, spaceMountain.getPrice(), 0.01);
    }

    @Test
    public void hasMinHeight() {
        assertEquals(140, spaceMountain.getMinHeight());
    }

    @Test
    public void hasMinAge() {
        assertEquals(12, spaceMountain.getMinAge());
    }

    @Test
    public void isTallEnough() {
        assertEquals(true, spaceMountain.checkHeight(customer1));
    }

    @Test
    public void isNotTallEnough() {
        assertEquals(false, spaceMountain.checkHeight(customer2));
    }

    @Test
    public void canPay() {
        spaceMountain.takeMoney(customer1);
        assertEquals(0.50, customer1.getMoney(), 0.01);
    }

    @Test
    public void cannotPay() {
        spaceMountain.takeMoney(customer2);
        assertEquals(4, customer2.getMoney(), 0.01);
    }
}
