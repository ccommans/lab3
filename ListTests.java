import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {
    class StringFilter implements StringChecker {
        public boolean checkString(String s) {
            return s.contains("a");
        }
    }
    
    @Test
    public void testFilter() {
        StringFilter sf = new StringFilter();
        ArrayList<String> list = new ArrayList();
        assertEquals(list, ListExamples.filter(list, sf));
        list.add("a");
        assertEquals(list, ListExamples.filter(list, sf));
        ArrayList<String> list2 = new ArrayList(list);
        list2.add("b");
        assertEquals(list, ListExamples.filter(list2, sf));
        list.add("banana");
        assertEquals(list, ListExamples.filter(list, sf));
    }

    @Test
    public void testMerge() {
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        list1.add("a");
        list2.add("b");
        ArrayList<String> exp = new ArrayList<String>();
        exp.add("a");
        exp.add("b");
        assertEquals(exp, ListExamples.merge(list1, list2));
    }
}