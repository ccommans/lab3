import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.length());
        list.append(3);
        assertEquals(1, list.length());
        list.append(2);
        assertEquals(2, list.length());

        LinkedList list2 = new LinkedList();
        for(int i = 0; i < 5; i++)
            list2.append(i+1);
        assertEquals(5, list2.length());
    }

    @Test
    public void testToString() {
        LinkedList list = new LinkedList();
        list.append(3);
        list.prepend(2);
        assertEquals("2 3 ", list.toString());
    }

    @Test
    public void testLast() {
        LinkedList list = new LinkedList();
        list.append(3);
        list.prepend(2);
        //assertEquals(3, list.last());
        //assertEquals(2, list.first());
    }
}