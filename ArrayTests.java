import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  
  @Test
  public void testRevInPlace()
  {
    int [] input = {1,2,3,4};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{4,3,2,1}, input);
  }
  
  @Test
  public void testRev()
  {
    int [] input = {1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1},ArrayExamples.reversed(input));
  }
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testAv()
  {
    double [] arr = { };
    assertEquals(0.0,ArrayExamples.averageWithoutLowest(arr),0.00001);
  }
  @Test
  public void testAv1()
  {
    double [] arr1 = {1.0,2.0,3.0};
    assertEquals(2.5,ArrayExamples.averageWithoutLowest(arr1),0.00001);
  }
  
  @Test
  public void testAv2()
  {
    double[] arr = {2.0,2.0,2.0};
    assertEquals(2.0,ArrayExamples.averageWithoutLowest(arr),0.00001);
  }
  
}
