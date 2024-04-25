public class AddBinary {
  public static String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
      int sum = carry;
      if (i >= 0) {
        sum += a.charAt(i--) - '0';
      }
      if (j >= 0) {
        sum += b.charAt(j--) - '0';
      }
      result.insert(0, sum % 2);
      carry = sum / 2;
    }

    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(addBinary("1", "1"));
  }
}
