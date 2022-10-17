package ua.hillelit.lms.part2;

import ua.hillelit.lms.part2.boxes.Box;
import ua.hillelit.lms.part2.fruits.Apple;
import ua.hillelit.lms.part2.fruits.Orange;

public class Main {

  public static void main(String[] args) {

    Box<Apple> appleBox = new Box<>();
    appleBox.add(new Apple(50.5));
    appleBox.add(new Apple(45.5));
    appleBox.add(new Apple(40.0), 10);

    Box<Orange> orangeBox = new Box<>();
    orangeBox.add(new Orange(60.0));

    Box<Orange> newOrangeBox = new Box<>();
    newOrangeBox.add(new Orange(60.0), 2);

    appleBox.viewAll();

    System.out.println("Box weight: " + appleBox.getWeight() + "g");

    System.out.println(orangeBox.compare(newOrangeBox));

    orangeBox.merge(newOrangeBox);

    orangeBox.viewAll();

  }

}
