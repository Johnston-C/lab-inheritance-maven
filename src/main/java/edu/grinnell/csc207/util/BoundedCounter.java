package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter {

  int bound;

  public BoundedCounter(int startval, int boundval) {
    super(startval);
    this.bound = boundval;
  }

  @Override
  public void increment() throws Exception { 
    super.increment();
    if (this.count > bound) {
      throw new Exception("Value exceeds bound");
    }
  } // increment()
}
