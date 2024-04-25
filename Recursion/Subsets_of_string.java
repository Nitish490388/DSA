package Recursion;
import java.util.ArrayList;
public class Subsets_of_string {
  public static void main(String[] args) {
    //System.out.println(print_subset("", "abc").toString()); 
    System.out.println(subseqAsciiRet("", "abc").toString());
  }

  static ArrayList<String> print_subset(String p, String up) {
    if(up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    char ch = up.charAt(0);

    ArrayList<String> left = print_subset(ch + p, up.substring(1));
    ArrayList<String> right = print_subset(p, up.substring(1));

    left.addAll(right);
    return left;
  }


  static ArrayList<String> subseqAsciiRet(String p, String up) {
    if (up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
    ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
    ArrayList<String> third = subseqAsciiRet(p + (ch + 0), up.substring(1));

    first.addAll(second);
    first.addAll(third);
    return first;
  }
}
