package edu.hitwh.decorater.coffee_question;

public abstract class condiment implements coffee {
    private coffee cof;
    public coffee getCoffee() {
        return cof;
    }
    public void setCoffee(coffee cof) {
        this.cof = cof;
    }
    @Override
    public abstract int cost() ;

}
