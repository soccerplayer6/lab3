import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;
public class ListTests implements StringChecker
{
    @Test
    public void mergeTest()
    {
        String a = "a";
        String b = "b";
        String c = "c";
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l1.add(a);
        l1.add(b);
        l1.add(c);
        l2.add(c);
        l2.add(b);
        List<String> test = new ArrayList<>();
        test.add(a);
        test.add(b);
        test.add(b);
        test.add(c);
        test.add(c);
        assertEquals(test,ListExamples.merge(l1,l2));
    }

    public boolean checkString (String s)
    {
        if (s == "a")
        {
            return false;
        }
        return true;
    }
    @Test
    public void filterTest()
    {
        List<String> l1 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        List<String> l2 = new ArrayList<>();
        l2.add("b");
        l2.add("c");
       // assertEquals(l2,ListExamples.filter(l1),new StringChecker());
    }
}