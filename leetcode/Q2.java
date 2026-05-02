public class Q2 {
    
    public int residuePrefixes(String s) {

        if(s.charAt(0) == s.charAt(1)) {
            return 1;
        }

        return 2;
    }
}

