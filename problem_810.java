
public class problem_810 {

    public static void main(String[] args) {
        System.out.println(leftPad("Java", 6));

    }   
    
    public static String leftPad(String s, int n) {
        if (s == null) {
            return null;
        }
        int pads = n - s.length();
        if (pads <= 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < pads; i++) {
            sb.append(' ');
        }
        sb.append(s);
        return sb.toString();
    }
}

