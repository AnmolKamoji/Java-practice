import java.util.*;

public class StringsBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tanuj");
        System.err.println(sb);

        System.err.println(sb.charAt(4));

        sb.setCharAt(4, 'P');

        System.err.println(sb);
    }

}
