package ua.hillelit.lms.part2.boxes;

import java.util.ArrayList;
import java.util.List;
import ua.hillelit.lms.part2.fruits.Fruit;

public class Box<T extends Fruit> {

  private final List<T> fruitBox = new ArrayList<>();

  public void add(T fruit) {
    fruitBox.add(fruit);
  }

  public void add(T fruit, int quantity) {
    for (int i = 0; i < quantity; i++) {
      fruitBox.add(fruit);
    }
  }

  public void viewAll() {
    System.out.println(fruitBox);
  }

  public Double getWeight() {
    Double sum = 0.0;
    for (T fruit : fruitBox) {
      sum += fruit.getWeight();
    }
    return sum;
  }

  public boolean compare(Box box) {
    return this.getWeight().equals(box.getWeight());
  }

  public void merge(Box<T> box) {
    this.fruitBox.addAll(box.fruitBox);
  }

}
