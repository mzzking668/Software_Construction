package edu.hitwh.observer;

import edu.hitwh.observer.Weather.ABoard;
import edu.hitwh.observer.Weather.BBoard;
import edu.hitwh.observer.Weather.Observer;
import edu.hitwh.observer.Weather.SubjectData;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

    public static void main(String[] args) {
        Observer observer=new ABoard();
        Observer observer1=new BBoard();
        SubjectData subject=new SubjectData(1,2,3);
        subject.add(observer);
        subject.add(observer1);
        subject.Alldo();
        subject.setParam1(11);
        subject.setParam2(22);
        subject.setParam3(33);
        subject.Alldo();



    }

}
