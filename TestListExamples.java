import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test
  public void testFilter() {
    List<String> list = Arrays.asList("a", "b", "c", "d", "e");
    StringChecker sc = s -> s.compareTo("c") > 0;
    List<String> result = ListExamples.filter(list, sc);
    assertEquals(Arrays.asList("d", "e"), result);
  }

  @Test(timeout = 500)
  public void testMerge() {
    List<String> list1 = Arrays.asList("a", "c", "e");
    List<String> list2 = Arrays.asList("b", "d", "f");
    List<String> result = ListExamples.merge(list1, list2);
    assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f"), result);
  }
}
