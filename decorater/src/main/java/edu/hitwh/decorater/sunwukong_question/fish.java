package edu.hitwh.decorater.sunwukong_question;

public class fish extends avatar{
    public fish(MonkeyKing monkeyKing) {
        this.setMonkeyKing(monkeyKing);
    }
    @Override
    public void describe() {
        this.getMonkeyKing().describe();
        System.out.println("-->fish");
    }
}
