package edu.hitwh.decorater;

import edu.hitwh.decorater.coffee_question.Decaf;
import edu.hitwh.decorater.coffee_question.Soy;
import edu.hitwh.decorater.coffee_question.coffee;
import edu.hitwh.decorater.coffee_question.milk;
import edu.hitwh.decorater.sunwukong_question.Monkey;
import edu.hitwh.decorater.sunwukong_question.MonkeyKing;
import edu.hitwh.decorater.sunwukong_question.eagle;
import edu.hitwh.decorater.sunwukong_question.fish;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoraterApplication {
    public static void main(String[] args) {
        coffee drink = new milk(new Soy(new Soy(new Decaf())));
        System.out.println(drink.cost());

        MonkeyKing king = new fish(new eagle(new Monkey()));
        king.describe();
    }

}
