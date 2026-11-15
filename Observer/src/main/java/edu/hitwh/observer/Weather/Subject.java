package edu.hitwh.observer.Weather;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers=new ArrayList<>();
  public ArrayList<Observer> getObservers() {
      return observers;
  }
    public ArrayList<Observer> add(Observer o) {
        observers.add(o);
        return observers;

    }
    public ArrayList<Observer> remove(Observer o) {
        observers.remove(o);
        return observers;
    }
    public void Alldo() {

    }
}
