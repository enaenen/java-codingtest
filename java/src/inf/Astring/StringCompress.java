package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String original = br.readLine() + " ";
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < original.length() - 1; ++i) {
            if (original.charAt(i) == original.charAt(i + 1)) {
                ++counter;
            } else {
                sb.append(original.charAt(i));
                if (1 < counter)
                    sb.append(counter);
                counter = 1;
            }
            System.out.println(sb);
        }
    }
}
