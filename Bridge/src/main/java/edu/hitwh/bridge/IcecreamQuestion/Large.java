package edu.hitwh.bridge.IcecreamQuestion;

public class Large extends CupSize{
    public Large(IceCream iceCream){
        this.setIceCream(iceCream);
    }
    public int cost(){
     return 3*this.getIceCream().cost();
    }
}
