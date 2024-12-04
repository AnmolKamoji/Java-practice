import java.util.*;

public class StringsBuilders2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tanuj");
        System.err.println(sb);
        sb.insert(2, 'n');
        System.err.println(sb);
        // delete the extra 'n'
        sb.delete(2, 3);
        System.err.println(sb);
        sb.delete(4, 5);
        System.err.println(sb);
        sb.append("W");
        sb.append("e");
        sb.append("d");
        sb.append("s");
        sb.append("M");
        sb.append("a");
        sb.append("n");
        sb.append("u");
        System.err.println(sb);
        System.err.println(sb.length());
    }
}
