package ua.hillelit.lms.part2.fruits;

public abstract class Fruit {

  private final Double weight;

  public Fruit(Double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" + weight + " g}";
  }

  public Double getWeight() {
    return weight;
  }

}
