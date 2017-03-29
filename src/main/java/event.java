public class Event  {
  public int mGuestCount = 0;
  public int mFood;
  public int mDrinks;
  public int mEntertainment;

  public Event (int guestCount, int food, int drinks, int entertainment) {
    mGuestCount = guestCount;
    mFood = food;
    mDrinks = drinks;
    mEntertainment = entertainment; }

  public int getCount() {
    return mGuestCount;
  }

  public int getFood() {
    return mFood;
  }

  public int getDrinks() {
    return mDrinks;
  }

  public int getEntertainment() {
    return mEntertainment;
  }


  public int getCost()  {
  int cost = 0;
  // Cost Calculations...
  return cost;
  }
}
