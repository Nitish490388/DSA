import java.lang.StringBuilder;

public class SB {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    str.append("GFG");
    str.append("nit");
    str.insert(0, 'C');
    System.out.println(str);
  }

}
