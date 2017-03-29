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

  @Test
  public void event_setMethodsWork_true() {
    Event testEvent = new Event(0,0,0,0);

    testEvent.setCount(1);
    testEvent.setFood(2);
    testEvent.setDrinks(3);
    testEvent.setEntertainment(4);

    int testCount = 1;
    int testFood = 2;
    int testDrinks = 3;
    int testEntertainment = 4;

    assertTrue(testCount == testEvent.getCount());
    assertTrue(testFood == testEvent.getFood());
    assertTrue(testDrinks == testEvent.getDrinks());
    assertTrue(testEntertainment == testEvent.getEntertainment());
  }
}
