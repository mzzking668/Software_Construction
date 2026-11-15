package edu.hitwh.bridge;

import edu.hitwh.bridge.IcecreamQuestion.CupSize;
import edu.hitwh.bridge.IcecreamQuestion.IceCream;
import edu.hitwh.bridge.IcecreamQuestion.IceCream1;
import edu.hitwh.bridge.IcecreamQuestion.Large;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApplication {

    public static void main(String[] args) {
        IceCream iceCream1 = new IceCream1();
        CupSize drink = new Large(iceCream1);
        System.out.println(drink.cost());
    }

}
