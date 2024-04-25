package Bit_manipulation;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
  public static void main(String[] args) {
    System.out.println(readBinaryWatch(1).toString());
  }

  public static List<String> readBinaryWatch(int turnedOn) {
    ArrayList<String> list = new ArrayList<>();
    for (int hour = 0; hour < 12; hour++) {
      for (int minute = 0; minute < 60; minute++) {
        if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
          if (minute < 10) {
            list.add(String.format("%d:0%d", hour, minute));
          }else {
            list.add(String.format("%d:%d", hour, minute));
          }
        }
      }
    }
    return list;
  }
}
