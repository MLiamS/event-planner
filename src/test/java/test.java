import org.junit.*;
import static org.junit.Assert.*;


public class test{

  @Test
  public void event_instantiates_true() {
    Event testEvent = new Event(0,0,0,1);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void event_getMethodsWork_true() {
    Event testEvent = new Event(1,2,3,4);
    int testCount = testEvent.getCount();
    int testFood = testEvent.getFood();
    int testDrinks = testEvent.getDrinks();
    int testEntertainment = testEvent.getEntertainment();
    assertTrue(testCount == 1);
    assertTrue(testFood == 2);
    assertTrue(testDrinks == 3);
    assertTrue(testEntertainment == 4);

  }
}
