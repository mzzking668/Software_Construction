package edu.hitwh.decorater.coffee_question;

public class Soy extends condiment {
    public  Soy(coffee cof) {
        this.setCoffee(cof);

    }

    @Override
    public int cost() {
        return 2+this.getCoffee().cost();
    }
}
