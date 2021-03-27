import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before(){
        triangle = new Triangle(0.75,5, 7785,4.25, Brand.ROLAND, Colour.RED, Material.METAL, Type.PERCUSSION, "trrriiiinngg");
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.METAL, triangle.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(Type.PERCUSSION, triangle.getType());
    }

    @Test
    public void hasSound() {
        assertEquals("trrriiiinngg", triangle.getSound());
    }
}
