import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DynamicStringListTest {

    // test for getting the first element
    @Test
    public void testGetFirstElement() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");

        String actual = list.get(0);
        assertEquals("A", actual);
    }

    // test for getting the second element
    @Test
    public void testGetSecondElement() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");

        String actual = list.get(1);
        assertEquals("B", actual);
    }

    // test for the capacity method easy one
    @Test
    public void testCapacityStartsAt20() {
        DynamicStringList list = new DynamicStringList();

        int actual = list.capacity();
        assertEquals(20, actual);
    }

    // this is to test if remove shifts elements to the left
    @Test
    public void testRemoveShiftsElements() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove(1);

        String actual = list.get(1);
        assertEquals("C", actual);
    }

    // test to see if size decreases after remove
    @Test
    public void testRemoveReturnsValue() {
    DynamicStringList list = new DynamicStringList();
    list.add("A");
    list.add("B");
    list.add("C");

    String actual = list.remove(1);
    assertEquals("B", actual);
}

}
