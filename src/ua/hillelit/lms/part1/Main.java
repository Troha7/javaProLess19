package ua.hillelit.lms.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    String[] arr = {"A", "B", "C"};
    System.out.println(toList(arr));

  }

  @SafeVarargs
  public static <T> List<T> toList(T... arr) {
    return new ArrayList<>(Arrays.asList(arr));
  }

}
