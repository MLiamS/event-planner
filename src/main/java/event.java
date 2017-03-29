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

  public void setCount(int input) {
    mGuestCount = input;
  }

  public void setFood(int input) {
    mFood = input;
  }

  public void setDrinks(int input) {
    mDrinks = input;
  }

  public void setEntertainment(int input) {
    mEntertainment = input;
  }

  public int getCost()  {
  int cost = 0;
  // Cost Calculations...
  return cost;
  }
}
