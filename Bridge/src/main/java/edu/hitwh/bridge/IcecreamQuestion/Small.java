package edu.hitwh.bridge.IcecreamQuestion;

public class Small extends CupSize{
    public Small(IceCream iceCream){
        this.setIceCream(iceCream);
    }
    public int cost(){
        return 2*this.getIceCream().cost();
    }

}
