package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); ++i) {
            if (Character.isUpperCase(input.charAt(i))) {
                sb.append((Character.toLowerCase(input.charAt(i))));
            } else if (Character.isLowerCase(input.charAt(i)))
                sb.append(Character.toUpperCase(input.charAt(i)));
            else
                sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
