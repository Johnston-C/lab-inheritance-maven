package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
  
  public int count;
  
  public int start;

  public BasicCounter(int startParam){
    this.start=startParam;
    this.count=startParam;
  }
  
  public void increment(){
    this.count++;
  }

  public void reset(){
    this.count=this.start;
  }

  public String toString(){
    return "["+this.count+"]";
  }
  
  public int get(){
    return this.count;
  }
}
