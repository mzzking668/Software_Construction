package edu.hitwh.observer.Weather;

import java.util.ArrayList;

public class SubjectData extends Subject {
        private int param1;
        private int param2;
        private int param3;
        public SubjectData(int param1, int param2, int param3) {
            this.param1 = param1;
            this.param2 = param2;
            this.param3 = param3;
        }
        public void setParam1(int param1) {
            this.param1 = param1;
        }
        public void setParam2(int param2) {
            this.param2 = param2;
        }
        public void setParam3(int param3) {
            this.param3 = param3;
        }
        public void Alldo(){
            ArrayList<Observer> observers = this.getObservers();
            for (Observer o : observers) {
                o.mywork(param1, param2, param3);
            }
        }
}
