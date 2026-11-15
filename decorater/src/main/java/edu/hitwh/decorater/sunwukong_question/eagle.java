package edu.hitwh.decorater.sunwukong_question;

public class eagle extends avatar{
    public eagle(MonkeyKing monkeyKing){
        this.setMonkeyKing(monkeyKing);
    }

    @Override
    public void describe() {
      this.getMonkeyKing().describe();
      System.out.println("-->eagle");
    }
}
