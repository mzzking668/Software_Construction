package edu.hitwh.observer.Weather;

public class BBoard implements Observer {
    @Override
    public void mywork(int param1, int param2, int param3) {
        System.out.println("BBoard 已经开始" + (param1 - param2 + param3));
    }
}
