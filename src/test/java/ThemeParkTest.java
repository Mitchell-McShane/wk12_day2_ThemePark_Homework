import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 6);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 6);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 6);
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void canAddAttractionAndStall(){
        themePark.add(candyflossStall);
        assertEquals(1, themePark.countStalls());
        assertEquals(0, themePark.countAttractions());
        assertEquals(1, themePark.getAllReviewed().size());

        themePark.add(iceCreamStall);
        assertEquals(2, themePark.countStalls());
        assertEquals(0, themePark.countAttractions());
        assertEquals(2, themePark.getAllReviewed().size());

        themePark.add(tobaccoStall);
        assertEquals(3, themePark.countStalls());
        assertEquals(0, themePark.countAttractions());
        assertEquals(3, themePark.getAllReviewed().size());

        themePark.add(dodgems);
        assertEquals(3, themePark.countStalls());
        assertEquals(1, themePark.countAttractions());
        assertEquals(4, themePark.getAllReviewed().size());

        themePark.add(park);
        assertEquals(3, themePark.countStalls());
        assertEquals(2, themePark.countAttractions());
        assertEquals(5, themePark.getAllReviewed().size());

        themePark.add(playground);
        assertEquals(3, themePark.countStalls());
        assertEquals(3, themePark.countAttractions());
        assertEquals(6, themePark.getAllReviewed().size());

        themePark.add(rollerCoaster);
        assertEquals(3, themePark.countStalls());
        assertEquals(4, themePark.countAttractions());
        assertEquals(7, themePark.getAllReviewed().size());
    }

    public void canVisitAttraction(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor.countVisitedAttractions());
    }


}
