package edu.hitwh.observer.Weather;

public class ABoard implements Observer {
    @Override
    public void mywork(int param1, int param2, int param3) {
        System.out.println("ABoard 已经开始，代号"+(param1+param2+param3));

    }



}
