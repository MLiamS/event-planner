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

  @Test
  public void event_getCostdoesJustThat() {
    Event testEvent = new Event(10,2,3,4);

    int sampleCost = testEvent.getCost();
    int costTest = 1100; //with a Event(10,2,3,4)

    assertTrue(costTest == sampleCost);

  }

  @Test
  public void event_getCouponReturnsCodeString() {
    Event testEvent = new Event(200,4,1,1);
    Event testEvent2 = new Event(200,1,4,1);

    assertEquals("200 Plus Steak - coupon code = 200S", testEvent.getCoupon());
    assertEquals("200 Plus Bar-Tender - coupon code = 200B", testEvent2.getCoupon());
  }

  @Test
  public void event_applyCouponcodeInt() {
    Event testEvent = new Event(1,1,1,1);
    int oneFifty = testEvent.applyCoupon("200S");
    int twohundred = testEvent.applyCoupon("200B");
    assertEquals(oneFifty , 150);
    assertEquals(twohundred , 200 );
  }

}
