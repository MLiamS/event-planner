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

  if (mFood == 1) {cost += 10*mGuestCount;}
  if (mFood == 2) {cost += 20*mGuestCount;}
  if (mFood == 3) {cost += 15*mGuestCount;}
  if (mFood == 4) {cost += 35*mGuestCount;}
  if (mDrinks == 2) {cost += 20*mGuestCount;}
  if (mDrinks == 3) {cost += 30*mGuestCount;}
  if (mDrinks == 4) {cost += 50*mGuestCount;}
  if (mEntertainment == 2) {cost += 20*mGuestCount;}
  if (mEntertainment == 3) {cost += 40*mGuestCount;}
  if (mEntertainment == 4) {cost += 60*mGuestCount;}

  return cost;
  }
}
