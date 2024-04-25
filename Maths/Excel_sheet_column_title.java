
public class Excel_sheet_column_title {
  public static void main(String[] args) {
    System.out.println(title(27));
  }

  
  static String title(int n) {
    String result = "";
    while(n>0) {
      char c = (char)('A' + (n-1) % 26);
      result = c + result;
      n = (n-1)/26;
    }
    return result;
  }
}
