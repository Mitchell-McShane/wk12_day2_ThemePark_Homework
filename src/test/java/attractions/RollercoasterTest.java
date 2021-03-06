package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 100, 13);
        visitor2 = new Visitor(22, 210, 35);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorAllowedIn(){
        assertTrue(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void visitorNotAllowedIn(){
        assertFalse(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test public void hasPrice(){
        assertEquals(8.50, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargedCorrectPrice(){
        assertEquals(8.50, rollerCoaster.priceFor(visitor1), 0.01);
        assertEquals(17.00, rollerCoaster.priceFor(visitor2),0.01);
    }

}
