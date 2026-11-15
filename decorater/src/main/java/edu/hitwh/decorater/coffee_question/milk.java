package edu.hitwh.decorater.coffee_question;

public class milk extends condiment {
    public milk(coffee cof) {
        this.setCoffee(cof);
    }
    @Override
    public int cost() {
        return 3+this.getCoffee().cost();
    }
}
