package edu.hitwh.decorater.sunwukong_question;

public abstract class avatar implements MonkeyKing {
    private MonkeyKing monkeyKing;

    public void setMonkeyKing(MonkeyKing monkeyKing) {
        this.monkeyKing = monkeyKing;
    }
    public MonkeyKing getMonkeyKing() {
        return monkeyKing;
    }

    @Override
    public abstract void describe() ;
}
